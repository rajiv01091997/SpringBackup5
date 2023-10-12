package com.glo.service.impl;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.glo.entity.Book;
import com.glo.exceptions.ResourceNotFoundException;
import com.glo.payload.BookDto;
import com.glo.payload.BookResponse;
import com.glo.repository.BookRepository;
import com.glo.service.BookService;

@Service
public class ServiceImpl implements BookService {
     @Autowired
	private BookRepository bookRepository;
     
    Logger logger=LoggerFactory.getLogger(ServiceImpl.class);
	
 	Book bk=new Book();//for accessing static variable for counting number of books 
 	
 	@Autowired
 	private KafkaTemplate<String,String> kafkaTemplate;
 	
     public BookDto mapToDto(Book book)
     {
    	BookDto bookDto=new BookDto();
    	bookDto.setId(book.getId());
    	bookDto.setAuthor(book.getAuthor());
    	bookDto.setGenre(book.getGenre());
    	bookDto.setLanguage(book.getLanguage());
    	bookDto.setTitle(book.getTitle());
    	return bookDto;
     }
     
     
     public Book mapToEntity(BookDto bookDto)
     {
    	 Book book=new Book();
    	 book.setAuthor(bookDto.getAuthor());
    	 book.setGenre(bookDto.getGenre());
    	 book.setId(bookDto.getId());
    	 book.setLanguage(bookDto.getLanguage());
    	 book.setTitle(bookDto.getTitle());
    	 return book;
     }
	
	@Override
	public BookDto saveBook(BookDto bookDto) {
		
		Book book=mapToEntity(bookDto);
	     logger.info("Number of Books="+ bookRepository.count());
	     if(bookRepository.count()<8)
	     kafkaTemplate.send("Number-Of-Books","!!!!!!!!Still the Number of Books in Library are:"+String.valueOf( bookRepository.count())+"!!!!!!!!!!");
		return mapToDto(bookRepository.save(book));
		
	}

	@Override
	public BookDto updateBook(long id, BookDto bookDto) {
		
	Book book=bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","bookId", id));
	
	 book.setAuthor(bookDto.getAuthor());
	 book.setGenre(bookDto.getGenre());
	 book.setLanguage(bookDto.getLanguage());
	 book.setTitle(bookDto.getTitle());
		
	 return mapToDto(bookRepository.save(book));
		
	
	}

	@Override
	public BookDto getBookById(long id) {
	
		Book book=bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","bookId", id));
		return mapToDto(book);
	}
	
	
	@Override
	public BookResponse getBooks(int pageNo, int pageSize, String sortBy, String sortDir)
	{
//		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
		Sort sort = sortDir.equalsIgnoreCase("asc")?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
		
		Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
		
		Page<Book> all=bookRepository.findAll(pageable);
		
		List<BookDto> dtoList=all.getContent().stream().map(e->mapToDto(e)).collect(Collectors.toList());	
		
		BookResponse response=new BookResponse();
		response.setContent(dtoList);
		response.setLast(all.isLast());
		response.setPageNo(all.getNumber());
		response.setPageSize(all.getSize());
		response.setTotalElements(all.getNumberOfElements());
		response.setTotalPages(all.getTotalPages());
		return response;
		
	}



	@Override
	public List<BookDto> getAllBooks() {
		
	List<Book> list=bookRepository.findAll();
	
	List<BookDto> listDto=new ArrayList<>();
	
	for(Book book:list)
	{
		BookDto bookDto=mapToDto(book);
		listDto.add(bookDto);
	}
	
		return listDto;
	}


	@Override
	public String deleteById(long id) {
		Book book=bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","bookId", id));
		bookRepository.deleteById(id);
		
	    logger.info("Number of Books="+bookRepository.count());
	   
	   if( bookRepository.count()<8)
		   sendMessage();
		return "Deleted Book with id="+id;
	}
	
	//for producing message to kafka
	public boolean sendMessage()
	{
		kafkaTemplate.send("Number-Of-Books","!!!!!!!!Number of Books in Library are:"+String.valueOf(bookRepository.count())+"!!!!!!!!!!");
		logger.info("message produced by Kafka Producer");
		return true;
	}
	

}

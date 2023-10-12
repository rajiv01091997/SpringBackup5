package com.glo.service;

import java.util.List;

import com.glo.payload.BookDto;
import com.glo.payload.BookResponse;

public interface BookService {
	
	public BookDto saveBook(BookDto bookDto);
	public BookDto updateBook(long id,BookDto bookDto);
	public BookDto getBookById(long id);
	public List<BookDto> getAllBooks();
	public String deleteById(long id);
	BookResponse getBooks(int pageNo, int pageSize, String sortBy, String sortDir);
	

}

package com.glo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glo.payload.BookDto;
import com.glo.payload.BookResponse;
import com.glo.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<BookDto> saveBook(@Valid  @RequestBody BookDto bookDto)
	{
		
		return new ResponseEntity<BookDto>(bookService.saveBook(bookDto),HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<BookDto> updateBook(@PathVariable long id,@Valid @RequestBody BookDto bookDto)
	{
		return new ResponseEntity<BookDto>(bookService.updateBook(id, bookDto), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getBookById(@PathVariable long id)
	{
		return new ResponseEntity<BookDto>(bookService.getBookById(id), HttpStatus.OK);
	}
//	@GetMapping
//	public ResponseEntity<List<BookDto>> getAllBooks()
//	{
//		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
//	}
	
	@GetMapping
	public ResponseEntity<BookResponse> getAllBooks(
	        @RequestParam(value = "pageNo",defaultValue = "0",required = false) int pageNo,
	        @RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize,
	        @RequestParam(value = "sortBy",defaultValue = "id",required = false) String sortBy,
	        @RequestParam(value = "sortDir",defaultValue = "asc",required = false) String sortDir)
	{
		
	    BookResponse response = bookService.getBooks(pageNo, pageSize, sortBy, sortDir);
	    return new ResponseEntity<BookResponse>(response,HttpStatus.OK);

	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable long id)
	{
		return new ResponseEntity<String>(bookService.deleteById(id),HttpStatus.OK);
	}

}

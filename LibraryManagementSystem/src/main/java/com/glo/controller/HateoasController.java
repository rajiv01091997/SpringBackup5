package com.glo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glo.payload.BookResponse;
import com.glo.service.BookService;

@RestController
@RequestMapping("api/books/hateoas")
public class HateoasController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public ResponseEntity<EntityModel<BookResponse>> getAllBooks(
	        @RequestParam(value = "pageNo",defaultValue = "0",required = false) int pageNo,
	        @RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize,
	        @RequestParam(value = "sortBy",defaultValue = "id",required = false) String sortBy,
	        @RequestParam(value = "sortDir",defaultValue = "asc",required = false) String sortDir)
	{
		
	    BookResponse response = bookService.getBooks(pageNo, pageSize, sortBy, sortDir);
	    
	    EntityModel<BookResponse> bookResponseEntityModel=EntityModel.of(response);
	    
	    Link createBook=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).saveBook(null)).withRel("create-Book");
	    
	    Link updateBook=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).updateBook(1, null)).withRel("update-Book");
	    	
	    Link deleteBook=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).deleteById(1)).withRel("delete-Book");

	    bookResponseEntityModel.add(createBook,updateBook,deleteBook);
	    return new ResponseEntity<EntityModel<BookResponse>>(bookResponseEntityModel,HttpStatus.OK);
		
		}

	

}

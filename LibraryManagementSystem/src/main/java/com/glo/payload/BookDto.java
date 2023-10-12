package com.glo.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookDto {
	
	private long id;
	@NotBlank(message = "title cannot be blank or null")
	@Size(min = 5, message = "title size cannot be less than 5")
	private String title;
	@NotBlank(message = "language cannot be blank or null")
	private String language;
	@NotBlank(message = "genre cannot be blank or null")
	private String genre;
	@NotBlank(message = "author cannot be blank or null")
	private String author;

	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDto(long id, String title, String language, String genre, String author) {
		super();
		this.id = id;
		this.title = title;
		this.language = language;
		this.genre = genre;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", title=" + title + ", language=" + language + ", genre=" + genre + ", author=" + author
//				+ "]";
//	}
//


}

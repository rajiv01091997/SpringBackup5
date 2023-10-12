package com.glo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String title;
private String language;
private String genre;
private String author;



public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public Book(long id, String title, String language, String genre, String author) {
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





}

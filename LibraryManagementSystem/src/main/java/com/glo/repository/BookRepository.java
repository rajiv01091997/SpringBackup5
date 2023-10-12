package com.glo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glo.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

}

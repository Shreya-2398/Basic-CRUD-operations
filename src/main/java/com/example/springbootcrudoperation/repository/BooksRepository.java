package com.example.springbootcrudoperation.repository;


import com.example.springbootcrudoperation.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
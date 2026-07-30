package com.coforge.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.coforge.entities.Book;
import com.coforge.service.BookService;

import jakarta.validation.Valid;

//@Controller
//@ResponseBody
@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/books")
	public ResponseEntity< List<Book>> getAllBooks(){
		List<Book> bookList= service.getAllBooks();
		return ResponseEntity.status(HttpStatus.OK).body(bookList);
	}
	

	@PostMapping("/books")
	public  ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
		Book b= service.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(b);
	}
	
	
	@GetMapping("/books/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookId")  long bookId) {
		Book b= service.getBookById(bookId);
		return ResponseEntity.status(HttpStatus.OK)
				.body(b);
		
	}
	
	@PatchExchange("/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Long id,@RequestBody Book book) {
		Book b=service.updateBook(id,book);
		return ResponseEntity.ok(b);
		
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
		  service.deleteBook(id);
		  return ResponseEntity.ok("Book deleted");
	}
	
	@GetMapping("/books/author/{author}")
	public List<Book> findByAuthor(@PathVariable("author") String author){
		
		return service.findByAuthor(author);
	}

}

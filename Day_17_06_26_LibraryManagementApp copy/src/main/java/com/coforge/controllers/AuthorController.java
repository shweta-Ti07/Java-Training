package com.coforge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.enttities.Author;
import com.coforge.services.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService service;
	
	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		return service.addAuthor(author);
	
	}

}

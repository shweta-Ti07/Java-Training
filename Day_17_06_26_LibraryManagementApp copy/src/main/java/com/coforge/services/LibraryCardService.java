package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.enttities.LibraryCard;
import com.coforge.repositories.LibraryCardRepository;

@Service
public class LibraryCardService {
	
	@Autowired
	LibraryCardRepository repository;
	
	public List<LibraryCard> getAllCards() {
		return repository.findAll();
	}
	
	
	
	public LibraryCard addCard(LibraryCard card) {
		return repository.save(card);
	}

}

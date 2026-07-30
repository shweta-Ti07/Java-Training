package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.enttities.LibraryCard;

public interface LibraryCardRepository extends JpaRepository<LibraryCard, Integer> {

}

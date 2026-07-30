package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.enttities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

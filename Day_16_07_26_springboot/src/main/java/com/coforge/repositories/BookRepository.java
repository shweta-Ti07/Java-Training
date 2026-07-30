package com.coforge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
	
	//prefix findBy or getBy to the property name
//	List<Book> findByAuthor(String author);
	Book findByTitle(String titile);
	Book findByAuthorMobile(String auhtorMobile);
	
	
	//select * from book where title like 's%'
	
	//native queries
	//@Query(value="select * from book where author=?",nativeQuery = true)
	//jpql queries
	@Query(value="select b from Book b where author=:author")
	List<Book> getAllBooksByAuthorName(@Param("author") String author);

}

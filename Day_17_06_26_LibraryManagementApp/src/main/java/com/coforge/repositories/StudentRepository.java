package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.enttities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

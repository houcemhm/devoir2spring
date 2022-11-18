package com.houcem.books.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.houcem.books.entities.Author;

@RepositoryRestResource(path = "auth")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
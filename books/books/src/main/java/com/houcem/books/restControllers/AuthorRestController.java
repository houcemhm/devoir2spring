package com.houcem.books.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.houcem.books.entities.Author;
import com.houcem.books.entities.Book;
import com.houcem.books.repos.AuthorRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")

public class AuthorRestController {
	@Autowired
	AuthorRepository  authorRepository;
	@RequestMapping(method = RequestMethod.GET)
public List<Author> getAllAuthors(){
		return authorRepository.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
	public Author createBook(@RequestBody Author author) {
	return authorRepository.save(author);
	}
}

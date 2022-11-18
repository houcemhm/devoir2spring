package com.houcem.books.restControllers;

import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.houcem.books.entities.Book;
import com.houcem.books.service.BookService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookRESTController {
@Autowired
BookService bookService;
@RequestMapping(path ="all",method = RequestMethod.GET)
@JsonIgnore
@OneToMany(mappedBy = "author") 
public List<Book> getAllProduits() {
return bookService.getAllBooks();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Book getBookById(@PathVariable("id") Long id) {
return bookService.getBook(id);
 }
@RequestMapping(value="/findByTitle/{title}",method = RequestMethod.GET)
public List<Book> findBookByTitle(@PathVariable("title") String title) {
return bookService.findByTitleBook(title) ;
 }
@RequestMapping(method = RequestMethod.POST)
public Book createBook(@RequestBody Book Book) {
return bookService.saveBook(Book);
}
@RequestMapping(method = RequestMethod.PUT)
public Book updateBook(@RequestBody Book Book) {
return bookService.updateBook(Book);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteBook(@PathVariable("id") Long id)
{
bookService.deleteBooktById(id);
}
@RequestMapping(value="/booksauth/{idAuth}",method = RequestMethod.GET)
public List<Book> getBookByIdAuth(@PathVariable("idAuth") Long idAuth) {
return bookService.findByAuthorIdAuth(idAuth);
}


}
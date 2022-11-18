package com.houcem.books;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.houcem.books.entities.Author;
import com.houcem.books.entities.Book;


@SpringBootApplication
public class BooksApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	
@Override
    public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Book.class,Author.class);
}
	
	
	

}

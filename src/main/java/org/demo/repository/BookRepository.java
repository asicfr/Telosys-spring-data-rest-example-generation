/*
 * Created on 13 janv. 2014 ( Time 12:02:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.repository;

import org.demo.bean.Book ;

import org.springframework.data.repository.CrudRepository;

import org.demo.bean.Author;
import org.demo.bean.Publisher;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * Spring JPA Repository for Book
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

	@RestResource(rel="byAuthor", path="byAuthor")
	public List<Book> findByAuthor (
			@Param("author") Author author);

	@RestResource(rel="byPublisher", path="byPublisher")
	public List<Book> findByPublisher (
			@Param("publisher") Publisher publisher);


}
/*
 * Created on 13 janv. 2014 ( Time 12:02:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.repository;

import org.demo.bean.BookOrder ;

import org.springframework.data.repository.CrudRepository;

import org.demo.bean.Shop;
import org.demo.bean.Employee;
import org.demo.bean.Customer;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * Spring JPA Repository for BookOrder
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BookOrderRepository extends CrudRepository<BookOrder, Integer> {

	@RestResource(rel="byShop", path="byShop")
	public List<BookOrder> findByShop (
			@Param("shop") Shop shop);

	@RestResource(rel="byEmployee", path="byEmployee")
	public List<BookOrder> findByEmployee (
			@Param("employee") Employee employee);

	@RestResource(rel="byCustomer", path="byCustomer")
	public List<BookOrder> findByCustomer (
			@Param("customer") Customer customer);


}
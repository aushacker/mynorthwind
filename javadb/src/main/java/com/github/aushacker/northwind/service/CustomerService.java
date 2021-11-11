/**
 * 
 */
package com.github.aushacker.northwind.service;

import java.util.ArrayList;
import java.util.Collection;

import com.github.aushacker.northwind.jpa.Customer;

/**
 * @author aushacker
 */
public class CustomerService {

	public Collection<Customer> findAll() {
		return new ArrayList<Customer>();
	}

	public Customer findById(long id) {
		Customer c = new Customer();
		c.setFirstName("Red");
		c.setLastName("Hat");
		c.setCity("Canberra");

		return c;
	}

}

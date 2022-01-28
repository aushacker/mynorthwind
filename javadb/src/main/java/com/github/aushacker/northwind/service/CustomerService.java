/**
 * 
 */
package com.github.aushacker.northwind.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.github.aushacker.northwind.jpa.Customer;

/**
 * @author aushacker
 */
@RequestScoped
public class CustomerService {

	@Inject
	private EntityManager em;

	public Collection<Customer> findAll() {
		return em.createQuery("select c from Customer c", Customer.class).getResultList();
	}

	public Customer findById(long id) {
		return em.find(Customer.class, id);
	}

}

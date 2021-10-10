package com.github.aushacker.mynorthwind.jpa;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;
import org.junit.Test;

public class TestCustomer {

 	private static final String PERSISTENCE_UNIT_NAME = "nw1";

    @Test
    public void testCreate() {
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		Customer c = new Customer();
		c.setCompany("Acme Inc.");
		c.setFirstName("Wily");
		c.setLastName("Coyote");
		em.persist(c);
		em.getTransaction().commit();
		em.close();
    }
}

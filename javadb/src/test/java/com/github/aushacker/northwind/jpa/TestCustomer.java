package com.github.aushacker.northwind.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.github.aushacker.northwind.jpa.Customer;

import org.junit.Test;

public class TestCustomer extends AbstractPersistenceTest {

    private static final String PERSISTENCE_UNIT_NAME = "nw1";

    @Test
    public void testCreate() {
        Customer c = new Customer();
        c.setCompany("Acme Inc.");
        c.setFirstName("Wily");
        c.setLastName("Coyote");
        em.persist(c);
    }

    @Test
    public void testFind() {
        Customer c = em.find(Customer.class, 1L);
        assertEquals("Comany name incorrect", "Company A", c.getCompany());

        assertEquals("Order count incorrect", 2, c.getOrders().size());
    }
}

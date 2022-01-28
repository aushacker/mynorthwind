package com.github.aushacker.northwind.jpa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCustomer extends AbstractPersistenceTest {

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

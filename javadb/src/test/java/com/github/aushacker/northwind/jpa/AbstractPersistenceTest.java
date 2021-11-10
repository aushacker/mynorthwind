package com.github.aushacker.northwind.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public abstract class AbstractPersistenceTest {

    private static final String PERSISTENCE_UNIT_NAME = "nw1";

    protected EntityManagerFactory factory;

    protected EntityManager em;

    @Before
    public void setUp() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();

        em.getTransaction().begin();
    }

    @After
    public void tearDown() {
        em.getTransaction().rollback();
        em.close();
    }
}

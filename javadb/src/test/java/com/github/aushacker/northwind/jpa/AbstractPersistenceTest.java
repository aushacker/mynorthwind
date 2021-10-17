package com.github.aushacker.northwind.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

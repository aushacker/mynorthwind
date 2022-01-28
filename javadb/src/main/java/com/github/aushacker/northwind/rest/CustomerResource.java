package com.github.aushacker.northwind.rest;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.github.aushacker.northwind.jpa.Customer;
import com.github.aushacker.northwind.service.CustomerService;
import org.slf4j.Logger;

/**
 * @author aushacker
 */
@Path("/customers")
@RequestScoped
public class CustomerResource {

	@Inject
	private Logger logger;

	@Inject
	private CustomerService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response customers() {

		logger.debug("Entered customers()");
        try {
        	Collection<Customer> customers = service.findAll();
        	customers.forEach(c -> c.clearOrders());

		    return Response.ok(customers).build();
        }
        catch (Exception e) {
        	logger.error("Failed customers()", e);
        	return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
	}

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response customerById(@PathParam("id") long id) {

    	logger.debug("Entered customerById()");

    	Customer customer = null;

    	try {
            customer = service.findById(id);
    	}
    	catch (Exception e) {
        	logger.error("Failed customers()", e);
        	return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    	}

    	if (customer == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
        	customer.clearOrders();
            return Response.ok(customer).build();
        }
    }

}

package com.github.aushacker.northwind.jpa;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders_tax_status", schema="northwind")
public class OrderTaxStatus {

    @Id
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="tax_status_name", nullable=false, length=50)
    private String taxStatusName;

    // Relations
    @OneToMany(mappedBy="taxStatus")
    private Collection<Order> orders;

    public int getId() {
        return id;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }
}

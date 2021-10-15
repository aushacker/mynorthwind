package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders_tax_status", schema="northwind")
public class OrderTaxStatus {

    @Column(name="id", nullable=false)
    private Integer id;

    @Column(name="tax_status_name", nullable=false, length=50)
    private String taxStatusName;

    public Integer getId() {
        return id;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }
}

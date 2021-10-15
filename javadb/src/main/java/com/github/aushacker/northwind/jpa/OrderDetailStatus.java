package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details_status", schema="northwind")
public class OrderDetailStatus {

    @Column(name="id", nullable=false)
    private int id;

    @Column(name="status_name", nullable=false, length=50)
    private String statusName;

    public int getId() {
        return id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}

package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privileges", schema="northwind")
public class Privilege {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="privilege_name", length=50)
    private String privilegeName;

    public int getId() {
        return id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }
}

package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="strings", schema="northwind")
public class Strings {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="string_id", nullable=false)
    private int stringId;

    @Column(name="string_data", length=255)
    private String stringData;

    public String getStringData() {
        return stringData;
    }

    public int getStringId() {
        return stringId;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public void setStringId(int stringId) {
        this.stringId = stringId;
    }
}

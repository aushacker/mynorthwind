package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory_transaction_types", schema="northwind")
public class InventoryTransactionType {

	@Id
    @Column(name="id", nullable=false)
    private Integer id;

    @Column(name="type_name", nullable=false, length=50)
    private String typeName;

    public Integer getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

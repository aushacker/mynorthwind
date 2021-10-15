package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products", schema="northwind")
public class Product {

    @Column(name="supplier_ids", length=715827882)
    private String supplierIds;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="product_code", length=25)
    private String productCode;

    @Column(name="product_name", length=50)
    private String productName;

    @Column(name="description", length=715827882)
    private String description;

    @Column(name="standard_cost")
    private BigDecimal standardCost;

    @Column(name="list_price", nullable=false)
    private BigDecimal listPrice;

    @Column(name="reorder_level")
    private int reorderLevel;

    @Column(name="target_level")
    private int targetLevel;

    @Column(name="quantity_per_unit", length=50)
    private String quantityPerUnit;

    @Column(name="discontinued", nullable=false)
    private Boolean discontinued;

    @Column(name="minimum_reorder_quantity")
    private int minimumReorderQuantity;

    @Column(name="category", length=50)
    private String category;

    @Column(name="attachments")
    private byte[] attachments;

    public byte[] getAttachments() {
        return attachments;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public int getMinimumReorderQuantity() {
        return minimumReorderQuantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public BigDecimal getStandardCost() {
        return standardCost;
    }

    public String getSupplierIds() {
        return supplierIds;
    }

    public int getTargetLevel() {
        return targetLevel;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public void setMinimumReorderQuantity(int minimumReorderQuantity) {
        this.minimumReorderQuantity = minimumReorderQuantity;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public void setSupplierIds(String supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setTargetLevel(int targetLevel) {
        this.targetLevel = targetLevel;
    }
}

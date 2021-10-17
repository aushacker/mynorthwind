package com.github.aushacker.northwind.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory_transactions", schema="northwind")
public class InventoryTransaction {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="transaction_type", nullable=false)
    private Integer transactionType;

    @Column(name="transaction_created_date")
    private LocalDateTime transactionCreatedDate;

    @Column(name="transaction_modified_date")
    private LocalDateTime transactionModifiedDate;

    @Column(name="product_id", nullable=false)
    private int productId;

    @Column(name="quantity", nullable=false)
    private int quantity;

    @Column(name="purchase_order_id")
    private int purchaseOrderId;

    @Column(name="customer_order_id")
    private int customerOrderId;

    @Column(name="comments", length=255)
    private String comments;

    public String getComments() {
        return comments;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public int getId() {
        return id;
    }

    public int getProductId() {
        return productId;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public LocalDateTime getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTransactionCreatedDate(LocalDateTime transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public void setTransactionModifiedDate(LocalDateTime transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }
}

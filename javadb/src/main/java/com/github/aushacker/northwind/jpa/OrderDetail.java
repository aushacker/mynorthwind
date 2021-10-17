package com.github.aushacker.northwind.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details", schema="northwind")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="order_id", nullable=false)
    private int orderId;

    @Column(name="product_id")
    private int productId;

    @Column(name="quantity", nullable=false)
    private BigDecimal quantity;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="discount", nullable=false)
    private Double discount;

    @Column(name="status_id")
    private int statusId;

    @Column(name="date_allocated")
    private LocalDateTime dateAllocated;

    @Column(name="purchase_order_id")
    private int purchaseOrderId;

    @Column(name="inventory_id")
    private int inventoryId;

    public LocalDateTime getDateAllocated() {
        return dateAllocated;
    }

    public Double getDiscount() {
        return discount;
    }

    public int getId() {
        return id;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public int getStatusId() {
        return statusId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setDateAllocated(LocalDateTime dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}

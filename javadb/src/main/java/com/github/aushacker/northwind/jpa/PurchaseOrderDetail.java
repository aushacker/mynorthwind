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
@Table(name="purchase_order_details", schema="northwind")
public class PurchaseOrderDetail {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="purchase_order_id", nullable=false)
    private int purchaseOrderId;

    @Column(name="product_id")
    private int productId;

    @Column(name="quantity", nullable=false)
    private BigDecimal quantity;

    @Column(name="unit_cost", nullable=false)
    private BigDecimal unitCost;

    @Column(name="date_received")
    private LocalDateTime dateReceived;

    @Column(name="posted_to_inventory", nullable=false)
    private Boolean postedToInventory;

    @Column(name="inventory_id")
    private int inventoryId;

    public LocalDateTime getDateReceived() {
        return dateReceived;
    }

    public int getId() {
        return id;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public Boolean getPostedToInventory() {
        return postedToInventory;
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

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setDateReceived(LocalDateTime dateReceived) {
        this.dateReceived = dateReceived;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setPostedToInventory(Boolean postedToInventory) {
        this.postedToInventory = postedToInventory;
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

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
}

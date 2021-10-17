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
@Table(name="purchase_orders", schema="northwind")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="supplier_id")
    private int supplierId;

    @Column(name="created_by")
    private int createdBy;

    @Column(name="submitted_date")
    private LocalDateTime submittedDate;

    @Column(name="creation_date")
    private LocalDateTime creationDate;

    @Column(name="status_id")
    private int statusId;

    @Column(name="expected_date")
    private LocalDateTime expectedDate;

    @Column(name="shipping_fee", nullable=false)
    private BigDecimal shippingFee;

    @Column(name="taxes", nullable=false)
    private BigDecimal taxes;

    @Column(name="payment_date")
    private LocalDateTime paymentDate;

    @Column(name="payment_amount")
    private BigDecimal paymentAmount;

    @Column(name="payment_method", length=50)
    private String paymentMethod;

    @Column(name="notes", length=715827882)
    private String notes;

    @Column(name="approved_by")
    private int approvedBy;

    @Column(name="approved_date")
    private LocalDateTime approvedDate;

    @Column(name="submitted_by")
    private int submittedBy;

    public int getApprovedBy() {
        return approvedBy;
    }

    public LocalDateTime getApprovedDate() {
        return approvedDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getExpectedDate() {
        return expectedDate;
    }

    public int getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public int getStatusId() {
        return statusId;
    }

    public int getSubmittedBy() {
        return submittedBy;
    }

    public LocalDateTime getSubmittedDate() {
        return submittedDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public void setApprovedDate(LocalDateTime approvedDate) {
        this.approvedDate = approvedDate;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setExpectedDate(LocalDateTime expectedDate) {
        this.expectedDate = expectedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setSubmittedBy(int submittedBy) {
        this.submittedBy = submittedBy;
    }

    public void setSubmittedDate(LocalDateTime submittedDate) {
        this.submittedDate = submittedDate;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }
}

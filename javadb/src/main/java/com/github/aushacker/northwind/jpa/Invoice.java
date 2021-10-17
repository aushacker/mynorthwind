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
@Table(name="invoices", schema="northwind")
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="order_id")
    private int orderId;

    @Column(name="invoice_date")
    private LocalDateTime invoiceDate;

    @Column(name="due_date")
    private LocalDateTime dueDate;

    @Column(name="tax")
    private BigDecimal tax;

    @Column(name="shipping")
    private BigDecimal shipping;

    @Column(name="amount_due")
    private BigDecimal amountDue;

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
}

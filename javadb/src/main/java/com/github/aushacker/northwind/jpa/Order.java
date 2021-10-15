package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders", schema="northwind")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="employee_id")
    private int employeeId;

    @Column(name="customer_id")
    private int customerId;

    @Column(name="order_date")
    private LocalDateTime orderDate;

    @Column(name="shipped_date")
    private LocalDateTime shippedDate;

    @Column(name="shipper_id")
    private int shipperId;

    @Column(name="ship_name", length=50)
    private String shipName;

    @Column(name="ship_address", length=715827882)
    private String shipAddress;

    @Column(name="ship_city", length=50)
    private String shipCity;

    @Column(name="ship_state_province", length=50)
    private String shipStateProvince;

    @Column(name="ship_zip_postal_code", length=50)
    private String shipZipPostalCode;

    @Column(name="ship_country_region", length=50)
    private String shipCountryRegion;

    @Column(name="shipping_fee")
    private BigDecimal shippingFee;

    @Column(name="taxes")
    private BigDecimal taxes;

    @Column(name="payment_type", length=50)
    private String paymentType;

    @Column(name="paid_date")
    private LocalDateTime paidDate;

    @Column(name="notes", length=715827882)
    private String notes;

    @Column(name="tax_rate")
    private Double taxRate;

    @Column(name="tax_status_id")
    private Integer taxStatusId;

    @Column(name="status_id")
    private Integer statusId;

    public int getCustomerId() {
        return customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipCountryRegion() {
        return shipCountryRegion;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipStateProvince() {
        return shipStateProvince;
    }

    public String getShipZipPostalCode() {
        return shipZipPostalCode;
    }

    public LocalDateTime getShippedDate() {
        return shippedDate;
    }

    public int getShipperId() {
        return shipperId;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public Integer getTaxStatusId() {
        return taxStatusId;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public void setShippedDate(LocalDateTime shippedDate) {
        this.shippedDate = shippedDate;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public void setTaxStatusId(Integer taxStatusId) {
        this.taxStatusId = taxStatusId;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }
}

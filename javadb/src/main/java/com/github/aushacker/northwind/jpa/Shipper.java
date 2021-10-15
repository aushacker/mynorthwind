package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shippers", schema="northwind")
public class Shipper {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="company", length=50)
    private String company;

    @Column(name="last_name", length=50)
    private String lastName;

    @Column(name="first_name", length=50)
    private String firstName;

    @Column(name="email_address", length=50)
    private String emailAddress;

    @Column(name="job_title", length=50)
    private String jobTitle;

    @Column(name="business_phone", length=25)
    private String businessPhone;

    @Column(name="home_phone", length=25)
    private String homePhone;

    @Column(name="mobile_phone", length=25)
    private String mobilePhone;

    @Column(name="fax_number", length=25)
    private String faxNumber;

    @Column(name="address", length=715827882)
    private String address;

    @Column(name="city", length=50)
    private String city;

    @Column(name="state_province", length=50)
    private String stateProvince;

    @Column(name="zip_postal_code", length=15)
    private String zipPostalCode;

    @Column(name="country_region", length=50)
    private String countryRegion;

    @Column(name="web_page", length=715827882)
    private String webPage;

    @Column(name="notes", length=715827882)
    private String notes;

    @Column(name="attachments")
    private byte[] attachments;

    public String getAddress() {
        return address;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public String getCity() {
        return city;
    }

    public String getCompany() {
        return company;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getNotes() {
        return notes;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getWebPage() {
        return webPage;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }
}

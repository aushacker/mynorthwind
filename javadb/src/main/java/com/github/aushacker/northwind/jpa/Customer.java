package com.github.aushacker.northwind.jpa;

import static javax.persistence.FetchType.LAZY;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers", schema="northwind")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private long id;

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

    @Column(name="address", columnDefinition="LONGTEXT")
    private String address;

    @Column(name="city", length=50)
    private String city;

    @Column(name="state_province", length=50)
    private String stateProvince;

    @Column(name="zip_postal_code", length=15)
    private String zipPostalCode;

    @Column(name="country_region", length=50)
    private String countryRegion;

    @Basic(fetch=LAZY)
    @Lob
    @Column(name="web_page", columnDefinition="LONGTEXT")
    private String webPage;

    @Basic(fetch=LAZY)
    @Lob
    @Column(name="notes", columnDefinition="LONGTEXT")
    private String notes;

    @Basic(fetch=LAZY)
    @Lob
    @Column(name="attachments", columnDefinition="LONGBLOB")
    private byte[] attachments;

    // Relations
    @OneToMany(mappedBy="customer")
    private Collection<Order> orders;

    public void clearOrders() {
    	orders = new ArrayList<>();
    }

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

    public long getId() {
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

    public Collection<Order> getOrders() {
        return orders;
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

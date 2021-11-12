package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sales_reports", schema="northwind")
public class SalesReport {

    @Column(name="group_by", nullable=false, length=50)
    private String groupBy;

    @Column(name="display", length=50)
    private String display;

    @Column(name="title", length=50)
    private String title;

    @Column(name="filter_row_source", length=715827882)
    private String filterRowSource;

    @Column(name="default", nullable=false)
    private Boolean reportDefault;

    public String getDisplay() {
        return display;
    }

    public String getFilterRowSource() {
        return filterRowSource;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public Boolean getReportDefault() {
        return reportDefault;
    }

    public String getTitle() {
        return title;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setFilterRowSource(String filterRowSource) {
        this.filterRowSource = filterRowSource;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public void setReportDefault(Boolean reportDefault) {
        this.reportDefault = reportDefault;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

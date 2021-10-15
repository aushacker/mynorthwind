package com.github.aushacker.northwind.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_privileges", schema="northwind")
public class EmployeePrivilege {

    @Column(name="employee_id", nullable=false)
    private int employeeId;

    @Column(name="privilege_id", nullable=false)
    private int privilegeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }
}

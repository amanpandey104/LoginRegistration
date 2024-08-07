package com.loginregistration.loginregistration.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int employeeId;

    @Column(name = "employee_name", length = 255)
    private String emplyeeName;

    @Column(name = "employee_email", length = 255)
    private String employeeEmail;

    @Column(name = "employee_password", length = 255)
    private String employeePassword;

    public Employee(int employeeId, String emplyeeName, String employeeEmail, String employeePassword) {
        this.employeeId = employeeId;
        this.emplyeeName = emplyeeName;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
    }

    public Employee() {  //empty constructor
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmplyeeName() {
        return emplyeeName;
    }

    public void setEmplyeeName(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public String toString() {
        return "Employee { employeeId=" + employeeId + ", emplyeeName=" + emplyeeName + ", employeeEmail="
                + employeeEmail + ", employeePassword=" + employeePassword + "}";
    }
    
    
}

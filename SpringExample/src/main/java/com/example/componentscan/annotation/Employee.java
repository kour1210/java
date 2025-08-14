package com.example.componentscan.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// This annotation help this class to register as a bean itself.
// We are not using <bean> tag rather we are using  <context:component-scan base-package="com.example.componentscan"/>
//SO the scanning process in the package mentioned will search for class with @Component and register it with name "employee"
//the names must match here and xml file

@Component("employee")
public class Employee {
    private int employeeId;

    @Value("Hello")
    private String firstName;

    @Value("${java.home}")
    private String lastName;

    @Value("#{4*4}")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
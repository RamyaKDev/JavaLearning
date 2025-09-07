package com.shristi.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {

private String empName;
private double salary;
private Address address;

public Address getAddress() {
	return address;
}
//add
@Autowired
public void setAddress(Address address) {
	this.address = address;
}
public String getEmpName() {
	return empName;
}
@Value("${employee.empName}")
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
@Value("${employee.salary}")
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", salary=" + salary + ", address=" + address + "]";
}
}

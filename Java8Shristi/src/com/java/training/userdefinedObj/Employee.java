package com.java.training.userdefinedObj;

public class Employee {
	String empName;
	int empId;
	double salary;
	String dept;
	String city;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empName, int empId, double salary, String dept, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", city="
				+ city + "]";
	}
	
}

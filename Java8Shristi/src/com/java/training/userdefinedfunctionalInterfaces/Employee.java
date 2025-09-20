package com.java.training.userdefinedfunctionalInterfaces;

public class Employee {
	private String empName;
	private double salary;
	private Integer empId;
	private String city;

	public Employee(String empName, double salary, Integer empId, String city) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", empId=" + empId + ", city=" + city + "]";
	}

	public Employee() {
		super();
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

package com.example.model;

public class Employee {

	private int EmployeeId;
	private String EmployeeName;
	private String Dept;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String dept) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Dept = dept;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

}

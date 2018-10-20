package com.cg.employee.dto;

public class Employee {
private int employeeId;
private String employeeName;
private String employeeMobNo;
private String employeeProject;
private double employeeSalary;
public String getEmployeeProject() {
	return employeeProject;
}
public void setEmployeeProject(String employeeProject) {
	this.employeeProject = employeeProject;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeMobNo() {
	return employeeMobNo;
}
public void setEmployeeMobNo(String employeeMobNo) {
	this.employeeMobNo = employeeMobNo;
}
}

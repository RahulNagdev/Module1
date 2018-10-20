package com.cg.employee.dao;

import java.util.ArrayList;

import com.cg.employee.dto.Employee;


public interface EmployeeDAO {
	public int addEmployee(Employee employee);
	public Employee getEmployee(int eid);
	public Employee updateEmployee(Employee employee);
	public ArrayList<Employee> getEmployeeList(String employeeProject);

}

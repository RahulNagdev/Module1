package com.cg.employee.service;

import java.util.ArrayList;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;

public interface EmployeeService {
	public int addEmployee(Employee employee);
	public Employee getEmployee(int eid);
	public Employee updateEmployee(Employee employee);
	public ArrayList<Employee> getEmployeeList(String employeeProject);
	
	public Employee ValidateDetails(Employee emp)throws EmployeeException;
	public boolean validateEmployeeName(String name) throws EmployeeException;
	public boolean validateEmployeeMobNo(String mob) throws EmployeeException;
    public boolean validateSalary(Double salary) throws EmployeeException;
    public boolean validateProjectName(String project) throws EmployeeException;
    
}

package com.cg.employee.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.employee.dao.EmployeeDAO;
import com.cg.employee.dao.EmployeeDAOImpl;
import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;


public class EmployeeServiceImpl implements EmployeeService {

EmployeeDAO dao;
    public EmployeeServiceImpl(){
     dao = new EmployeeDAOImpl();
    }
    public int addEmployee(Employee employee){
        int ei=dao.addEmployee(employee);
        return ei;
    }

    @Override
    public Employee getEmployee(int eid) {
        // TODO Auto-generated method stub
        return dao.getEmployee(eid);
}

    @Override
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return dao.updateEmployee(employee);
            }

    @Override
    public ArrayList<Employee> getEmployeeList(String employeeProject) {
        // TODO Auto-generated method stub
        return dao.getEmployeeList(employeeProject);
    }
    
    @Override
    public Employee ValidateDetails(Employee emp) throws EmployeeException {

            if(validateEmployeeName(emp.getEmployeeName()) && validateEmployeeMobNo(emp.getEmployeeMobNo())  && validateSalary(emp.getEmployeeSalary()) && validateProjectName(emp.getEmployeeProject()) )
                return emp;
            else
                return null;
    }


	public boolean validateEmployeeName(String name) throws EmployeeException {
		 if(name==null)
	            throw new EmployeeException("Name can not be null");
	        Pattern pat = Pattern.compile("[A-Z][a-z]{3,12}");
	        Matcher mat= pat.matcher(name);
	        return mat.matches();
	    }
	@Override
	public boolean validateEmployeeMobNo(String mob) throws EmployeeException {
        Pattern pat = Pattern.compile("[0-9]{10}");
        Matcher mat= pat.matcher(mob);
        return mat.matches();
    }
    public boolean validateSalary(Double salary) throws EmployeeException{
        String sal= salary.toString();
        return (sal.matches("\\d{4,9}\\.\\d{0,4}"));
    }
    public boolean validateProjectName(String project) throws EmployeeException {
        Pattern pat = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher mat= pat.matcher(project);
        return mat.matches();
    }


}

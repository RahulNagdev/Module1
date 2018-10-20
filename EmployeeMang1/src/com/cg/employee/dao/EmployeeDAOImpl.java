package com.cg.employee.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.cg.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Map<Integer,Employee>employeeMap;
	public EmployeeDAOImpl(){
		employeeMap = DataContainer.createCollection();
	}
		public int addEmployee(Employee employee) {
			int employeeid=(int)(10000*Math.random());
			employee.setEmployeeId(employeeid);
			employeeMap.put(employeeid, employee);
			
			return employeeid;
		}
	@Override
	public Employee getEmployee(int eid) {
		Employee employee= employeeMap.get(eid);
		return employee;
}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeMap.put(employee.getEmployeeId(), employee);
		return employee;
}

	@Override
	public ArrayList<Employee> getEmployeeList(String employeeProject) {
		// TODO Auto-generated method stub
		Collection<Employee> empList = employeeMap.values();
		ArrayList<Employee> employees=new ArrayList<>();
		
		for(Employee e : empList){
			if(e.getEmployeeProject().equals(employeeProject)){
				employees.add(e);
			}
		}
		return employees;
		}

}

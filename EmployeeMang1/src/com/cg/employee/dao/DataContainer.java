package com.cg.employee.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.employee.dto.Employee;

public class DataContainer {
		private static Map<Integer,Employee> employees;
	public static Map<Integer,Employee> createCollection(){
		if(employees==null)
			employees=new HashMap<>();
		return employees;
		
	}}

package com.cg.employee.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class TestClass {

	@Test(expected=EmployeeException.class)
	public void test_ValidateName_null() throws EmployeeException{
		EmployeeService service=new EmployeeServiceImpl();
		service.validateEmployeeName(null);
	}
	
	@Test
	public void test_validateName_v1() throws EmployeeException{
	
		String name="Aete121";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeName(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateName_v2() throws EmployeeException{
	
		String name="Amita";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeName(name);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateName_v3() throws EmployeeException{
	
		String name="amita";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeName(name);
		Assert.assertEquals(false,result);
	}
	@Test(expected=EmployeeException.class)
	public void test_ValidateMobNo_null() throws EmployeeException{
		EmployeeService service=new EmployeeServiceImpl();
		service.validateEmployeeMobNo(null);
	}
	
	@Test
	public void test_validateMobNo_v1() throws EmployeeException{
	
		String mobNo="ABCD91828288";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeMobNo(mobNo);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateMobNo_v2() throws EmployeeException{
	
		String mobNo="9922974725";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeMobNo(mobNo);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateMobNo_v3() throws EmployeeException{
	
		String mobNo="992297";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeMobNo(mobNo);
		Assert.assertEquals(false,result);
	}
	
	@Test(expected=EmployeeException.class)
	public void test_ValidateProjectName_null() throws EmployeeException{
		EmployeeService service=new EmployeeServiceImpl();
		service.validateEmployeeName(null);
	}
	
	@Test
	public void test_validateProjectName_v1() throws EmployeeException{
	
		String pname="Aete121";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateProjectName(pname);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateProjectName_v2() throws EmployeeException{
	
		String pname="Amita";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateProjectName(pname);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateProjectName_v3() throws EmployeeException{
	
		String pname="amita";
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateEmployeeName(pname);
		Assert.assertEquals(false,result);
	}
	@Test(expected=EmployeeException.class)
	public void test_ValidateSalary_null() throws EmployeeException{
		EmployeeService service=new EmployeeServiceImpl();
		service.validateSalary(null);
	}
	
	@Test
	public void test_validateSalary_v1() throws EmployeeException{
	
		double salary=45.000;
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateSalary(salary);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateSalary_v2() throws EmployeeException{
	
		double salary=4444.4444;
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateSalary(salary);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateSalary_v3() throws EmployeeException{
	
	double salary=4555555555.45;
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateSalary(salary);
		Assert.assertEquals(false,result);
	}

	
	
}

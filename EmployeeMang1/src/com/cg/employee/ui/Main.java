package com.cg.employee.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class Main {
    public static void main(String args[]) throws EmployeeException{
        EmployeeService service=new EmployeeServiceImpl();
        Employee employee;
        int ch=0;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("1. Add Employee ");
        System.out.println("2. Display Employee Details");
        System.out.println("3. Update Details");
        System.out.println("4. Display Employee List based on Project");
        System.out.println("5. Exit");
        System.out.println("Enter Your Choice");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
            
            do{
            System.out.println("Enter Employee Name :");
            String name=sc.next();
            System.out.println("Enter Employee MobileNo: ");
            String mob=sc.next();
            System.out.println("Enter Employee Salary: ");
            double salary=sc.nextDouble();
            System.out.println("Enter Employee Project: ");
            String proj=sc.next();  
            employee = new Employee();
            employee.setEmployeeName(name);
            employee.setEmployeeMobNo(mob);
            employee.setEmployeeSalary(salary);
            employee.setEmployeeProject(proj);
                if( service.ValidateDetails(employee)!=null)
                    break;
                else
                    System.out.println("Invalid details entered...");
            }while(true);
                int id = service.addEmployee(employee);
                System.out.println("Employee added..."+id);
            break;
        
        case 2:
            System.out.println("Enter Employee Id : ");
            int eid=sc.nextInt();
            employee=service.getEmployee(eid);
            if(employee==null)
                System.err.println("Record Not Found");
            else{
                System.out.println("Name: " + employee.getEmployeeName());
                System.out.println("Mobile number: " + employee.getEmployeeMobNo());
                System.out.println("Salary: " + employee.getEmployeeSalary());
                System.out.println("Project: " + employee.getEmployeeProject());
            }
        break;
        
        case 3: 
            System.out.println("Enter EmployeeId: ");
            eid=sc.nextInt();
            employee=service.getEmployee(eid);
            do{
            if(employee==null)
                System.err.println("Record Not Found");
            else{
                System.out.println("Enter New Mobile No");
                String mob=sc.next();
                
                    if(service.validateEmployeeMobNo(mob)){
                        employee.setEmployeeMobNo(mob);
                        employee=service.updateEmployee(employee);
                        System.out.println("Record Updated");
                        System.out.println(employee.getEmployeeName());
                        System.out.println(employee.getEmployeeMobNo());
                        break;
                }
                    else{
                        System.out.println("Invalid input");
                }
                }
            }while(true);
        break;
        
        case 4:
            System.out.println("Enter Employee Project");
            String proj=sc.next();
            ArrayList<Employee> list=service.getEmployeeList(proj);
            if(list.size()==0)
                System.out.println("No Student enrolled to this Course");
            else{
                for(Employee s:list){
                    System.out.println(s.getEmployeeName()+" "+s.getEmployeeMobNo());
                }
            }break;
        }
        }
        
        while(ch!=5);
        System.out.println("Application closed");
    
    }}
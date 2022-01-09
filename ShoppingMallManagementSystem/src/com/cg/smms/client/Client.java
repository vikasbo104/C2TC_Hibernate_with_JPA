package com.cg.smms.client;


import java.time.LocalDate;

import com.cg.smms.entities.Employee;
import com.cg.smms.service.EmployeeService;
import com.cg.smms.service.IEmployeeService;

public class Client {

	public static void main(String[] args) 
	{

		//Debug this program as Debug -> Debug as Java Application
		
		IEmployeeService service = new EmployeeService();
		
	
		Employee employee = new Employee();
		
		 // Create Operation
		employee.setId(100);
		employee.setName("Vikas");
		employee.setDob(LocalDate.of( 1994 , 1 , 10 ));
		employee.setSalary(1000);
		employee.setAddress("Mumbai");
		employee.setDesignation("Lead");
		
		service.addEmployee(employee);
		
		
	
		
		
		/*
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName()); // Sachin
	
		 
		// Update Operation
		student = service.findStudentById(100);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());  // Sachin Tendulkar
		/*
	
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");  
	
	*/
		

	}
}

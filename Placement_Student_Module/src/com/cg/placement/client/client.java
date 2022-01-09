package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Student student = new Student();
		
		IStudentService service = new StudentServiceImpl();
		
		student.setId(104);
		student.setName("Rohit Sharma");
		student.setRoll(19);
		student.setQualification("CS");
		student.setCourse("ISE");
		student.setYear(2015);
		student.setCertificate("CR");
		student.setHallTicketNo(111);
		student.setCollege("Delhi University");
		service.addStudent(student);
		
		// Retrieve
		/*
		student	= service.searchStudentById(100);
		System.out.println("ID is:"+student.getId());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		
		*/
		  
		//
		/*
		// Update
		student	= service.searchStudentById(100);
		student.setCollege("Mumbai University");
		service.updateStudent(student);
		System.out.println("Update is successful");
		*/
		/*
		
		student	= service.searchStudentById(101);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		
		
		student	= service.searchStudentByHallTicket(111);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		*/
		
		
	}

}

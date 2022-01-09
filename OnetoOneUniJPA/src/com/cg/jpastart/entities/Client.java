package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Amit");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharastra");
		homeAddress.setZipCode("411 011");
		
		// Inject address to student table ??
		student.setAddress(homeAddress);
		
		// persist
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
	}

}

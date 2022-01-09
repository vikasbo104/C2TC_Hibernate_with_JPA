package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client 
{
	public static void main(String[] args)
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create dept
		Department department = new Department();
		department.setId(10);
		department.setName("C2TC");
		
		Department department1 = new Department();
		department1.setId(11);
		department1.setName("C2C");
		
		// Create instances Employees
		Employee e1 = new Employee();
		e1.setName("priyanka");
		e1.setSalary(450);
		
		Employee e2 = new Employee();
		e2.setName("vikas");
		e2.setSalary(1150);
		
		Employee e3 = new Employee();
		e3.setName("Avijit");
		e3.setSalary(550);
		
		
		
		// Association emp to dept
		department.addEmployee(e1);
		department.addEmployee(e2);
		department1.addEmployee(e3);
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added dept and added employees to the dB");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}

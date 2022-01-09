package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.Employee;

public class EmployeeRepository implements IEmployeeRepository

{

	private EntityManager entityManager;
	
	public EmployeeRepository() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee employee) 
	{
		entityManager.persist(employee);
	}

	@Override
	public void updateEmployee(Employee employee)
	{
		entityManager.merge(employee);
		
	}

	@Override
	public Employee searchEmployee(long id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
		
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		entityManager.remove(employee);
		return employee;
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
	
	}



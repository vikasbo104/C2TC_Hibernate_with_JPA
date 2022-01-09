package com.cg.smms.repository;

import com.cg.smms.entities.Employee;

public interface IEmployeeRepository {
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee searchEmployee(long id);
	
	public void beginTransaction();
	public void commitTransaction();
	Employee deleteEmployee(Employee employee);
}

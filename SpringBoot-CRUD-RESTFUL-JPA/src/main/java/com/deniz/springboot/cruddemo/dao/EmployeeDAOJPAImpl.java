package com.deniz.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deniz.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO{

	// define field for entitymanager
	
	private EntityManager entityManager;
	
	// set up constructor injection
	
	@Autowired
	public EmployeeDAOJPAImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {
		
		Query query = entityManager.createQuery("from Employee");
		
		List<Employee> employees = query.getResultList();
				
		return employees;

	}


	@Override
	public Employee findById(int id) {
		
		Employee employee = entityManager.find(Employee.class, id);
		
		return employee;
		
	}


	@Override
	public void save(Employee employee) {
		
		Employee emp = entityManager.merge(employee);
		
		employee.setId(emp.getId());
		
	}


	@Override
	public void deleteById(int id) {
		
		Query query = entityManager.createQuery("delete from Employee  where id=:employeeId");
		
		query.setParameter("employeeId", id);
		
		query.executeUpdate();
		
	}

	
}

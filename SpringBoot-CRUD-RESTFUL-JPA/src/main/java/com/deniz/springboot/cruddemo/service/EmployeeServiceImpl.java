package com.deniz.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deniz.springboot.cruddemo.dao.EmployeeDAO;
import com.deniz.springboot.cruddemo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJPAImpl")  EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Transactional
	@Override
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
		
	}

	
	@Transactional
	@Override
	public Employee findById(int id) {
		
		return employeeDAO.findById(id);
				
	}

	
	@Transactional
	@Override
	public void save(Employee employee) {
		
		employeeDAO.save(employee);
		
	}

	
	@Transactional
	@Override
	public void deleteById(int id) {
		
		employeeDAO.deleteById(id);
		
	}

}

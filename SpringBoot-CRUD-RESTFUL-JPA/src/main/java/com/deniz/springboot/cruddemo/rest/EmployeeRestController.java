package com.deniz.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deniz.springboot.cruddemo.dao.EmployeeDAO;
import com.deniz.springboot.cruddemo.entity.Employee;
import com.deniz.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	

	// inject employee dao (use constructor injection)
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		
		return employeeService.findAll();
	}

	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee employee = employeeService.findById(employeeId);
		
		if(employee==null) {
			throw new RuntimeException("Employee id  not found :" + employeeId);
		}
		
		
		return employee;
		
	}
	
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee){
		
		employee.setId(0);
		
		employeeService.save(employee);
		
		return employee;
		
	}
	
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		employeeService.save(employee);
		
		return employee;
	}
	
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee employee = employeeService.findById(employeeId);
		
		if(employee==null) {
			throw new RuntimeException("Employee id not found : " +employeeId);
			
		}
		
		 employeeService.deleteById(employeeId);
		 
		 return "Employee id deleted : " +employeeId;
		
	}
	

}

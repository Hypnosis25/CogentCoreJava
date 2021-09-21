package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

	
}
public class EmployeeService {

	private static EmployeeService employeeService;
	
	private EmployeeService() {}
	private static EmployeeService getInstance() {
		if(employee==null) {
			employeeRepository = new EmployeeRepository();
			return employeeRepository;
		}
		return employeeRepository;
	}
	EmployeeRepository employeeRepository = EmployeeRepository.getInstance(); 
	
	public String addEmployee (Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
}

package com.cogent.employeemanagementsystems;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;


public class Main {
	
	
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		Employee employee = new Employee("ab00", "abhi", "Chivate", 123.0f, "PA");
				
			String result = employeeService.addEmployee(employee);
		
		System.out.println(result);
	}
	
	EmployeeService employeeService = new EmployeeService();
	EmployeeService.getEmployeeById
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
}

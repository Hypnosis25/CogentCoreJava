package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

		private String employeeId;
		private String firstName;
		private String lastName;
		private float empSalary;
		private String address;
		
		public Employee () {
			this.employeeId = "";
		}
//		public Employee(String employeeId, String firstName, String lastName, float empSalary) {
//			super();
//			this.employeeId = employeeId;
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.empSalary = empSalary; 
//			//one example on how to generate contructors(Source generate constructors using field)
//		}
		
		

		//setter methods
		//toretrieve the value
		//we need getter methods	
}

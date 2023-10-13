package com.sica.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sica.employee.entity.EmployeeEntity;
import com.sica.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeEntity entity) {
		return service.addEmployee(entity);
	}
	@GetMapping("/getEmployeeDetails")
	public List<EmployeeEntity> getEmployeeDetails(){
		return service.getEmployeeDetails();
	}
	@GetMapping("/getEmployeeById")
	public Optional<EmployeeEntity> getEmployeeById(@RequestParam int id) {
		return service.getEmployeeById(id);
		
	}
	@GetMapping("/getEmployeeByDesignation")
	public List<EmployeeEntity> getEmployeeByDesignation(@RequestParam String designation) {
		return service.getEmployeeByDesignation(designation);
		
	}
	@GetMapping("/getEmployeeByDesignationAndSalary")
	public List<EmployeeEntity> getEmployeeByDesignationAndSalary(@RequestParam String designation,@RequestParam double salary) {
		return service.getEmployeeByDesignationAndSalary(designation,salary);
		
	}
	@DeleteMapping("/deleteEmployeeById")
	public String deleteEmployeeById(@RequestParam int id) {
		return service.deleteEmployeeById(id);
		
	}
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody EmployeeEntity entity) {
		return service.updateEmployee(entity);
	}

}

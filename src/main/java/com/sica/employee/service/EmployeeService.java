package com.sica.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sica.employee.entity.EmployeeEntity;
import com.sica.employee.entity.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public String addEmployee(EmployeeEntity empentity) {
		//repository.save(employee);
		repository.save(empentity);
		return " you have been added Successfully";
		
	}
	public List<EmployeeEntity> getEmployeeDetails(){
	return repository.findAll();
		
	}
	public Optional<EmployeeEntity> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	public List<EmployeeEntity> getEmployeeByDesignation(String designation) {
		// TODO Auto-generated method stub
		return repository.findByDesignation(designation) ;
	}
	public List<EmployeeEntity> getEmployeeByDesignationAndSalary(String designation, double salary) {
		// TODO Auto-generated method stub
		return repository.findByDesignationAndSalary(designation, salary);
	}
	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Record has been deleted";
	}
	public String updateEmployee(EmployeeEntity entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		return " you have been updated Successfully";
	}
	
	

}

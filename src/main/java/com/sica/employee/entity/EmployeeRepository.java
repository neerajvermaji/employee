package com.sica.employee.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	public List<EmployeeEntity> findByDesignation(String designation);
	public List<EmployeeEntity> findByDesignationAndSalary(String designation,double salary);


}

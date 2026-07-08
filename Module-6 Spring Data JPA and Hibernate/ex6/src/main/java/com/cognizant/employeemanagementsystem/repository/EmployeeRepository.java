package com.cognizant.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
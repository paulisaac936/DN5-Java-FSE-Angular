package com.cognizant.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/insert")
    public String insertEmployee() {

        Employee e1 = new Employee();

        e1.setName("Paul");
        e1.setEmail("paul@gmail.com");

        employeeRepository.save(e1);

        return "Employee Inserted Successfully";
    }

}
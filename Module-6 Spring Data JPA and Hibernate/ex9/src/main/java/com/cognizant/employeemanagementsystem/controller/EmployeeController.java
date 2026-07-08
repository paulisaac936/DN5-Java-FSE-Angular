package com.cognizant.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/insert")
    public String insert(){

        Employee e=new Employee();

        e.setName("Paul");
        e.setEmail("paul@gmail.com");

        repository.save(e);

        return "Inserted Successfully";
    }

}
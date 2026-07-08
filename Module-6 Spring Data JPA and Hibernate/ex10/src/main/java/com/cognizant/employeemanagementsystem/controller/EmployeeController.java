package com.cognizant.employeemanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/batch")
    public String batchInsert(){

        List<Employee> list=new ArrayList<>();

        list.add(new Employee(null,"Paul","paul@gmail.com"));
        list.add(new Employee(null,"David","david@gmail.com"));
        list.add(new Employee(null,"John","john@gmail.com"));
        list.add(new Employee(null,"Kevin","kevin@gmail.com"));
        list.add(new Employee(null,"Sam","sam@gmail.com"));

        repository.saveAll(list);

        return "Batch Insert Completed";

    }

}
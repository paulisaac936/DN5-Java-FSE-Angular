package com.example.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ems.entity.Employee;
import com.example.ems.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee employee){

        return service.saveEmployee(employee);

    }

    @GetMapping
    public List<Employee> getAll(){

        return service.getAllEmployees();

    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id){

        return service.getEmployee(id);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){

        service.deleteEmployee(id);

        return "Employee Deleted";

    }

}
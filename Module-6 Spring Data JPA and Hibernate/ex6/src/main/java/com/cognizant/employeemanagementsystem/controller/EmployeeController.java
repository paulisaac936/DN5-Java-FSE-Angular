package com.cognizant.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/page")
    public Page<Employee> getEmployees(
            @RequestParam int page,
            @RequestParam int size) {

        return employeeService.getEmployees(page, size);

    }

    @GetMapping("/sort")
    public Page<Employee> getEmployeesSorted(

            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        return employeeService.getEmployeesSorted(
                page,
                size,
                field);

    }

}
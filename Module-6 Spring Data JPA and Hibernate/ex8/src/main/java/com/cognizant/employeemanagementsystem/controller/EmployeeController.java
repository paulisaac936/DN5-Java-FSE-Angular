package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/interface")
    public List<EmployeeView> interfaceProjection(){

        return employeeRepository.findBy();

    }

    @GetMapping("/class")
    public List<EmployeeDTO> classProjection(){

        return employeeRepository.getEmployeeDTO();

    }

}
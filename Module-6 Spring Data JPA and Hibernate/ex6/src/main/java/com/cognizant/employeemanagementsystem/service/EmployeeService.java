package com.cognizant.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> getEmployees(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return employeeRepository.findAll(pageable);

    }

    public Page<Employee> getEmployeesSorted(int page,
                                             int size,
                                             String field) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(field)
        );

        return employeeRepository.findAll(pageable);

    }

}
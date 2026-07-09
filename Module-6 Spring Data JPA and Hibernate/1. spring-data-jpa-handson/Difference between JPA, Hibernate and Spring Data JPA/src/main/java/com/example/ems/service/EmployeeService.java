package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Transactional
    public Employee saveEmployee(Employee employee){

        return repository.save(employee);

    }

    public List<Employee> getAllEmployees(){

        return repository.findAll();

    }

    public Employee getEmployee(Integer id){

        return repository.findById(id).orElse(null);

    }

    @Transactional
    public void deleteEmployee(Integer id){

        repository.deleteById(id);

    }

}
package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public List<Employee> getEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

    public Employee getEmployeeByEmail(String email){
        return employeeRepository.getEmployeeByEmail(email);
    }

    public List<Employee> getEmployeeByDepartment(String dept){
        return employeeRepository.getEmployeesByDepartment(dept);
    }

}
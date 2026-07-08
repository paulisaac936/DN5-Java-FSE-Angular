package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Deleted Successfully";
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email){
        return employeeService.getEmployeeByEmail(email);
    }

    @GetMapping("/department/{dept}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String dept){
        return employeeService.getEmployeeByDepartment(dept);
    }

}
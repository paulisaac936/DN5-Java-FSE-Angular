package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.employeemanagementsystem.model.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeDTO;
import com.cognizant.employeemanagementsystem.projection.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    // Interface Projection
    List<EmployeeView> findBy();

    // Class Projection
    @Query("""
        SELECT new com.cognizant.employeemanagementsystem.projection.EmployeeDTO(
        e.name,
        e.email)
        FROM Employee e
        """)
    List<EmployeeDTO> getEmployeeDTO();

}
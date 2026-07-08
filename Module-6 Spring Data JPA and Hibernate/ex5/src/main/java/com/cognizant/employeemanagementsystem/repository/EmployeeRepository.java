package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    // Derived Query Methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByNameEndingWith(String suffix);

    // JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.email=:email")
    Employee getEmployeeByEmail(@Param("email") String email);

    @Query("SELECT e FROM Employee e WHERE e.department.name=:dept")
    List<Employee> getEmployeesByDepartment(@Param("dept") String dept);

}
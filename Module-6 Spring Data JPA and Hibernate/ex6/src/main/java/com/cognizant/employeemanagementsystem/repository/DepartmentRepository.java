package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeemanagementsystem.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

    List<Department> findByName(String name);

}
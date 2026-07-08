package com.cognizant.employeemanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employee")

@NamedQueries({
    @NamedQuery(
        name="Employee.findByEmployeeName",
        query="SELECT e FROM Employee e WHERE e.name=:name"
    ),
    @NamedQuery(
        name="Employee.findByEmployeeEmail",
        query="SELECT e FROM Employee e WHERE e.email=:email"
    )
})

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

}
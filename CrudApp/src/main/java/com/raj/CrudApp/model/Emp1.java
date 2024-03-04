package com.raj.CrudApp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Employee_Details")
public class Emp1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private  Long empId;
    private String empName;
    private Integer empAge;

}

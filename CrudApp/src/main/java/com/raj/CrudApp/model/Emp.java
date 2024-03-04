package com.raj.CrudApp.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
@Data
@Entity
@Table(name="Employee")
public class Emp {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="emp_id")
//    private Long empId;
//    @Column(name="emp_name",nullable = false)
//    private String empName;
//    @Column(name="emp_salary")
//    private String empSalary;
//    @Column(name="emp_age")
//    private Integer empAge;
//    private String emp_city;
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="emp_id")
    private  Long empId;
    private String empName;
    private String address;
    //oneToOne
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id",referencedColumnName = "id")
    private Profile profile;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id",referencedColumnName = "id")
     private Department department;
    //onetomany
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_id")
    private List<Task>task;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project>project;

}

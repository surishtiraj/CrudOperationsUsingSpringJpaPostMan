package com.raj.CrudApp.controller;

import com.raj.CrudApp.model.Emp;
import com.raj.CrudApp.service.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Emp")
@CrossOrigin
public class EmpController {
    @Autowired
    EmpServices empServices;
    //Add employee
    @PostMapping("/employee")
    public Emp addEmployee(@RequestBody Emp emp){
        return empServices.insertEmployee(emp);
    }
    //all data of employees
    @GetMapping("/employee")
    public List<Emp>getAllData(){
        return empServices.getAllEmployee();
    }
    //get single employee
    @GetMapping("/employee/{empId}")
    public Optional<Emp> getEmployee(@PathVariable("empId") Long empId){
        return empServices.getById(empId);
    }
    @PutMapping("/employee")
    public Emp updateEmployee(@RequestBody Emp emp){
        return empServices.insertEmployee(emp);
    }
    //delete employee
    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable("empId") Long empId){
         empServices.deleteEmployeeById(empId);
         return "Deleted";
    }
}

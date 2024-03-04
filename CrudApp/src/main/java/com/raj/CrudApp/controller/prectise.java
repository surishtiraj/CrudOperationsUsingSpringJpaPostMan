package com.raj.CrudApp.controller;

import com.raj.CrudApp.model.Emp1;
import com.raj.CrudApp.service.Emp2Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/request")
public class prectise {
    @Autowired
    Emp2Services emp2Services;
    //post
    @PostMapping("/employee")
    public Emp1 insert(@RequestBody Emp1 emp1){
        return emp2Services.addEmployee(emp1);
    }
    //get
    @GetMapping("/employee")
    public List<Emp1> getAll(){
       return emp2Services.getAllEmployee();
    }
    @GetMapping("employee/{empid}")
    public Optional<Emp1> getByid(@PathVariable("empid") Long empid){
        return emp2Services.getById(empid);
    }
    @PutMapping("/employee")
    public Emp1 update(@RequestBody Emp1 emp1){
        return emp2Services.addEmployee(emp1);
    }
}

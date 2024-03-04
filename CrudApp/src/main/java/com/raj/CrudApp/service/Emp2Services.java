package com.raj.CrudApp.service;

import com.raj.CrudApp.model.Emp1;
import com.raj.CrudApp.repository.Employee2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Emp2Services {
    @Autowired
    Employee2Repository employee2Repository;
    //add employee
    public Emp1 addEmployee(Emp1 emp){
      return  employee2Repository.save(emp);
    }
    //get employees
    public List<Emp1> getAllEmployee(){
        return employee2Repository.findAll();
    }
    //get employee by id
    public Optional<Emp1> getById(Long empid)
    {
       return employee2Repository.findById(empid);
    }
    //delete  by id
    public void deleteById(Long empid){
         employee2Repository.deleteById(empid);
    }
}

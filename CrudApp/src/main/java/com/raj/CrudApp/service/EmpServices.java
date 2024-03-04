package com.raj.CrudApp.service;

import com.raj.CrudApp.model.Emp;
import com.raj.CrudApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServices {
    @Autowired
    EmployeeRepository employeeRepository;
    //insert Employee
    public Emp insertEmployee(Emp emp)
    {
         return employeeRepository.save(emp);
    }
    //get All employee
    public List<Emp> getAllEmployee(){
        return employeeRepository.findAll();
    }
    //get Employee by Id
    public Optional<Emp> getById(Long empId){
        return employeeRepository.findById(empId);
    }
    //delete Employee
    public void deleteEmployeeById(Long empId){
        employeeRepository.deleteById(empId);
    }

}

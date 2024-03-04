//package com.raj.CrudApp.controller;
//
//import com.raj.CrudApp.model.Emp;
////import com.raj.CrudApp.model.Emp1;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeController {
//    @Autowired
//    EmployeeRespository employeeRespository;
//    @PostMapping("/employees")
//    public  String createNewEmployee(@RequestBody Emp employee){
//        employeeRespository.save(employee);
//        return "Success";
//    }
//    @PostMapping("/Employee1")
//    public String createEmployee(@RequestBody Emp employee){
//        employeeRespository.save(employee);
//        return "success";
//    }
//    @GetMapping("/employees")
//    public ResponseEntity<List<Emp>> getAllEmoloyees(){
//        List<Emp>empList=new ArrayList<>();
//        employeeRespository.findAll().forEach(empList::add);
//        return new ResponseEntity<List<Emp>>(empList, HttpStatus.OK);
//    }
//    @GetMapping("/employees/{empid}")
//    public ResponseEntity<Emp>getById(@PathVariable("empid") Long empid){
//        Optional<Emp>emp=employeeRespository.findById(empid);
//        if(emp.isPresent()){
//            return new ResponseEntity<Emp>(emp.get(),HttpStatus.FOUND);
//        }else{
//            return new ResponseEntity<Emp>(HttpStatus.NOT_FOUND);
//        }
//    }
////    @PutMapping("/employees/{empid}")
////    public String updateEmployeeById(@PathVariable("empid") Long empid,@RequestBody Emp employee){
////       Optional<Emp>emp= employeeRespository.findById(empid);
////       if(emp.isPresent()){
////           Emp empExist=emp.get();
////           empExist.setEmpAge(employee.getEmpAge());
////           empExist.setEmp_city(employee.getEmp_city());
////           empExist.setEmpName(employee.getEmpName());
////           empExist.setEmpSalary(employee.getEmpSalary());
////           employeeRespository.save(empExist);
////           return "Updated";
////       }else{
////           return "Employee doest exist"+empid;
////       }
////    }
//    @DeleteMapping("employees/{empid}")
//    public  String deleteEmpById(@PathVariable("empid") Long empid){
//        employeeRespository.deleteById(empid);
//        return "deleted";
//    }
//}

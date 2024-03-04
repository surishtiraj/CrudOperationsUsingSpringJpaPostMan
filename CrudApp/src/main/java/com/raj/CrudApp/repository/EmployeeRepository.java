package com.raj.CrudApp.repository;

import com.raj.CrudApp.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Emp,Long> {
}

package com.cg.EmployeeManagementSystemWebAppin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.EmployeeManagementSystemWebAppin.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

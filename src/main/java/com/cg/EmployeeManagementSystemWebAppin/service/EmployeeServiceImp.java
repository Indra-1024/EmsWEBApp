package com.cg.EmployeeManagementSystemWebAppin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.EmployeeManagementSystemWebAppin.entity.Employee;
import com.cg.EmployeeManagementSystemWebAppin.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        repo.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}

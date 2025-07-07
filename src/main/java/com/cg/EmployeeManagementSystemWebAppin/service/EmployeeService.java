package com.cg.EmployeeManagementSystemWebAppin.service;

import java.util.List;
import com.cg.EmployeeManagementSystemWebAppin.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteById(int id);
}

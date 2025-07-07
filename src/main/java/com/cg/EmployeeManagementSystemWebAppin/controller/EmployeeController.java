package com.cg.EmployeeManagementSystemWebAppin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cg.EmployeeManagementSystemWebAppin.entity.Employee;
import com.cg.EmployeeManagementSystemWebAppin.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", service.getAllEmployees());
        return "list";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/showFormUpdate/{id}")
    public String showFormUpdate(@PathVariable int id, Model model) {
        Employee emp = service.getEmployeeById(id);
        model.addAttribute("employee", emp);
        return "edit";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteById(id);
        return "redirect:/";
    }
}

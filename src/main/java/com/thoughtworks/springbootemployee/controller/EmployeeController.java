package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping()
    public Employee searchEmployeeById(@RequestParam int id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping()
    public List<Employee> searchEmployeeByName(@RequestParam String name) {
        return null;
    }

    @GetMapping()
    public List<Employee> searchEmployeeByAge(@RequestParam int age) {
        return null;
    }

    @GetMapping()
    public List<Employee> searchEmployeeByGender(@RequestParam String gender) {
        return null;
    }

    @PostMapping
    public void addEmployee(@RequestParam Employee employee) {

    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam(name = "id") int id) {

    }

    @PutMapping
    public void changeEmployeeName(@RequestParam(name = "id") int id, @RequestParam(name = "name") String name) {

    }

    @PutMapping
    public void changeEmployeeAge(@RequestParam(name = "id") int id, @RequestParam(name = "age") String age) {

    }

    @PutMapping
    public void changeEmployeeGender(@RequestParam(name = "id") int id, @RequestParam(name = "gender") String gender) {

    }

}

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

    @GetMapping(path = "/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/searchEmployeeById")
    @ResponseBody
    public Employee searchEmployeeById(@RequestParam int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/searchEmployeesByName")
    @ResponseBody
    public List<Employee> searchEmployeesByName(@RequestParam String name) {
        return employeeService.getEmployeesByName(name);
    }

    @GetMapping(path = "/searchEmployeesByAge")
      @ResponseBody
    public List<Employee> searchEmployeesByAge(@RequestParam int age) {
        return employeeService.getEmployeesByAge(age);
    }

    @GetMapping(path = "/searchEmployeesByGender")
    @ResponseBody
    public List<Employee> searchEmployeesByGender(@RequestParam String gender) {
        return employeeService.getEmployeesByGender(gender);
    }

    @PostMapping(path = "/addEmployee", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @DeleteMapping(path = "/deleteEmployee")
    public void deleteEmployee(@RequestParam int id) {
        employeeService.deleteEmployee(id);
    }

//    @PutMapping
//    public void changeEmployeeName(@RequestParam(name = "id") int id, @RequestParam(name = "name") String name) {
//
//    }
//
//    @PutMapping
//    public void changeEmployeeAge(@RequestParam(name = "id") int id, @RequestParam(name = "age") String age) {
//
//    }
//
//    @PutMapping
//    public void changeEmployeeGender(@RequestParam(name = "id") int id, @RequestParam(name = "gender") String gender) {
//
//    }

}

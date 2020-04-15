package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    public List<Employee> getEmployeesByName(String name) {
        return employees.stream().filter(employee -> employee.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Employee> getEmployeesByAge(int age) {
        return employees.stream().filter(employee -> employee.getAge() == age).collect(Collectors.toList());
    }

    public List<Employee> getEmployeesByGender(String gender) {
        return employees.stream().filter(employee -> employee.getGender().equals(gender)).collect(Collectors.toList());
    }
}

package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void changeEmployeeName(int id, String name) {
        Objects.requireNonNull(employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null)).setName(name);
    }

    public void changeEmployeeAge(int id, int age) {
        Objects.requireNonNull(employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null)).setAge(age);
    }

    public void changeEmployeeGender(int id, String gender) {
        Objects.requireNonNull(employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null)).setGender(gender);
    }
}

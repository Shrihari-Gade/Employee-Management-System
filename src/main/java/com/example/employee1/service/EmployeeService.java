package com.example.employee1.service;

import java.util.List;

import com.example.employee1.model.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);
    
    Employee updateEmployee(Long id, Employee employee);
}

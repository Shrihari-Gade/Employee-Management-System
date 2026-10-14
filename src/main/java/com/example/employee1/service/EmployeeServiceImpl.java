package com.example.employee1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee1.model.Employee;
import com.example.employee1.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with id: " + id));

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());

        return repo.save(existingEmployee);
    }
}

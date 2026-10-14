package com.example.employee1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.example.employeemanager.service;

import com.example.employeemanager.dto.EmployeeRequest;
import com.example.employeemanager.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();

    Employee findEmployeeById(Long id);

    Employee addEmployee(EmployeeRequest employeeRequest);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}

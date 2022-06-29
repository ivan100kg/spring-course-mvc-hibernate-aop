package io.github.ivan100kg.spring.mvc_hibernate_aop.dao;

import io.github.ivan100kg.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}

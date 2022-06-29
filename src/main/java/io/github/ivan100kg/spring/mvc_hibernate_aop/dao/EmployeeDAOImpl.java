package io.github.ivan100kg.spring.mvc_hibernate_aop.dao;

import io.github.ivan100kg.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}

package com.openclassrooms.api.services;

import com.openclassrooms.api.models.Employee;

import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getEmployee(final Long id);

    Iterable<Employee> getEmployees();

    void deleteEmployee(final Long id);

    Employee saveEmployee(Employee employee);

}

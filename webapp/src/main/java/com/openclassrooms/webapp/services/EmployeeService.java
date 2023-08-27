package com.openclassrooms.webapp.services;


import com.openclassrooms.webapp.models.entity.Employee;
import com.openclassrooms.webapp.repositories.EmployeeProxy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeProxy employeeProxy;

    public EmployeeService(EmployeeProxy employeeProxy) {
        this.employeeProxy = employeeProxy;
    }

    public Employee getEmployee(final int id) {
        return employeeProxy.getEmployee(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeProxy.getEmployees();
    }

    public void deleteEmployee(final int id) {
        employeeProxy.deleteEmployee(id);;
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee;

        // Règle de gestion : Le nom de famille doit être mis en majuscule.
        employee.setLastName(employee.getLastName().toUpperCase());

        if(employee.getId() == null) {
            // Si l'id est nul, alors c'est un nouvel employé.
            savedEmployee = employeeProxy.createEmployee(employee);
        } else {
            savedEmployee = employeeProxy.updateEmployee(employee);
        }

        return savedEmployee;
    }
}

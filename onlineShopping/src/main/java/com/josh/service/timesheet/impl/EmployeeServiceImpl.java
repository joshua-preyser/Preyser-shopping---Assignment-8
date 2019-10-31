package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.service.timesheet.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl repository = null;
    private Set<Employee> e;

    private EmployeeServiceImpl() {
        this.e = new HashSet<>();
    }

    private Employee findEmployee(String employeeId) {
        return this.e.stream().filter(e -> e.getId().trim().equals(employeeId)).findAny()
                .orElse(null);
    }

    public static EmployeeServiceImpl getService() {
        if (service == null)
            service = new EmployeeServiceImpl();
        return service;

}

    @Override
    public Employee create(Employee employee) {
        this.e.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee toUpdate = findEmployee(employee.getId());
        if (toUpdate != null) {
            this.e.remove(toUpdate);
            return create(employee);
        }
        return null;
    }

    @Override
    public void delete(String employeeId) {
        Employee employee = findEmployee(employeeId);
        if (employee != null)
            this.e.remove(employee);
    }

    @Override
    public Employee read(final String employeeId) {
        Employee employee = findEmployee(employeeId);
        return employee;
    }

    @Override
    public Set<Employee> getAll() {

        return this.e;
    }
}
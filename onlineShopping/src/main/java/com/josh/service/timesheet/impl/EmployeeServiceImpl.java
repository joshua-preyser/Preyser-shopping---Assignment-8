package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.repository.timesheet.EmployeeRepository;
import com.josh.repository.timesheet.impl.EmployeeRepositoryImpl;
import com.josh.service.timesheet.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl repository = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl() {
        this.repository = EmployeeRepository.getRepository();
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
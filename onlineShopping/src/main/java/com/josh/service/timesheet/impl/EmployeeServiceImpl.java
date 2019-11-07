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
<<<<<<< HEAD
        this.repository = EmployeeRepository.getRepository();
    }

    public static EmployeeServiceImpl getService() {
        if (service == null)
            service = new EmployeeServiceImpl();
=======
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}

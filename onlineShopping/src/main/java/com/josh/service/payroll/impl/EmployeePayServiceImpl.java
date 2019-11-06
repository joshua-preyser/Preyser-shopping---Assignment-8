package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.service.payroll.EmployeePayService;

public class EmployeePayServiceImpl implements EmployeePayService {
    private static EmployeePayServiceImpl service = null;
    private EmployeePayRepository repository;

    private EmployeePayServiceImpl() {
        this.repository = EmployeePayRepositoryImpl.getRepository();
    }

    public static EmployeePayServiceImpl getService(){
        if (service == null) service = new EmployeePayServiceImpl();
        return service;
    }

    @Override
    public EmployeePay create(EmployeePay pay) {
        return this.repository.create(pay);
    }

    @Override
    public EmployeePay update(EmployeePay pay) {
        return this.repository.update(pay);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeePay read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<EmployeePay> getAll() {
        return this.repository.getAll();
    }
}

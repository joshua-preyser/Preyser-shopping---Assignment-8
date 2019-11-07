package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.repository.payroll.EmployeePayRepository;
import com.josh.repository.payroll.impl.EmployeePayRepositoryImpl;
import com.josh.service.payroll.EmployeePayService;

public class EmployeePayServiceImpl implements EmployeePayService {
    private static EmployeePayServiceImpl service = null;
    private EmployeePayRepository repository;

    private EmployeePayServiceImpl() {
<<<<<<< HEAD
        this.repository = EmployeePayRepository.getRepository();
    }

=======
        this.repository = EmployeePayRepositoryImpl.getRepository();
    }

    public static EmployeePayServiceImpl getService(){
        if (service == null) service = new EmployeePayServiceImpl();
        return service;
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634

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

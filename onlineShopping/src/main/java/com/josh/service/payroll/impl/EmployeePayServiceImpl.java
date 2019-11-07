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
        this.repository = EmployeePayRepository.getRepository();
    }


    public static EmployeePayServiceImpl getService() {
        if (service == null)
            service = new EmployeePayServiceImpl();
        return Service;

}

    @Override
    public EmployeePay create(EmployeePay employeePay) {
        this.eP.add(employeePay);
        return employeePay;
    }

    @Override
    public EmployeePay update(EmployeePay employeePay) {
        EmployeePay toUpdate = findEmployeePay(employeePay.getId());
        if (toUpdate != null) {
            this.eP.remove(toUpdate);
            return create(employeePay);
        }
        return null;
    }

    @Override
    public void delete(String employeePayId) {
        EmployeePay employeePay = findEmployeePay(employeePayId);
        if (employeePayt != null)
            this.eP.remove(employeePay);
    }

    @Override
    public EmployeePay read(final String employeePayId) {
        EmployeePay employeePay = findEmployeePay(employeePayId);
        return employeePay;
    }

    @Override
    public Set<EmployeePay> getAll() {

        return this.eP;
    }
}
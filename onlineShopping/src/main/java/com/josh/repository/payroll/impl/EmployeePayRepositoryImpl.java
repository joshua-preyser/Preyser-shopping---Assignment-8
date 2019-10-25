package com.josh.repository.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.repository.payroll.EmployeePayRepository;

public class EmployeePayRepositoryImpl implements EmployeePayRepository {
    private static EmployeePayRepositoryImpl repository = null;
    private Set<EmployeePay> eP;

    private EmployeePayRepositoryImpl() {
        this.eP = new HashSet<>();
    }

    private EmployeePay findEmployeePay(String employeePayId) {
        return this.eP.stream().filter(eP -> eP.getId().trim().equals(employeePayId)).findAny()
                .orElse(null);
    }

    public static EmployeePayRepositoryImpl getRepository() {
        if (repository == null)
            repository = new EmployeePayRepositoryImpl();
        return repository;

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
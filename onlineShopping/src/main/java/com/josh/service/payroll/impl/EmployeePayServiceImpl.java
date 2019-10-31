package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.service.payroll.EmployeePayService;

public class EmployeePayServiceImpl implements EmployeePayService {
    private static EmployeePayServiceImpl service = null;
    private Set<EmployeePay> eP;

    private EmployeePayServiceImpl() {
        this.eP = new HashSet<>();
    }

    private EmployeePay findEmployeePay(String employeePayId) {
        return this.eP.stream().filter(eP -> eP.getId().trim().equals(employeePayId)).findAny()
                .orElse(null);
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
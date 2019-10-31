package com.josh.service.payroll;

import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.service.IService;

public interface EmployeePayService extends IService<EmployeePay, String>
{
Set<EmployeePay> getAll();
}
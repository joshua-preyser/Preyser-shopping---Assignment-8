package com.josh.repository.payroll;

import java.util.Set;

import com.josh.domain.payroll.EmployeePay;
import com.josh.repository.IRepository;

public interface EmployeePayRepository extends IRepository<EmployeePay, String>
{
Set<EmployeePay> getAll();
}
package com.josh.repository.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.repository.IRepository;

public interface EmployeeRepository extends IRepository<Employee, String>
{
Set<Employee> getAll();
}
package com.josh.service.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.service.IService;

public interface EmployeeService extends IService<Employee, String>
{
Set<Employee> getAll();
}
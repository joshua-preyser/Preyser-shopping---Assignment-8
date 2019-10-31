package com.josh.service.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.factory.timesheet.EmployeeFactory;
import com.josh.service.timesheet.impl.EmployeeRepositoryImpl;

import org.junit.Before;

public class EmployeeServiceImplTest
{
private EmployeeService service;
private Employee employee;
private Employee getSavedEmployee()
{
    Set<Employee> savedEmployee = this.service.getAll();
    return savedEmployee.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = EmployeeServiceImpl.getService();
    this.employee = EmployeeFactory.buildEmployee(id, name, address, role, email)
}

@Test
public void a_create()
{
    Employee createdEmployee = this.service.create(this.employee);
    System.out.println("in create, createdEmployee = " + createdEmployee);
    e_getAll();
    Assert.assertSame(createdEmployee, this.employee);
}

@Test
public void b_read()
{
    Employee savedEmployee = getSavedEmployee();
    System.out.println("readEmployee, employeeId = " + savedEmployee.getId());
    Employee read = this.service.read(savedEmployee.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedEmployee, read);
e_getAll();
}

@Test
public void c_update()
{
    String newAddress = "new employee address test";
    Employee employee = new Employee.Builder().copy(getSavedEmployee()).addresc(newAddress).build();
    System.out.println("about to update = " + employee);
    Employee updatedEmployee = this.service.update(employee);
    System.out.println("updated employee = " + updatedEmployee);
    Assert.assertSame(newAddress, updatedEmployee.getAddress());
    e_getAll();
}

@Test
public void d_delete()
{
    Employee savedEmployee = getSavedEmployee();
    this.service.delete(savedEmployee.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Employee> all = this.service.getAll();
    System.out.println("all = " + all);
}
}
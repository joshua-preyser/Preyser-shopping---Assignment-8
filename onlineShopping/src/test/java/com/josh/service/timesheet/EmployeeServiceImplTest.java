package com.josh.repository.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Employee;
import com.josh.factory.timesheet.EmployeeFactory;
import com.josh.service.timesheet.impl.EmployeeRepositoryImpl;

import org.junit.Before;

public class EmployeeServiceImplTest
{
private EmployeeRepository repository;
private Employee employee;
private Employee getSaved()
{
    Set<Employee> savedEmployee = this.repository.getAll();
    return savedEmployee.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = EmployeeRepositoryImpl.getRepository();
    this.employee = EmployeeFactory.buildEmployee(id, name, address, role, email)
}

@Test
public void a_create()
{
    Employee createdEmployee = this.repository.create(this.employee);
    System.out.println("in create, createdEmployee = " + createdEmployee);
    e_getAll();
    Assert.assertSame(createdEmployee, this.employee);
}

@Test
public void b_read()
{
    Employee savedEmployee = getSavedEmployee();
    System.out.println("readEmployee, employeeId = " + savedEmployee.getId());
    Employee read = this.repository.read(savedEmployee.getId());
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
    Employee updatedEmployee = this.repository.update(employee);
    System.out.println("updated employee = " + updatedEmployee);
    Assert.assertSame(newAddress, updatedEmployee.getAddress());
    e_getAll();
}

@Test
public void d_delete()
{
    Employee savedEmployee = getSavedEmployee();
    this.repository.delete(savedEmployee.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Employee> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}
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
<<<<<<< HEAD
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
=======

    private EmployeeRepositoryImpl repository;
    private Employee employee;

    private Employee getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void c_update() {
        String newEmployeeName = "Application Development Theory 3";
        Employee updated = new Employee.Builder().copy(getSaved()).employeeName(newEmployeeName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newEmployeeName, updated.getEmployeeName());
    }

    @Test
    public void e_delete() {
        Employee saved = getSaved();
        this.repository.delete(saved.getEmployeeId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Employee saved = getSaved();
        Employee read = this.repository.read(saved.getEmployeeId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Employee> employees = this.repository.getAll();
        System.out.println("In getall, all = " + employees);
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}
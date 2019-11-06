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
}
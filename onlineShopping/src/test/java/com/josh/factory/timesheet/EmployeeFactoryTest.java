package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Employee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EmployeeFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildEmployee()
    {
        Employee employee = EmployeeFactory.buildEmployee(1, "Josh", "29 Heerengracht Road, Bergvliet", "manager", "preyser@gmail.com");
        Assert.assertNotNull(employee.getId());
        Assert.assertNotNull(employee.getName());
        Assert.assertNotNull(employee.getAddress());
        Assert.assertNotNull(employee.getRole());
        Assert.assertNotNull(employee.getEmail());
        Assert.assertNotNull(employee);
    }
}
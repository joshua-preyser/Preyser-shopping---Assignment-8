package com.josh.factory.payroll;

import com.josh.domain.payroll.EmployeePay;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EmployeePayFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildEmployeePay()
    {
        EmployeePay employeePay = EmployeePayFactory.buildEmployeeP(id, paid, total, desc);
        Assert.assertNotNull(employeePay.getId());
        Assert.assertNotNull(employeePay.getPaid());
        Assert.assertNotNull(employeePay.getTotal());
        Assert.assertNotNull(employeePay.getDesc());
        Assert.assertNotNull(employeePay);
    }
}
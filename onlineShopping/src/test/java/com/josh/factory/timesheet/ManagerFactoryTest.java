package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ManagerFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildManager()
    {
        Manager manager = ManagerFactory.buildManager(name);
        Assert.assertNotNull(manager.getName());
        Assert.assertNotNull(manager);
    }
}
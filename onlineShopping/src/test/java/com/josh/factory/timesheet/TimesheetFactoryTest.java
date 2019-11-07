package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Timesheet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TimesheetFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildTimesheet()
    {
        Timesheet timesheet = TimesheetFactory.buildTimesheet(new Employee(), new Task(), 9);
        Assert.assertNotNull(timesheetgetWho());
        Assert.assertNotNull(timesheet.getTask());
        Assert.assertNotNull(timesheet.getHours());
        Assert.assertNotNull(timesheet);
    }
}
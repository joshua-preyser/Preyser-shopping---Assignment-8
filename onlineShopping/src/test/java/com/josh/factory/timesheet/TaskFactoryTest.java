package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Task;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TaskFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildTask()
    {
        Task task = TaskFactory.buildTask(new ArrayList<assignedEmployees>, Manager.getName(), true, "administration"");
        Assert.assertNotNull(task.getAssignedEmployees());
        Assert.assertNotNull(task.getManager());
        Assert.assertNotNull(task.getCompleted());
        Assert.assertNotNull(task.getDescription());
        Assert.assertNotNull(task);
    }
}
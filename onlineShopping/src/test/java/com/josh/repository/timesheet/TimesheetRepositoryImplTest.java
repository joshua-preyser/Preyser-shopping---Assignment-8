package com.josh.repository.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.factory.timesheet.TimesheetFactory;
import com.josh.repository.timesheet.impl.TimesheetRepositoryImpl;

import org.junit.Before;

public class TimesheetRepositoryImplTest
{
private TimesheetRepository repository;
private Timesheet timesheet;
private Timesheet getSavedTimesheet()
{
    Set<Timesheet> savedTimesheet = this.repository.getAll();
    return savedTask.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = TimesheetRepositoryImpl.getRepository();
    this.timesheet = TimesheetFactory.buildTimesheet(who, task, hours)
}

@Test
public void a_create()
{
    Timesheet createdTimesheet = this.repository.create(this.timesheet);
    System.out.println("in create, createdTimesheet = " + createdTimesheet);
    e_getAll();
    Assert.assertSame(createdTimesheet, this.timesheet);
}

@Test
public void b_read()
{
    Timesheet savedTimesheet = getSavedTimesheet();
    System.out.println("readTimesheet, who = " + savedTimesheet.getWho());
    Timesheet read = this.repository.read(savedTimesheet.getWho());
    System.out.println("read = " + read);
    Assert.assertEquals(savedTimesheet, read);
e_getAll();
}

@Test
public void c_update()
{
    String newHours = "new timesheet hours test";
    Timesheet timesheet = new Timesheet.Builder().copy(getSavedTimesheet()).hours(newHours).build();
    System.out.println("about to update = " + timesheet);
    Task updatedTimesheet = this.repository.update(timesheet);
    System.out.println("updated timesheet = " + updatedTimesheet);
    Assert.assertSame(newHours, updatedTimesheet.getHours());
    e_getAll();
}

@Test
public void d_delete()
{
    Timesheet savedTimesheet = getSavedTimesheet();
    this.repository.delete(savedTimesheet.getWho());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Timesheet> all = this.repository.getAll();
    System.out.println("all = " + all);
}
}
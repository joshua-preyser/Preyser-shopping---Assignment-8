package com.josh.repository.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.factory.timesheet.TimesheetFactory;
import com.josh.service.timesheet.impl.TimesheetServiceImpl;

import org.junit.Before;

public class TimesheetServiceImplTest
{
<<<<<<< HEAD
private TimesheetRepository repository;
private Timesheet timesheet;
private Timesheet getSaved()
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
=======

    private TimesheetRepositoryImpl repository;
    private Timesheet sheet;

    private Timesheet getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TimesheetRepositoryImpl.getRepository();
        this.sheet = TimesheetFactory.buildTimesheet("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Timesheet created = this.repository.create(this.sheet);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.sheet);
    }

    @Test
    public void c_update() {
        String newTimesheetName = "Application Development Theory 3";
        Timesheet updated = new Timesheet.Builder().copy(getSaved()).sheetName(newTimesheetName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTimesheetName, updated.getTimesheetName());
    }

    @Test
    public void e_delete() {
        Timesheet saved = getSaved();
        this.repository.delete(saved.getTimesheetId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Timesheet saved = getSaved();
        Timesheet read = this.repository.read(saved.getTimesheetId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Timesheet> sheets = this.repository.getAll();
        System.out.println("In getall, all = " + sheets);
    }
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}
package com.josh.service.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.factory.timesheet.TimesheetFactory;
import com.josh.service.timesheet.impl.TimesheetServiceImpl;

import org.junit.Before;

public class TimesheetServiceImplTest
{

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
}
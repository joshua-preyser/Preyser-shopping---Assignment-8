package com.josh.service.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.factory.timesheet.TaskFactory;
import com.josh.service.timesheet.impl.TaskServiceImpl;

import org.junit.Before;

public class TaskServiceImplTest
{

    private TaskRepositoryImpl repository;
    private Task task;

    private Task getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TaskRepositoryImpl.getRepository();
        this.task = TaskFactory.buildTask("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Task created = this.repository.create(this.task);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.task);
    }

    @Test
    public void c_update() {
        String newTaskName = "Application Development Theory 3";
        Task updated = new Task.Builder().copy(getSaved()).taskName(newTaskName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTaskName, updated.getTaskName());
    }

    @Test
    public void e_delete() {
        Task saved = getSaved();
        this.repository.delete(saved.getTaskId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Task saved = getSaved();
        Task read = this.repository.read(saved.getTaskId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Task> tasks = this.repository.getAll();
        System.out.println("In getall, all = " + tasks);
    }
}
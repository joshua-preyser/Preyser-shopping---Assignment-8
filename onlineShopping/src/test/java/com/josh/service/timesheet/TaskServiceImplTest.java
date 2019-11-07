package com.josh.repository.timesheet;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.factory.timesheet.TaskFactory;
import com.josh.service.timesheet.impl.TaskRepositoryImpl;

import org.junit.Before;

public class TaskServiceImplTest
{
<<<<<<< HEAD
private TaskRepository repository;
private Task task;
private Task getSaved()
{
    Set<Task> savedTask = this.repository.getAll();
    return savedTask.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = TaskRepositoryImpl.getRepository();
    this.task = TaskFactory.buildTask(assignedEmployees, manager, completed, description)
}

@Test
public void a_create()
{
    Task createdTask = this.repository.create(this.task);
    System.out.println("in create, createdTask = " + createdTask);
    e_getAll();
    Assert.assertSame(createdTask, this.task);
}

@Test
public void b_read()
{
    Task savedTask = getSavedTask();
    System.out.println("readTask, assignedEmployees = " + savedTask.getAssignedEmployees());
    Task read = this.repository.read(savedTask.getAssignedEmployees());
    System.out.println("read = " + read);
    Assert.assertEquals(savedTask, read);
e_getAll();
}

@Test
public void c_update()
{
    String newDescription = "new task description test";
    Task task = new Task.Builder().copy(getSavedTask()).description(newDescription).build();
    System.out.println("about to update = " + task);
    Task updatedTask = this.repository.update(task);
    System.out.println("updated task = " + updatedTask);
    Assert.assertSame(newDescription, updatedTask.getDescription());
    e_getAll();
}

@Test
public void d_delete()
{
    Task savedTask = getSavedTask();
    this.repository.delete(savedTask.getAssignedEmployees());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Task> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======

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
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}
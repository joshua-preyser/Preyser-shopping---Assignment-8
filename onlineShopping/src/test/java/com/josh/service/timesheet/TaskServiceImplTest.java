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
}
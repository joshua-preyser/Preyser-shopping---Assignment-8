package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.service.timesheet.TaskService;

public class TaskServiceImpl implements TaskService {
    private static TaskServiceImpl repository = null;
    private CourseRepository repository;

    private TaskServiceImpl() {
        this.repository = TaskRepositoryImpl.getRepository();
    }

    public static TaskServiceImpl getService(){
        if (service == null) service = new TaskServiceImpl();
        return service;
    }

    @Override
    public Task create(Task task) {
        return this.repository.create(task);
    }

    @Override
    public Task update(Task task) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Task read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Task> getAll() {
        return this.repository.getAll();
    }
}

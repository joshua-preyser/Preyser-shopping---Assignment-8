package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.repository.timesheet.TaskRepository;
import com.josh.repository.timesheet.impl.TaskRepositoryImpl;
import com.josh.service.timesheet.TaskService;

public class TaskServiceImpl implements TaskService {
    private static TaskServiceImpl repository = null;
<<<<<<< HEAD
    private TaskRepository repository;

    private TaskServiceImpl() {
        this.repository = TaskRepository.getRepository();
    }

    public static TaskServiceImpl getService() {
        if (service == null)
            repository = new TaskServiceImpl();
=======
    private CourseRepository repository;

    private TaskServiceImpl() {
        this.repository = TaskRepositoryImpl.getRepository();
    }

    public static TaskServiceImpl getService(){
        if (service == null) service = new TaskServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
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

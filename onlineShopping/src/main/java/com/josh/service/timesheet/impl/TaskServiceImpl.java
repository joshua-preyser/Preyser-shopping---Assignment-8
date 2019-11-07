package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.repository.timesheet.TaskRepository;
import com.josh.repository.timesheet.impl.TaskRepositoryImpl;
import com.josh.service.timesheet.TaskService;

public class TaskServiceImpl implements TaskService {
    private static TaskServiceImpl repository = null;
    private TaskRepository repository;

    private TaskServiceImpl() {
        this.repository = TaskRepository.getRepository();
    }

    public static TaskServiceImpl getService() {
        if (service == null)
            repository = new TaskServiceImpl();
        return service;

}

    @Override
    public Task create(Task task) {
        this.job.add(task);
        return task;
    }

    @Override
    public Task update(Task task) {
        Task toUpdate = findTask(task.getAssignedEmployees());
        if (toUpdate != null) {
            this.job.remove(toUpdate);
            return create(task);
        }
        return null;
    }

    @Override
    public void delete(String assignedEmployees) {
        Task task = findTask(assignedEmployees);
        if (task != null)
            this.job.remove(task);
    }

    @Override
    public Task read(final String assignedEmployees) {
        Task task = findTask(assignedEmployees);
        return task;
    }

    @Override
    public Set<Task> getAll() {

        return this.job
    }
}
package com.josh.repository.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.repository.timesheet.TaskRepository;

public class TaskRepositoryImpl implements TaskRepository {
    private static TaskRepositoryImpl repository = null;
    private Set<Task> job;

    private TaskRepositoryImpl() {
        this.job = new HashSet<>();
    }

    private Task findTask(String assignedEmployees) {
        return this.job.stream().filter(job -> job.getAssignedEmployees().trim().equals(assignedEmployees)).findAny()
                .orElse(null);
    }

    public static TaskRepositoryImpl getRepository() {
        if (repository == null)
            repository = new TaskRepositoryImpl();
        return repository;

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
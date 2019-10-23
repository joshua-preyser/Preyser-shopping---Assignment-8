package com.josh.domain.timesheet;

import java.util.ArrayList;

public class Task
{
    private ArrayList assignedEmployees;
    private Manager manager;
    private Boolean completed;
    private String description;

    private Task()
    {
    }

    public Task(Builder builder) {
        this.assignedEmployees = builder.assignedEmployees;
        this.manager = builder.manager;
        this.completed = builder.completed;
        this.description = builder.discription;
    }

    public ArrayList getAssignedEmployees()
    {
        return assignedEmployees;
    }

    public Manager getManager()
    {
        return manager;
    }
    public Boolean getCompleted()
    {
        return completed;
    }
    public String getDescription()
    {
        return description;
    }

    public static class Builder
    {
    private ArrayList assignedEmployees;
    private Manager manager;
    private Boolean completed;
    private String description;

        public Builder assignedEmployees(Arraylist assignedEmployees)
        {
        this.assignedEmployees = assignedEmployees;
        return this;
        }
        public Builder manager(Manager manager)
        {
        this.manager = manager;
        return this;
        }
        public Builder completed(Boolean completed)
        {
        this.completed = completed;
        return this;
        }
        public Builder description(String description)
        {
        this.description = description;
        return this;
        }

        public Builder copy(Task task)
        {
        this.assignedEmployees = task.assignedEmployees;
        this.manager = task.manager;
        this.completed = task.completed;
        this.description = task.description;
        return this;
        }

        public Task build()
        {
        return new Task(this);
        }

    }





}
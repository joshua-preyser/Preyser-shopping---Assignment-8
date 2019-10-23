package com.josh.domain.timesheet;

import com.josh.domain.timesheet.Employee;import com.josh.domain.timesheet.Task;


public class Timesheet
{
    private Employee who;
    private Task task;
    private int hours;

    private Timesheet()
    {
    }

    public Timesheet(Builder builder) {
        this.who = builder.who;
        this.task = builder.task;
        this.hours = builder.hours;
    }

    public Employee getWho()
    {
        return who;
    }

    public Task getTask()
    {
        return task;
    }
    public int getHours()
    {
        return hours;
    }

    public static class Builder
    {
    private Employee who;
    private Task task;
    private int hours;

        public Builder who(Employee who)
        {
        this.who = who;
        return this;
        }
        public Builder task(Task task)
        {
        this.task = task;
        return this;
        }
        public Builder hours(int hours)
        {
        this.hours = hours;
        return this;
        }

        public Builder copy(Timesheet timesheet)
        {
        this.who = timesheet.who;
        this.task = ctimesheet.task;
        this.hours = timesheet.hours;
        return this;
        }

        public Timesheet build()
        {
        return new Timesheet(this);
        }

    }





}
package com.josh.domain.timesheet;

public class Manager
{
    private String name;

    private Manager()
    {
    }

    public Manager(Builder builder) {
        this.name = builder.name;
    }

    public String getName()
    {
        return name;
    }

    public static class Builder
    {
    private String name;

        public Builder name(String name)
        {
        this.name = name;
        return this;
        }

        public Builder copy(Manager manager)
        {
        this.name = manager.name;
        return this;
        }

        public Manager build()
        {
        return new Manager(this);
        }

    }





}
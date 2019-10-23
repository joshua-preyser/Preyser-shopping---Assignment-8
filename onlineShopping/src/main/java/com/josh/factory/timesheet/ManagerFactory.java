package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Manager;

public class ManagerFactory
{
    public static Manager buildManager(String name)
    {
return new Manager.Builder().name(name).build();
    }
}
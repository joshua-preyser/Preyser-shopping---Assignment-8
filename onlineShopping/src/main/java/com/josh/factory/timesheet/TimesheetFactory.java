package com.josh.factory.timesheet;


import com.josh.domain.timesheet.Timesheet;

public class TimesheetFactory
{
    public static Timesheet buildTimesheet(Employee who, Task task, int hours)
    {
return new Timesheet.Builder().who(who).task(task).hours(hours).build();
    }
}
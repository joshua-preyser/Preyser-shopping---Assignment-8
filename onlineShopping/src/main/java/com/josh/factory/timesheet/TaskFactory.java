package com.josh.factory.timesheet;

import com.josh.domain.timesheet.Task;

public class TaskFactory
{
    public static Task buildTask(ArrayList assignedEmployees, Manager manager, Boolean completed, String description)
    {
return new Task.Builder().assignedEmployees(assignedEmployees).manager(manager).completed(completed).description(description).build();
    }
}
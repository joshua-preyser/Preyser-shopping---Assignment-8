package com.josh.service.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.service.IService;

public interface TasktService extends IService<Task, String>
{
Set<Task> getAll();
}
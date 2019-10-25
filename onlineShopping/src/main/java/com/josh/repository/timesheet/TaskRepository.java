package com.josh.repository.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Task;
import com.josh.repository.IRepository;

public interface TasktRepository extends IRepository<Task, String>
{
Set<Task> getAll();
}
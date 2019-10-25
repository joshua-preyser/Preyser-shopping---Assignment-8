package com.josh.repository.timesheet;

import java.util.Set;

import com.josh.domain.timeshee.Timesheet;
import com.josh.repository.IRepository;

public interface TimesheetRepository extends IRepository<Timesheet, String>
{
Set<Timesheet> getAll();
}
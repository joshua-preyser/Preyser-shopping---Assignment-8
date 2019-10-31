package com.josh.service.timesheet;

import java.util.Set;

import com.josh.domain.timeshee.Timesheet;
import com.josh.service.IService;

public interface TimesheetService extends IService<Timesheet, String>
{
Set<Timesheet> getAll();
}
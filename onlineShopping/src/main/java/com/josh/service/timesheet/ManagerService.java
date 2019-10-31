package com.josh.service.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.service.IService;

public interface ManagerService extends IService<Manager, String>
{
Set<Manager> getAll();
}
package com.josh.repository.timesheet;

import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.repository.IRepository;

public interface ManagerRepository extends IRepository<Manager, String>
{
Set<Manager> getAll();
}
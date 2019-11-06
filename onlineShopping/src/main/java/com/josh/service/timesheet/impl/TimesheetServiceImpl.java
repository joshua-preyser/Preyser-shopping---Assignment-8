package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.service.timesheet.TimesheetRepository;

public class TimesheetServiceImpl implements TimesheetService {
    private static TimesheetServiceImpl service = null;
    private TimesheetRepository repository;

    private TimesheetServiceImpl() {
        this.repository = TimesheetRepositoryImpl.getRepository();
    }

    public static TimesheetServiceImpl getService(){
        if (service == null) service = new TimesheetServiceImpl();
        return service;
    }

    @Override
    public Timesheet create(Timesheet sheet) {
        return this.repository.create(sheet);
    }

    @Override
    public Timesheet update(Timesheet sheet) {
        return this.repository.update(sheet);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Timesheet read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Timesheet> getAll() {
        return this.repository.getAll();
    }
}

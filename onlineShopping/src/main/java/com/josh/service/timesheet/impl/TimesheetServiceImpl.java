package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.repository.timesheet.TimesheetRepository;
import com.josh.repository.timesheet.impl.TimesheetRepositoryImpl;
import com.josh.service.timesheet.TimesheetService;

public class TimesheetServiceImpl implements TimesheetService {
    private static TimesheetServiceImpl service = null;
    private TimesheetRepository repository;

    private TimesheetServiceImpl() {
<<<<<<< HEAD
        this.repository = TimesheetRepository.getRepository();
    }

    public static TimesheetRepositoryImpl getService() {
        if (service == null)
            service = new TimesheetServiceImpl();
=======
        this.repository = TimesheetRepositoryImpl.getRepository();
    }

    public static TimesheetServiceImpl getService(){
        if (service == null) service = new TimesheetServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
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

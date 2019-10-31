package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.service.timesheet.TimesheetRepository;

public class TimesheetServiceImpl implements TimesheetService {
    private static TimesheetServiceImpl service = null;
    private Set<Timesheet> time;

    private TimesheetServiceImpl() {
        this.time = new HashSet<>();
    }

    private Timesheet findTimesheet(String who) {
        return this.time.stream().filter(time -> time.getWho().trim().equals(who)).findAny()
                .orElse(null);
    }

    public static TimesheetRepositoryImpl getService() {
        if (service == null)
            service = new TimesheetServiceImpl();
        return service;

}

    @Override
    public Timesheet create(Timesheet timesheet) {
        this.time.add(timesheet);
        return timesheet;
    }

    @Override
    public Timesheet update(Timesheet timesheet) {
        Timesheet toUpdate = findTimesheet(timesheet.getWho());
        if (toUpdate != null) {
            this.time.remove(toUpdate);
            return create(timesheet);
        }
        return null;
    }

    @Override
    public void delete(String who) {
        Timesheet timesheet = findTimesheet(who);
        if (timesheet != null)
            this.time.remove(timesheet);
    }

    @Override
    public Timesheet read(final String who) {
        Timesheet timesheet = findTimesheet(who);
        return timesheet;
    }

    @Override
    public Set<Timesheet> getAll() {

        return this.time;
    }
}
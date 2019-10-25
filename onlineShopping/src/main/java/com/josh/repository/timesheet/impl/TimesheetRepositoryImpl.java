package com.josh.repository.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Timesheet;
import com.josh.repository.timesheet.TimesheetRepository;

public class TimesheetRepositoryImpl implements TimesheetRepository {
    private static TimesheetRepositoryImpl repository = null;
    private Set<Timesheet> time;

    private TimesheetRepositoryImpl() {
        this.time = new HashSet<>();
    }

    private Timesheet findTimesheet(String who) {
        return this.time.stream().filter(time -> time.getWho().trim().equals(who)).findAny()
                .orElse(null);
    }

    public static TimesheetRepositoryImpl getRepository() {
        if (repository == null)
            repository = new TimesheetRepositoryImpl();
        return repository;

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
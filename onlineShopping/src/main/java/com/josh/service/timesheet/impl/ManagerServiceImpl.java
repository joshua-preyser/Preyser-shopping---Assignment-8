package com.josh.service.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.repository.timesheet.ManagerRepository;
import com.josh.repository.timesheet.impl.ManagerRepositoryImpl;
import com.josh.service.timesheet.ManagerService;

public class ManagerServiceImpl implements ManagerService {
    private static ManagerServiceImpl service = null;
    private ManagerRepository repository;

    private ManagerServiceImpl() {
<<<<<<< HEAD
        this.repository = ManagerRepository.getRepository();
    }

    public static ManagerServiceImpl getService() {
        if (service == null)
            service = new ManagerServiceImpl();
=======
        this.repository = ManagerRepositoryImpl.getRepository();
    }

    public static ManagerServiceImpl getService(){
        if (service == null) service = new ManagerServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
        return service;
    }

    @Override
    public Manager create(Manager manager) {
        return this.repository.create(manager);
    }

    @Override
    public Manager update(Manager manager) {
        return this.repository.update(manager);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Manager read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Manager> getAll() {
        return this.repository.getAll();
    }
}

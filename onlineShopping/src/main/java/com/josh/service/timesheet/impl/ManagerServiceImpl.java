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
        this.repository = ManagerRepository.getRepository();
    }

    public static ManagerServiceImpl getService() {
        if (service == null)
            service = new ManagerServiceImpl();
        return service;

}

    @Override
    public Manager create(Manager manager) {
        this.m.add(manager);
        return manager;
    }

    @Override
    public Manager update(Manager manager) {
        Manager toUpdate = findManager(manager.getName());
        if (toUpdate != null) {
            this.m.remove(toUpdate);
            return create(manager);
        }
        return null;
    }

    @Override
    public void delete(String managerName) {
        Manager manager = findManager(managerName);
        if (manager != null)
            this.m.remove(manager);
    }

    @Override
    public Manager read(final String managerName) {
        Manager manager = findManager(managerName);
        return manager;
    }

    @Override
    public Set<Manager> getAll() {

        return this.m;
    }
}
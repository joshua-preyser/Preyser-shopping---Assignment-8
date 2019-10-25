package com.josh.repository.timesheet.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.timesheet.Manager;
import com.josh.repository.timesheet.ManagerRepository;

public class ManagerRepositoryImpl implements ManagerRepository {
    private static ManagerRepositoryImpl repository = null;
    private Set<Manager> m;

    private ManagerRepositoryImpl() {
        this.m = new HashSet<>();
    }

    private Manager findManager(String managerName) {
        return this.m.stream().filter(m -> m.getName().trim().equals(managerName)).findAny()
                .orElse(null);
    }

    public static ManagerRepositoryImpl getRepository() {
        if (repository == null)
            repository = new ManagerRepositoryImpl();
        return repository;

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
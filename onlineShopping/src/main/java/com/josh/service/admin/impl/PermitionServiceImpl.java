package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.service.admin.PermitionService;

public class PermitionServiceImpl implements PermitionService {
    private static PermitionServiceImpl service = null;
    private Set<Permition> permit;

    private PermitionServiceImpl() {
        this.permit = new HashSet<>();
    }

    private Permition findPermition(String permitionId) {
        return this.permit.stream().filter(permit -> permit.getId().trim().equals(permitionId)).findAny()
                .orElse(null);
    }

    public static PermitionServiceImpl getService() {
        if (service == null)
            service = new PermitionServiceImpl();
        return service;

}

    @Override
    public Permition create(Permition permition) {
        this.permit.add(permition);
        return permition;
    }

    @Override
    public Permition update(Permition permition) {
        Permition toUpdate = findPermition(permition.getId());
        if (toUpdate != null) {
            this.permit.remove(toUpdate);
            return create(permition);
        }
        return null;
    }

    @Override
    public void delete(String permitionId) {
        Permition permition = findPermition(permitionId);
        if (account != null)
            this.permit.remove(permition);
    }

    @Override
    public Permition read(final String permitionId) {
        Permition permition = findPermition(permitionId);
        return permition;
    }

    @Override
    public Set<Permition> getAll() {

        return this.permit;
    }
}
package com.josh.repository.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.repository.payroll.UserRateRepository;

public class UserRateRepositoryImpl implements UserRateRepository {
    private static UserRateRepositoryImpl repository = null;
    private Set<UserRate> uR;

    private UserRateRepositoryImpl() {
        this.uR = new HashSet<>();
    }

    private UserRate findUserRate(String rateCode) {
        return this.uR.stream().filter(uR -> uR.getCode().trim().equals(rateCode)).findAny()
                .orElse(null);
    }

    public static UserRateRepositoryImpl getRepository() {
        if (repository == null)
            repository = new UserRateRepositoryImpl();
        return repository;

}

    @Override
    public UserRate create(UserRate userRate) {
        this.uR.add(userRate);
        return userRate;
    }

    @Override
    public UserRate update(UserRate userRate) {
        UserRate toUpdate = findUserRate(userRate.getCode());
        if (toUpdate != null) {
            this.uR.remove(toUpdate);
            return create(userRate);
        }
        return null;
    }

    @Override
    public void delete(String rateCode) {
        UserRate userRate = findUserRate(rateCode);
        if (userRate != null)
            this.uR.remove(userRate);
    }

    @Override
    public UserRate read(final String rateCode) {
        UserRate userRate = findUserRate(rateCode);
        return userRate;
    }

    @Override
    public Set<UserRate> getAll() {

        return this.uR;
    }
}
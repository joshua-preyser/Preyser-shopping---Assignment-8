package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.UserRate;
import com.josh.service.payroll.UserRateService;

public class UserRateServiceImpl implements UserRateService {
    private static UserRateServiceImpl service = null;
    private Set<UserRate> uR;

    private UserRateServiceImpl() {
        this.uR = new HashSet<>();
    }

    private UserRate findUserRate(String rateCode) {
        return this.uR.stream().filter(uR -> uR.getCode().trim().equals(rateCode)).findAny()
                .orElse(null);
    }

    public static UserRateServiceImpl getService() {
        if (service == null)
            service = new UserRateServiceImpl();
        return service;

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
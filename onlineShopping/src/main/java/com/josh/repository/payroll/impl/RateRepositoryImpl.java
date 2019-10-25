package com.josh.repository.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.repository.payroll.RateRepository;

public class RateRepositoryImpl implements RateRepository {
    private static RateRepositoryImpl repository = null;
    private Set<Rate> r;

    private RateRepositoryImpl() {
        this.r = new HashSet<>();
    }

    private Rate findRate(String rateId) {
        return this.r.Stream().filter(r -> r.getId().trim().equals(employeePayId)).findAny()
                .orElse(null);
    }

    public static RateRepositoryImpl getRepository() {
        if (repository == null)
            repository = new RateRepositoryImpl();
        return repository;

}

    @Override
    public Rate create(Rate rate) {
        this.r.add(rate);
        return rate;
    }

    @Override
    public Rate update(Rate rate) {
        EmployeePay toUpdate = findRate(rate.getId());
        if (toUpdate != null) {
            this.r.remove(toUpdate);
            return create(rate);
        }
        return null;
    }

    @Override
    public void delete(String rateId) {
        Rate rate = findRate(rateId);
        if (rate != null)
            this.r.remove(rate);
    }

    @Override
    public Rate read(final String rateId) {
        Rate rate = findRate(rateId);
        return rate;
    }

    @Override
    public Set<Rate> getAll() {

        return this.r;
    }
}
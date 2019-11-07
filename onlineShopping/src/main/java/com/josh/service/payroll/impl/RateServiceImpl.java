package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.repository.payroll.RateRepository;
import com.josh.repository.payroll.impl.RateRepositoryImpl;
import com.josh.service.payroll.RateService;

public class RateServiceImpl implements RateService {
    private static RateServiceImpl service = null;
    private RateRepository repository;

    private RateServiceImpl() {
        this.repository = RateRepository.getRepository();
    }

    public static RateServiceImpl getService() {
        if (service == null)
            service = new RateServiceImpl();
        return service;

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
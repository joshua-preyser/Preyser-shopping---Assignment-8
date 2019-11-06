package com.josh.service.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.service.customer.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {
    private static DeliveryServiceImpl service = null;
    private DeliveryRepository repository;

    private DeliveryServiceImpl() {
        this.repository = DeliveryRepositoryImpl.getRepository();
    }

    public static DeliveryServiceImpl getService(){
        if (service == null) service = new DeliveryServiceImpl();
        return service;
    }

    @Override
    public Delivery create(Delivery delivery) {
        return this.repository.create(delivery);
    }

    @Override
    public Delivery update(Delivery delivery) {
        return this.repository.update(delivery);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Delivery read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Delivery> getAll() {
        return this.repository.getAll();
    }
}

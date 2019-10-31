package com.josh.service.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.service.customer.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {
    private static DeliveryServiceImpl service = null;
    private Set<Delivery> deliver

    private DeliveryServiceImpl() {
        this.deliver = new HashSet<>();
    }

    private Delivery findDelivery(String deliveryId) {
        return this.deliver.stream().filter(deliver -> deliver.getId().trim().equals(deliveryId)).findAny()
                .orElse(null);
    }

    public static DeliveryServiceImpl getService() {
        if (service == null)
            service = new DeliveryServiceImpl();
        return service;

}

    @Override
    public Delivery create(Delivery delivery) {
        this.deliver.add(delivery);
        return delivery;
    }

    @Override
    public Delivery update(Delivery delivery) {
        Delivery toUpdate = findDelivery(delivery.getId());
        if (toUpdate != null) {
            this.deliver.remove(toUpdate);
            return create(delivery);
        }
        return null;
    }

    @Override
    public void delete(String deliveryId) {
        Delivery delivery = findDelivery(deliveryId);
        if (delivery != null)
            this.deliver.remove(delivery);
    }

    @Override
    public Delivery read(final String deliveryId) {
        Delivery delivery = findDelivery(deliveryId);
        return delivery;
    }

    @Override
    public Set<Delivery> getAll() {

        return this.deliver;
    }
}
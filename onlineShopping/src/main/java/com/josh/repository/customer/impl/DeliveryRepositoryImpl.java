package com.josh.repository.customer.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.customer.Delivery;
import com.josh.repository.customer.DeliveryRepository;

public class DeliveryRepositoryImpl implements DeliveryRepository {
    private static DeliveryRepositoryImpl repository = null;
    private Set<Delivery> deliver

    private DeliveryRepositoryImpl() {
        this.deliver = new HashSet<>();
    }

    private Delivery findDelivery(String deliveryId) {
        return this.deliver.stream().filter(deliver -> deliver.getId().trim().equals(deliveryId)).findAny()
                .orElse(null);
    }

    public static DeliveryRepositoryImpl getRepository() {
        if (repository == null)
            repository = new DeliveryRepositoryImpl();
        return repository;

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
package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.repository.product.OrderedProductRepository;
import com.josh.repository.product.impl.OrderedProductRepositoryImpl;
import com.josh.service.product.OrderedProductService;

public class OrderedProductServiceImpl implements OrderedProductService {
    private static OrderedProductServiceImpl service = null;
    private OrderedProductRepository repository;

    private OrderedProductServiceImpl() {
<<<<<<< HEAD
        this.repository = OrderedProductRepository.getRepository();
    }

    public static OrderedProductServiceImpl getService() {
        if (service == null)
            service = new OrderedProductServiceImpl();
=======
        this.repository = OrderedProductRepositoryImpl.getRepository();
    }

    public static OrderedProductServiceImpl getService(){
        if (service == null) service = new OrderedProductServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
        return service;
    }

    @Override
    public OrderedProduct create(OrderedProduct product) {
        return this.repository.create(product);
    }

    @Override
    public OrderedProduct update(OrderedProduct product) {
        return this.repository.update(product);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OrderedProduct read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<OrderedProduct> getAll() {
        return this.repository.getAll();
    }
}

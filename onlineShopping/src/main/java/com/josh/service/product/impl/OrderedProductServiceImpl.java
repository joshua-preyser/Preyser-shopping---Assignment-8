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
        this.repository = OrderedProductRepository.getRepository();
    }

    public static OrderedProductServiceImpl getService() {
        if (service == null)
            service = new OrderedProductServiceImpl();
        return service;

}

    @Override
    public OrderedProduct create(OrderedProduct orderedProduct) {
        this.oP.add(orderedProduct);
        return orderedProduct;
    }

    @Override
    public OrderedProduct update(OrderedProduct orderedProduct) {
        Category toUpdate = findCategory(orderedProduct.getId());
        if (toUpdate != null) {
            this.oP.remove(toUpdate);
            return create(orderedProduct);
        }
        return null;
    }

    @Override
    public void delete(String productId) {
        OrderedProduct orderedProduct = findOrderedProduct(productId);
        if (orderedProduct != null)
            this.oP.remove(orderedProduct);
    }

    @Override
    public orderedProduct read(final String productId) {
        OrderedProduct orderedProduct = findOrderedProduct(productId);
        return orderedProduct;
    }

    @Override
    public Set<Orderedproduct> getAll() {

        return this.oP;
    }
}
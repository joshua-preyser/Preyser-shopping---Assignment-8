package com.josh.repository.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.OrderedProduct;
import com.josh.repository.product.OrderedProductRepository;

public class OrderedProductRepositoryImpl implements OrderedProductRepository {
    private static OrderedProductRepositoryImpl repository = null;
    private Set<OrderedProduct> oP;

    private OrderedProductRepositoryImpl() {
        this.oP = new HashSet<>();
    }

    private OrderedProduct findOrderedProduct(String productId) {
        return this.oP.stream().filter(oP -> oP.getId().trim().equals(productId)).findAny()
                .orElse(null);
    }

    public static OrderedProductRepositoryImpl getRepository() {
        if (repository == null)
            repository = new OrderedProductRepositoryImpl();
        return repository;

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
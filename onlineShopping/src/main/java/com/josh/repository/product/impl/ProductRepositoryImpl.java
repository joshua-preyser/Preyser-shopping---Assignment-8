package com.josh.repository.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.repository.product.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
    private static ProductRepositoryImpl repository = null;
    private Set<Product> item;

    private ProductRepositoryImpl() {
        this.item = new HashSet<>();
    }

    private Product findProduct(String productId) {
        return this.item.stream().filter(item -> item.getId().trim().equals(productId)).findAny()
                .orElse(null);
    }

    public static ProductRepositoryImpl getRepository() {
        if (repository == null)
            repository = new ProductRepositoryImpl();
        return repository;

}

    @Override
    public Product create(Product product) {
        this.item.add(product);
        return product;
    }

    @Override
    public Product update(Product product) {
        Product toUpdate = findProduct(product.getId());
        if (toUpdate != null) {
            this.item.remove(toUpdate);
            return create(product);
        }
        return null;
    }

    @Override
    public void delete(String productId) {
        Product product = findProduct(productId);
        if (product != null)
            this.item.remove(product);
    }

    @Override
    public Product read(final String productId) {
        Product proeduct = findProduct(productId);
        return product;
    }

    @Override
    public Set<Product> getAll() {

        return this.item;
    }
}
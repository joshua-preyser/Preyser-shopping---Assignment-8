package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.service.product.ProductServicey;

public class ProductServiceImpl implements ProductService {
    private static ProductServiceImpl service = null;
    private ProductRepository repository;

    private ProductServiceImpl() {
        this.repository = ProductRepositoryImpl.getRepository();
    }

    public static ProductServiceImpl getService(){
        if (service == null) service = new ProductServiceImpl();
        return service;
    }

    @Override
    public Product create(Product product) {
        return this.repository.create(product);
    }

    @Override
    public Product update(Product product) {
        return this.repository.update(product);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Product read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Product> getAll() {
        return this.repository.getAll();
    }
}

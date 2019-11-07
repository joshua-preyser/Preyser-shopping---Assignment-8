package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Product;
import com.josh.repository.product.ProductRepository;
import com.josh.repository.product.impl.ProductRepositoryImpl;
import com.josh.service.product.ProductService;

public class ProductServiceImpl implements ProductService {
    private static ProductServiceImpl service = null;
    private ProductRepository repository;

    private ProductServiceImpl() {
<<<<<<< HEAD
        this.repository = ProductRepository.getRepository();
    }

    public static ProductServiceImpl getService() {
        if (service == null)
            service = new ProductServiceImpl();
=======
        this.repository = ProductRepositoryImpl.getRepository();
    }

    public static ProductServiceImpl getService(){
        if (service == null) service = new ProductServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
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

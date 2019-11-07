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
        this.repository = ProductRepository.getRepository();
    }

    public static ProductServiceImpl getService() {
        if (service == null)
            service = new ProductServiceImpl();
        return service;

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
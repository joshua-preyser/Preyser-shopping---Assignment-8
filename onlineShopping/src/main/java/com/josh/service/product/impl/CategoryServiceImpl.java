package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.repository.product.CategoryRepository;
import com.josh.repository.product.impl.CategoryRepositoryImpl;
import com.josh.service.product.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private static CategoryServiceImpl service = null;
    private CategoryRepository repository;

    private CategoryServiceImpl() {
<<<<<<< HEAD
        this.repository = CategoryRepository.getRepository();
    }

    public static CategoryServiceImpl getService() {
        if (service == null)
            service = new CategoryServiceImpl();
=======
        this.repository = CategoryRepositoryImpl.getRepository();
    }

    public static CategoryServiceImpl getService(){
        if (service == null) service = new CategoryServiceImpl();
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
        return service;
    }

    @Override
    public Category create(Category category) {
        return this.repository.create(category);
    }

    @Override
    public Category update(Category category) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Category read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Category> getAll() {
        return this.repository.getAll();
    }
}

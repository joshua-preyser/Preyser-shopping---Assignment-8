package com.josh.service.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.service.product.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private static CategoryServiceImpl service = null;
    private Set<Category> itemGroup;

    private CategoryServiceImpl() {
        this.itemGroup = new HashSet<>();
    }

    private Category findCategory(String categoryId) {
        return this.itemGroup.stream().filter(itemGroup -> itemGroup.getId().trim().equals(categoryId)).findAny()
                .orElse(null);
    }

    public static CategoryServiceImpl getService() {
        if (service == null)
            service = new CategoryServiceImpl();
        return service;

}

    @Override
    public Category create(Category category) {
        this.itemGroup.add(category);
        return category;
    }

    @Override
    public Category update(Category category) {
        Category toUpdate = findCategory(category.getId());
        if (toUpdate != null) {
            this.itemGroup.remove(toUpdate);
            return create(category);
        }
        return null;
    }

    @Override
    public void delete(String categoryId) {
        Category category = findCategory(categoryId);
        if (category != null)
            this.itemGroup.remove(category);
    }

    @Override
    public Category read(final String categoryId) {
        Category category = findCategory(categoryId);
        return category;
    }

    @Override
    public Set<Category> getAll() {

        return this.itemGroup;
    }
}
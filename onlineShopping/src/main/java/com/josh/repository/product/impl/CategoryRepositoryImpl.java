package com.josh.repository.product.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.repository.product.CategoryRepository;

public class CategoryRepositoryImpl implements CategoryRepository {
    private static CategoryRepositoryImpl repository = null;
    private Set<Category> itemGroup;

    private CategoryRepositoryImpl() {
        this.itemGroup = new HashSet<>();
    }

    private Category findCategory(String categoryId) {
        return this.itemGroup.stream().filter(itemGroup -> itemGroup.getId().trim().equals(categoryId)).findAny()
                .orElse(null);
    }

    public static CategoryRepositoryImpl getRepository() {
        if (repository == null)
            repository = new CategoryRepositoryImpl();
        return repository;

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
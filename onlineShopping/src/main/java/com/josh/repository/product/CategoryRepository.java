package com.josh.repository.product;

import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.repository.IRepository;

public interface CategoryRepository extends IRepository<Category, String>
{
Set<Category> getAll();
}
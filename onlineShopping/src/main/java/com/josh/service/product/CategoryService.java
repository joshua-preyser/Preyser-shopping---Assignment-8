package com.josh.service.product;

import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.service.IService;

public interface CategoryService extends IService<Category, String>
{
Set<Category> getAll();
}
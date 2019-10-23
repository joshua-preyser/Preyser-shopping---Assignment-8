package com.josh.factory.product;

import com.josh.domain.product.Category;

public class CategoryFactory
{
    public static Category buildCategory(int categoryId, String categoryName, Array categorySort)
    {
return new Category.Builder().categoryId(categoryId).categoryName(categoryName).categorySort(categorySort).build();
    }
}
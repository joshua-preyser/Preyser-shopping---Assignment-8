package com.josh.domain.product;

import java.lang.reflect.Array;

public class Category
{
    private int categoryId;
    private String categoryName;
    private array categorySort;

    private Category()
    {
    }

    public Category(Builder builder) {
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
        this.categorySort = builder.categorySort;
    }

    public int getCategoryId()
    {
        return categoryId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }
    public Array getCategorySort()
    {
        return categorySort;
    }

    public static class Builder
    {
    private int categoryId;
    private String categoryName;
    private Array categorySort;

        public Builder categoryId(int categoryId)
        {
        this.categoryId = categoryId;
        return this;
        }
        public Builder categoryName(String categoryName)
        {
        this.categoryName = categoryName;
        return this;
        }
        public Builder categorySort(array categorySort)
        {
        this.categorySort = categorySort;
        return this;
        }

        public Builder copy(Category category)
        {
        this.categoryId = category.categoryId;
        this.categoryName = category.categoryName;
        this.categorySort = category.categorySort;
        return this;
        }

        public Category build()
        {
        return new Category(this);
        }

    }

    @Override
    public String toString() {
        return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categorySort=" + categorySort + "]";
    }




}
package com.josh.factory.product;

import com.josh.domain.product.Category;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CategoryFactoryTest
{
    private String testName;
    @Before
    public void setUp() throws Exception
    {
        this.testName = "testName";
    }

    @Test
    public void buildCategory()
    {
        Category category = CategoryFactory.buildCategory(1, "device", new Array[categorySort]);
        Assert.assertNotNull(category.getCategoryId());
        Assert.assertNotNull(category.getCategoryName());
        Assert.assertNotNull(category.getCategorySort());
        Assert.assertNotNull(category);
    }
}
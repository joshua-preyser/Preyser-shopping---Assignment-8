package com.josh.service.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.factory.product.CategoryFactory;
import com.josh.service.product.impl.CategoryServiceImpl;

import org.junit.Before;

public class CategoryServiceImplTest
{

    private CategoryRepositoryImpl repository;
    private Category catg;

    private Category getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CategoryRepositoryImpl.getRepository();
        this.catg = CategoryFactory.buildCategory("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Category created = this.repository.create(this.catg);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.catg);
    }

    @Test
    public void c_update() {
        String newCategoryName = "Application Development Theory 3";
        Category updated = new Category.Builder().copy(getSaved()).catgName(newCategoryName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCategoryName, updated.getCategoryName());
    }

    @Test
    public void e_delete() {
        Category saved = getSaved();
        this.repository.delete(saved.getCategoryId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Category saved = getSaved();
        Category read = this.repository.read(saved.getCategoryId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Category> catgs = this.repository.getAll();
        System.out.println("In getall, all = " + catgs);
    }
}
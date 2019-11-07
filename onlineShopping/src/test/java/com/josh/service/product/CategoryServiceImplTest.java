package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.factory.product.CategoryFactory;
import com.josh.service.product.impl.CategoryServiceImpl;

import org.junit.Before;

public class CategoryServiceImplTest
{
<<<<<<< HEAD
private CategoryRepository repository;
private Category category;
private Category getSaved()
{
    Set<Category> savedCategory = this.repository.getAll();
    return savedCategory.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.repository = CategoryRepositoryImpl.getRepository();
    this.category = CategoryFactory.buildCategory(categoryId, categoryName, categorySort)
}

@Test
public void a_create()
{
    Category createdCategory = this.repository.create(this.category);
    System.out.println("in create, createdCategory = " + createdCategory);
    e_getAll();
    Assert.assertSame(createdCategory, this.category);
}

@Test
public void b_read()
{
    Category savedCategory = getSavedCategory();
    System.out.println("readCategory, categoryId = " + savedCategory.getId());
    Category read = this.repository.read(savedCategory.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedCategory, read);
e_getAll();
}

@Test
public void c_update()
{
    String newCategoryName = "new category name test";
    Category category = new Category.Builder().copy(getSavedCategory()).categoryName(newCategoryName).build();
    System.out.println("about to update = " + category);
    Category updatedCategory = this.repository.update(category);
    System.out.println("updated category name = " + updatedCategory);
    Assert.assertSame(newCategoryName, updatedCategory.getId());
    e_getAll();
}

@Test
public void d_delete()
{
    Category savedCategory = getSavedCategory();
    this.repository.delete(savedCategory.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Category> all = this.repository.getAll();
    System.out.println("all = " + all);
}
=======

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
>>>>>>> 02999a039643a98048fb2d484e696524bc436634
}
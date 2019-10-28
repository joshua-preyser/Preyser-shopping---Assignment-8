package com.josh.repository.product;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.product.Category;
import com.josh.factory.product.CategoryFactory;
import com.josh.repository.product.impl.CategoryRepositoryImpl;

import org.junit.Before;

public class CategoryRepositoryImplTest
{
private CategoryRepository repository;
private Category category;
private Category getSavedCategory()
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
}
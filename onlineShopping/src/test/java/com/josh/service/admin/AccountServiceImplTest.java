package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import com.josh.domain.admin.Account;
import com.josh.factory.admin.AccountFactory;
import com.josh.service.admin.impl.AccountServiceImpl;

import org.junit.Before;

public class AccountServiceImplTest {
    private AccountRepositoryImpl repository;
    private Account account;

    private Account getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.account);
    }

    @Test
    public void c_update() {
        String newAccountName = "Application Development Theory 3";
        Account updated = new Account.Builder().copy(getSaved()).accountName(newAccountName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newAccountName, updated.getAccountName());
    }

    @Test
    public void e_delete() {
        Account saved = getSaved();
        this.repository.delete(saved.getAccountId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Account saved = getSaved();
        Account read = this.repository.read(saved.getAccountId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Account> accounts = this.repository.getAll();
        System.out.println("In getall, all = " + accounts);
    }
}
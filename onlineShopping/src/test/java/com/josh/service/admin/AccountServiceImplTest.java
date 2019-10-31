package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Account;
import com.josh.factory.admin.AccountFactory;
import com.josh.service.admin.impl.AccountServiceImpl;

import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountServiceImplTest {

    private AccountRepositoryImpl repository;
    private Account account;

    private Account getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("01", "capetown", true, new Date(), new Date());
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
        String newAccount = "thisd is anew account name";
        Account updated = new Account.Builder().copy(getSaved()).address(newAccount).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newAccount, updated.getAddress());
    }

    @Test
    public void e_delete() {
        Account saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Account saved = getSaved();
        Account read = this.repository.read(saved.getId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Account> accounts = this.repository.getAll();
        System.out.println("In getall, all = " + accounts);
    }
}

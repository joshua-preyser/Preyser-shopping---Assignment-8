package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.Account;
import com.josh.factory.admin.AccountFactory;
import com.josh.service.admin.impl.AccountServiceImpl;

import org.junit.Before;

public class AccountServiceImplTest
{
private AccountService service;
private Account account;
private Account getSavedAccount()
{
    Set<Account> savedAccount = this.service.getAll();
    return savedAccount.iterator().next();
}
@Before
public void setUp() throws Exception
{
    this.service = AccountServiceImpl.getService();
    this.account = AccountFactory.buildAccount(id, address, is_closed, open, closed);
}

@Test
public void a_create()
{
    Account createdAccount = this.service.create(this.account);
    System.out.println("in create, createdAccount = " + createdAccount);
    e_getAll();
    Assert.assertSame(createdAccount, this.account);
}

@Test
public void b_read()
{
    Account savedAccount = getSavedAccount();
    System.out.println("readAccount, accountId = " + savedAccount.getId());
    Account read = this.service.read(savedAccount.getId());
    System.out.println("read = " + read);
    Assert.assertEquals(savedAccount, read);
e_getAll();
}

@Test
public void c_update()
{
    String newAddress = "new account address test";
    Account account = new Account.Builder().copy(getSavedAccount()).address(newAddress).build();
    System.out.println("about to update = " + account);
    Account updatedAccount = this.service.update(account);
    System.out.println("updated account = " + updatedAccount);
    Assert.assertSame(newAddress, updatedAccount.getAddress());
    e_getAll();
}

@Test
public void d_delete()
{
    Account savedAccount = getSavedAccount();
    this.service.delete(savedAccount.getId());
        e_getAll();
}

@Test
public void e_getAll()
{
    Set<Account> all = this.service.getAll();
    System.out.println("all = " + all);
}
}
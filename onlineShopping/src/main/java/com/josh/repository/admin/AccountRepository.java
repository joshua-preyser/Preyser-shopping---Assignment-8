package com.josh.repository.admin;

import com.josh.repository.IRepository;

import java.util.Set;

import com.josh.domain.admin.Account;

public interface AccountRepository extends IRepository<Account, String>
{
Set<Account> getAll();
}
package com.josh.service.admin;
import java.util.Set;
import com.josh.domain.admin.Account;
import com.josh.service.IService;

public interface AccountService extends IService<Account, String> {
    Set<Account> getAll();
}
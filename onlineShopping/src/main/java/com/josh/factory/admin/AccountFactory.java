package com.josh.factory.admin;

import java.util.Date;

import com.josh.domain.admin.Account;

public class AccountFactory {
    public static Account buildAccount(String id, String address, boolean is_closed, Date open, Date closed) {
        return new Account.Builder().id(id)
                .address(address)
                .is_closed(is_closed)
                .open(open).closed(closed).build();

    }
}
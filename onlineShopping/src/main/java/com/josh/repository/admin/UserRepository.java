package com.josh.repository.admin;

import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.repository.IRepository;

public interface UserRepository extends IRepository<User, String>
{
Set<User> getAll();
}
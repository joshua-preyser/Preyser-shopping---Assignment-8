package com.josh.service.admin;

import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.service.IService;

public interface UserService extends IService<User, String>
{
Set<User> getAll();
}
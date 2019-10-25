package com.josh.repository.admin;

import java.util.Set;

import com.josh.domain.admin.Role;
import com.josh.repository.IRepository;

public interface RoleRepository extends IRepository<Role, String>
{
Set<Role> getAll();
}
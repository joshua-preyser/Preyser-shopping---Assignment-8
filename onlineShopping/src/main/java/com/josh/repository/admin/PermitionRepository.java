package com.josh.repository.admin;

import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.repository.IRepository;

public interface    PermitionRepository extends IRepository<Permition, String>
{
Set<Permition> getAll();
}
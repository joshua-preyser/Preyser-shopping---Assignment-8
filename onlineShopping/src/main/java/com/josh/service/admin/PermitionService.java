package com.josh.service.admin;

import java.util.Set;

import com.josh.domain.admin.Permition;
import com.josh.service.IService;

public interface PermitionService extends IService<Permition, String>
{
Set<Permition> getAll();
}
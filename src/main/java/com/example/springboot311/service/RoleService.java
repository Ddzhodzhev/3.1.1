package com.example.springboot311.service;

import com.example.springboot311.model.Role;

import java.util.List;

public interface RoleService {
    void createRole(Role role);

    void updateRole(Role role);

    void removeRole(int id);

    List<Role> getRoles();

    Role getRoleByName(String name);

}
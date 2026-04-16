package com.example.securitydemo.dto;

import com.example.securitydemo.entity.enums.Permission;
import com.example.securitydemo.entity.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class SignUpDto {

    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
    private Set<Permission> permissions;
}

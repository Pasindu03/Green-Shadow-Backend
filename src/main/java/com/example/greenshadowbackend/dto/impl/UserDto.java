package com.example.greenshadowbackend.dto.impl;

import com.example.greenshadowbackend.dto.status.UserStatus;
import com.example.greenshadowbackend.util.role.Role;

public class UserDto implements UserStatus {
    private String userId;
    private String user;
    private String password;
    private Role role;
}

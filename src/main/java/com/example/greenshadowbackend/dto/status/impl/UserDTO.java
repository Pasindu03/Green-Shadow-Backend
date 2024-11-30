package com.example.greenshadowbackend.dto.status.impl;

import com.example.greenshadowbackend.dto.status.UserStatus;
import com.example.greenshadowbackend.util.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements UserStatus {
    private String userId;
    private String user;
    private String password;
    private Role role;

    private List<StaffDTO> staffList;
}

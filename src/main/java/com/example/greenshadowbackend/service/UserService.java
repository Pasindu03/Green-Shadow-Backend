package com.example.greenshadowbackend.service;

import com.example.greenshadowbackend.dto.status.UserStatus;
import com.example.greenshadowbackend.dto.status.impl.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();

    UserStatus getUserById(String id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(String id, UserDTO userDTO);

    void deleteUser(String id);
}

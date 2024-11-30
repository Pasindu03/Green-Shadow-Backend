package com.example.greenshadowbackend.service.impl;

import com.example.greenshadowbackend.customStatusCode.SelectedClassErrorStatus;
import com.example.greenshadowbackend.dao.UserRepository;
import com.example.greenshadowbackend.dto.status.UserStatus;
import com.example.greenshadowbackend.dto.status.impl.UserDTO;
import com.example.greenshadowbackend.entity.impl.User;
import com.example.greenshadowbackend.service.UserService;
import com.example.greenshadowbackend.util.mapper.Mapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private Mapping mapping;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return mapping.asUserDTOList(users);
    }

    @Override
    public UserStatus getUserById(String id) {
        if(userRepository.existsById(id)) {
            User user = userRepository.getReferenceById(id);
            return mapping.toUserDTO(user);
        } else {
            return new SelectedClassErrorStatus(2, "User not found" + id + " does not exist");
        }
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(String id, UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}

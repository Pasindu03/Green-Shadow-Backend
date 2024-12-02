package com.example.demo.Service;

import com.example.demo.DTO.IMPL.UserWithKey;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    boolean sendCodeToChangePassword(UserWithKey userWithKey);
}

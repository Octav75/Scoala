package com.sda.spring.security.example.service;

import com.sda.spring.security.example.entities.User;
import com.sda.spring.security.example.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByLogin(String login);

    User save(UserRegistrationDto registration);
}

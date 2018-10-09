package com.example.auth.demo.service;

import com.example.auth.demo.domain.auth.Role;
import com.example.auth.demo.domain.auth.User;
import com.example.auth.demo.mapper.AuthMapper;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 登陆身份认证
 * Author: JoeTao
 * createAt: 2018/9/14
 */
@Component(value="CustomUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    private final AuthMapper authMapper;

    public CustomUserDetailsService(AuthMapper authMapper) {
        this.authMapper = authMapper;
    }

    @Override
    public User loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = authMapper.findByUsername(name);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", name));
        }
        Role role = authMapper.findRoleByUserId(user.getId());
        user.setRole(role);
        return user;
    }
}

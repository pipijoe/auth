package com.example.auth.demo.service;

import com.example.auth.demo.domain.auth.ResponseUserToken;
import com.example.auth.demo.domain.auth.User;

/**
 * Author: JoeTao
 * createAt: 2018/9/17
 */
public interface AuthService {
    User register(User user);

    ResponseUserToken login(String username, String password);

    void logout(String token);

    ResponseUserToken refresh(String oldToken);

    User getUserByToken(String token);
}

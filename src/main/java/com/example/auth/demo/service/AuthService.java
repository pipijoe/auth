package com.example.auth.demo.service;

import com.example.auth.demo.domain.auth.ResponseUserToken;
import com.example.auth.demo.domain.auth.UserDetail;

/**
 * Author: JoeTao
 * createAt: 2018/9/17
 */
public interface AuthService {
    UserDetail register(UserDetail userDetail);

    ResponseUserToken login(String username, String password);

    void logout(String token);

    ResponseUserToken refresh(String oldToken);

    UserDetail getUserByToken(String token);
}

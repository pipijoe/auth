package com.example.auth.demo.domain.auth;

import lombok.Builder;
import lombok.Data;

/**
 * Author: JoeTao
 * createAt: 2018/9/17
 */
@Builder
@Data
public class LoginUser {
    private String name;
    private String password;
}

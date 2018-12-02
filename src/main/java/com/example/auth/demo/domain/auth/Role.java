package com.example.auth.demo.domain.auth;

import lombok.Builder;
import lombok.Data;

/**
 * @author : JoeTao
 * createAt: 2018/9/17
 */
@Data
@Builder
public class Role {
    private Long id;
    private String name;
    private String nameZh;
}

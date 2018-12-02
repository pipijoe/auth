package com.example.auth.demo.domain.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author : JoeTao
 * createAt: 2018/9/17
 */
@Builder
@Data
public class User {
    @ApiModelProperty(value = "用户名", required = true)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}

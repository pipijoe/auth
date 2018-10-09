package com.example.auth.demo.domain.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Author: JoeTao
 * createAt: 2018/9/20
 */
@Data
@Builder
public class AddUser {
    @ApiModelProperty(value = "用户名", required = true)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    @ApiModelProperty(value = "角色，1：系统管理员，2：用户，3：游客", required = true)
    private Long roleId;
}

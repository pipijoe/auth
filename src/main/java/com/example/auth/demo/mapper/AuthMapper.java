package com.example.auth.demo.mapper;

import com.example.auth.demo.domain.auth.Role;
import com.example.auth.demo.domain.auth.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Author: JoeTao
 * createAt: 2018/9/17
 */
@Repository
public interface AuthMapper {
    User findByUsername(@Param("name") String name);
    void insert(@Param("user") User user);
    int insertRole(@Param("userId") long userId, @Param("roleId") long roleId);
    Role findRoleById(@Param("roleId") long roleId);
    Role findRoleByUserId(@Param("userId") long userId);
}

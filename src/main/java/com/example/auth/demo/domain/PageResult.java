package com.example.auth.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * 分页结果DO
 */
public class PageResult<T> {
    private int page;
    private int rows;
    private int total;
    private T data;
}
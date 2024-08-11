package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//分页返回结果
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {

    private Long total;

    private List<T> items;

}

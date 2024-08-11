package com.example.service;

import com.example.pojo.Category;

import java.util.List;

public interface CategoryService {

    //文章分类列表
    List<Category> list();

    //新增文章列表
    void add(Category category);

    //更新文章列表
    void update(Category category);

    //获取文章详情
    Category findById(Integer id);

    //删除文章分类
    void delete(Integer id);
}

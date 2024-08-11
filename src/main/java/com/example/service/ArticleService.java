package com.example.service;

import com.example.pojo.Article;
import com.example.pojo.PageBean;

public interface ArticleService {

    //发布文章
    void add(Article article);

    //更新文章
    void update(Article article);

    //查询文章详情
    Article findById(Integer id);

    //删除文章
    void delete(Integer id);

    //文章列表 条件分页
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}

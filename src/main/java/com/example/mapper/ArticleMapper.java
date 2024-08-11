package com.example.mapper;

import com.example.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {

    //发布文章
    @Insert("insert into article(title,content,cover_img,state,category_id,create_user,create_time,update_time) " +
            "values(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime})")
    void add(Article article);

    //更新文章
    @Update("update article set title=#{title},content=#{content},cover_img=#{coverImg},category_id=#{categoryId},state=#{state} where id=#{id}")
    void update(Article article);

    //查询文章详情
    @Select("select * from article where id = #{id}")
    Article findById(Integer id);

    //删除文章
    @Delete("delete from article where id = #{id}")
    void delete(Integer id);

    //文章列表 条件分类 动态sql在.xml
    List<Article> list(Integer userId, Integer categoryId, String state);
}

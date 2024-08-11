package com.example.mapper;

import com.example.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface CategoryMapper {

    //文章分类列表
    @Select("select * from category where create_user = #{userId}")
    List<Category> list(Integer userId);

    //新增文章列表
    @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time)" +
            "values (#{categoryName},#{categoryAlias},#{createUser},#{createTime},#{updateTime})")
    void add(Category category);

    //更新文章列表
    @Update("update category set category_name = #{categoryName},category_alias = #{categoryAlias}," +
            "update_time = #{updateTime} where id = #{id}")
    void update(Category category);

    //获取文章详情
    @Select("select * from category where id = #{id}")
    Category findById(Integer id);

    //删除文章分类
    @Delete("delete from category where id = #{id}")
    void delete(Integer id);
}

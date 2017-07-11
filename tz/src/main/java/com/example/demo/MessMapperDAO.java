package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MessMapperDAO {
    @Select("SELECT name FROM category where category_id=1;")
   String getMessage( String message);
}

package com.example.springboot_mybaits_demo.mappers;

import com.example.springboot_mybaits_demo.entitys.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Insert("INSERT INTO USER1(id,name,age)VALUES(2,#{name},#{age})")
    Integer save(@Param("name") String name,@Param("age") Integer age);

    @Select("SELECT * FROM USER1")
    List<User> findAll();

}

package com.example.springboot_mybaits_demo.entitys;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user1")
public class User {
    private Long id;
    private String name;
    private Integer age;
}

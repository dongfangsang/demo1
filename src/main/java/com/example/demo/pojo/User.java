package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("User") //不写的话，默认类名为表名
public class User {
    @TableField(exist = false)  //表示表里不存在，其他未注释的必须在表里有才行，不然报错
    private int notexit;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}

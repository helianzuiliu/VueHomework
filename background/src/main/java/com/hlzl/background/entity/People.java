package com.hlzl.background.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class People {
  @TableId(value = "id", type = IdType.AUTO)
  private int id;

  @TableField(value = "name")
  private String name;
  // private int age;

  public People(int id, String name) {
    this.id = id;
    this.name = name;
    // this.age = age;
 }
}

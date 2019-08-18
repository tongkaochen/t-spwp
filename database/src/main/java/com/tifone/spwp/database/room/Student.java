package com.tifone.spwp.database.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Create by Tifone on 2019/8/11.
 * student的数据库表，表名称为std_table
 */
@Entity(tableName = "std_table")
public class Student {
    // 学号
    @NonNull
    @PrimaryKey // 声明为主键
    @ColumnInfo(name = "std_num") // 学号的数据列名
    private String stdNum;

    @NonNull
    @ColumnInfo(name = "name") // 学生名称
    private String name;

    @ColumnInfo(name = "phone_num") // 电话号码
    private String phone;

    @ColumnInfo(name = "gender") // 性别
    private int gender;

    @ColumnInfo(name = "age") // 年龄
    private int age;

    @NonNull
    public String getStdNum() {
        return stdNum;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

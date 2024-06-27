package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@TableName(value = "student")
public class StudentData {
    @TableId(value="student_id")
    private int student_id;
    @TableField(value="student_name")
    private String student_name;
    @TableField(value="gender")
    private String gender;
    @TableField(value="department")
    private String department;
    @TableField(value="major")
    private String major;
    @TableField(value="age")
    private int age;
    @TableField(value="gpa")
    private double gpa;
    @TableField(value="teacher_id")
    private int teacher_id;
    @TableField(value="username")
        private String username;
    @TableField(value="password")
    private String password;
    @TableField(value="extra_info")
    private String extra_info;
    @TableField(value="teacher_name")
    private String teacher_name;
}

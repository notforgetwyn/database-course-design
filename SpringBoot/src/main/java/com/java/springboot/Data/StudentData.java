package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
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
    @TableId(value="ID", type= IdType.INPUT)
    private int ID;

    private String studentName;

    private String gender;

    private String department;

    private String major;

    private int age;

    private double gpa;
    private int teacherId;
    private String teacherName;
}

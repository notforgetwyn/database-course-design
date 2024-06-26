package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentData {
    private int student_id;
    private String student_name;
    private String gender;
    private String department;
    private String major;
    private int age;
    private double gpa;
    private int teacher_id;
    private String extra_info;
    private String teacher_name;
}

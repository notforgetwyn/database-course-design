package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherData {
    private int teacher_id;
    private String teacher_name;
    private String gender;
    private int age;
    private String department;
    private String extra_info;
        private String major;
}

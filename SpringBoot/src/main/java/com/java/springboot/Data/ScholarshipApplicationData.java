package com.java.springboot.Data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@TableName(value = "scholarshipapplication")
public class ScholarshipApplicationData {
    @TableId(value="ID", type= IdType.INPUT)
    private int ID ;
    private String scholarshipName;
    private String scholarshipType;
    private int studentId;
        private String studentName;
    private String teacher_approval;
    private String extra_info;
}

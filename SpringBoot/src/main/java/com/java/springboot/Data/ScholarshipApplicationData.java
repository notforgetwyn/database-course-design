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
    @TableId(value = "application_id", type= IdType.AUTO)
    private int application_id ;
    @TableField(value="scholarship_name")
    private String scholarship_name;
    @TableField(value="scholarship_type")
    private String scholarship_type;
    @TableField(value="application_materials")
    private String application_materials;
    @TableField(value="student_id")
    private int student_id;
    @TableField(value="student_name")
        private String student_name;
    @TableField(value="teacher_approval")
    private String teacher_approval;
    @TableField(value="extra_info")
    private String extra_info;
}

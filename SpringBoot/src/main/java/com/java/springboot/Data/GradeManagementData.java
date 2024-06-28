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

@TableName(value = "grademanagement")
public class GradeManagementData {
    @TableId(value="grade_id", type= IdType.AUTO)
    private int grade_id ;
    @TableField(value="subject_name")
    private String subject_name;
    @TableField(value="subject_rank")
    private int subject_rank;
    @TableField(value="subject_grade")
    private double subject_grade;
    @TableField(value="student_id")
    private int student_id;
    @TableField(value="student_name")
    private String student_name;
    @TableField(value="extra_info")
    private String extra_info;
}

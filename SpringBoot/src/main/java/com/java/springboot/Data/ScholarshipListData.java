package com.java.springboot.Data;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "scholarshiplist")
public class ScholarshipListData {
    @TableId(value="scholarship_id")
    private int scholarship_id;
    @TableField(value="scholarship_name")
    private String scholarship_name;
    @TableField(value="scholarship_type")
    private String scholarship_type;
    @TableField(value="scholarship_level")
    private String scholarship_level;
    @TableField(value="student_id")
    private int student_id;
    @TableField(value="student_name")
    private String student_name;
    @TableField(value="extra_info")
     private String extra_info;
}

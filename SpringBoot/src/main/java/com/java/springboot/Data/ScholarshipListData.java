package com.java.springboot.Data;

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
@TableName(value = "scholarshiplist")
public class ScholarshipListData {
    @TableId(value="ID", type= IdType.INPUT)
    private int ID;
    private String scholarshipName;
    private String scholarshipType;
    private String applicationMaterials;
    private int studentId;
    private String studentName;
    private String teacherApproval;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

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
    @TableId(value="ID", type= IdType.INPUT)
    private int ID;
    private int subjectName;
    private int subjectRank;
    private int subjectGrade;
    private int studentId;
    private int studentName;
    private int total;
      private int socialExtra;
}

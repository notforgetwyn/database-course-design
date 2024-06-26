package com.java.springboot.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeManagementData {
    private int grade_id ;
    private String subject_name;
    private int subject_rank;
    private double subject_grade;
    private int student_id;
    private String student_name;
    private String extra_info;
}

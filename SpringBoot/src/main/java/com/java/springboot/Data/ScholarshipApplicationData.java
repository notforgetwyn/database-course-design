package com.java.springboot.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScholarshipApplicationData {
    private int application_id ;
    private String scholarship_name;
    private String scholarship_type;
    private String application_materials;
    private int student_id;
    private String teacher_approval;
    private String extra_info;
}

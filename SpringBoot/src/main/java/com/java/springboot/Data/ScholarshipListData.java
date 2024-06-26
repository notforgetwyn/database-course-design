package com.java.springboot.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScholarshipListData {
    private int Scholarship_id;
    private String scholarship_name;
    private String scholarship_type;
    private String scholarship_level;
    private int student_id;
    private String student_name;
     private String extra_info;
}

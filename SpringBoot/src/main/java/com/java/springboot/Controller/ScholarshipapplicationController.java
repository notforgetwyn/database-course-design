package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.Data.ScholarshipApplicationData;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.ScholarshipapplicationSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScholarshipapplicationController {
    @Autowired
    ScholarshipapplicationSeverimp Scholarshipapplicationseverimp;
@GetMapping("/ScholarshipApp")
    public Result GetDataAll() {
       List<ScholarshipApplicationData> result= Scholarshipapplicationseverimp.list();
    return new Result();
    }
}


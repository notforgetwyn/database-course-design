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
    if(!Scholarshipapplicationseverimp.list().isEmpty())
 return new Result().success( 200,"success",Scholarshipapplicationseverimp.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
}


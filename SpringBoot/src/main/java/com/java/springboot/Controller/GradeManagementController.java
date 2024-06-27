package com.java.springboot.Controller;

import com.java.springboot.Data.GradeManagementData;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.GradeManagementSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradeManagementController {
    @Autowired
    GradeManagementSeverimp GrademanagementSeverimp;
@GetMapping("/Grade")
    public Result GetDataAll() {
       List<GradeManagementData> result= GrademanagementSeverimp.list();
    return new Result();
    }
}



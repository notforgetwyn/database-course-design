package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.TeacherSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherSeverimp Teacherseverimp;
@GetMapping("/teacher")
    public Result GetDataAll() {
   List<TeacherData> result= Teacherseverimp.list();
    return new Result();
    }
}

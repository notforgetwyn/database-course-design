package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.Data.StudentData;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.StudentSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentSeverimp Studentseverimp;
@GetMapping("/student")
    public Result GetDataAll() {
       List<StudentData> result= Studentseverimp.list();
    return new Result();
    }
}

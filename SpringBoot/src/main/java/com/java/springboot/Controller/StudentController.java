package com.java.springboot.Controller;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import com.java.springboot.server.StudentSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentSever studentsever;
@GetMapping("/student")
    public Result InsertStu(StudentPojo requestData) {
    studentsever.insert(requestData);
return new Result().Success(1);
}
@PostMapping("/student")
public Result SeleteStu() {
    return new Result().Success(studentsever.select());
}
}

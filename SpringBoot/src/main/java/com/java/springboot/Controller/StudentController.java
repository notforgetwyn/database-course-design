package com.java.springboot.Controller;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import com.java.springboot.server.StudentSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentSever studentsever;
@GetMapping("/student")
    public Result Selete(StudentPojo requestData) {
    studentsever.Select(requestData);
return new Result().Success(1);
}
@PostMapping("/student")
public Result SeleteAll() {
    return new Result().Success(studentsever.SelectAll());
}
}

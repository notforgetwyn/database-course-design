package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.StudentSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class StudentController {
    @Autowired
    StudentSeverimp Studentseverimp;
@GetMapping("/student")
    public Result GetDataAll() {
return new Result().Success(Studentseverimp.GetDataAll());
}
@PostMapping("/student")
public Result GetData() {
    return new Result().Success(Studentseverimp.GetData());
}

}
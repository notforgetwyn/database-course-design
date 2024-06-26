package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.TeacherSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class TeacherController {
    @Autowired
    TeacherSeverimp Teacherseverimp;
@GetMapping("/teacher")
    public Result GetDataAll() {
return new Result().Success(Teacherseverimp.GetDataAll());
}
@PostMapping("/teacher")
public Result GetData() {
    return new Result().Success(Teacherseverimp.GetData());
}

}
package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.ScholarshipapplicationSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ScholarshipapplicationController {
    @Autowired
    ScholarshipapplicationSeverimp Scholarshipapplicationseverimp;
@GetMapping("/ScholarshipApp")
    public Result GetDataAll() {
return new Result().Success(Scholarshipapplicationseverimp.GetDataAll());
}
@PostMapping("/ScholarshipApp")
public Result GetData() {
    return new Result().Success(Scholarshipapplicationseverimp.GetData());
}

}

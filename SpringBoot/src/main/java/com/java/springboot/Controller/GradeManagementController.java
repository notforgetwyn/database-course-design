package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.GradeManagementSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class GradeManagementController {
    @Autowired
    GradeManagementSeverimp GrademanagementSeverimp;
@GetMapping("/Grade")
    public Result GetDataAll() {
return new Result().Success(GrademanagementSeverimp.GetDataAll());
}
@PostMapping("/Grade")
public Result GetData() {
    return new Result().Success(GrademanagementSeverimp.GetData());
}

}


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
        if (!GrademanagementSeverimp.list().isEmpty())
            return new Result().success(200, "success", GrademanagementSeverimp.list());
        else {
            return new Result().success(200, "error", null);
        }
    }
}



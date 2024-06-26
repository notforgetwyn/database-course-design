package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.ScholarshipListSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ScholarshipListController {
    @Autowired
    ScholarshipListSeverimp ScholarshiplistSeverimp;
@GetMapping("/ScholarshipList")
    public Result GetDataAll() {
return new Result().Success(ScholarshiplistSeverimp.GetDataAll());
}
@PostMapping("/ScholarshipList")
public Result GetData() {
    return new Result().Success(ScholarshiplistSeverimp.GetData());
}

}

package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.Data.ScholarshipListData;
import com.java.springboot.server.ScholarshipListSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScholarshipListController {
    @Autowired
    ScholarshipListSeverimp ScholarshiplistSeverimp;
@GetMapping("/ScholarshipList")
    public Result GetDataAll() {
    if(!ScholarshiplistSeverimp.list().isEmpty())
 return new Result().success( 200,"success",ScholarshiplistSeverimp.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
}


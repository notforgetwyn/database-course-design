package com.java.springboot.Controller;

import com.java.springboot.Data.AdminData;
import com.java.springboot.Data.Result;
import com.java.springboot.server.AdminSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminSeverimp    Adminseverimp;
@GetMapping("/Admin")
    public Result GetDataAll() {
       List<AdminData> result= Adminseverimp.list();
    return new Result.Success(result);

    }

}
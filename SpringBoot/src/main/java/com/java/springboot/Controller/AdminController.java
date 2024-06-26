package com.java.springboot.Controller;

import com.java.springboot.Data.Result;
import com.java.springboot.server.AdminSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class AdminController {
    @Autowired
    AdminSeverimp    Adminseverimp;
@GetMapping("/Admin")
    public Result GetDataAll() {
return new Result().Success(Adminseverimp.GetDataAll());
}
@PostMapping("/Admin")
public Result GetData() {
    return new Result().Success(Adminseverimp.GetData());
}

}

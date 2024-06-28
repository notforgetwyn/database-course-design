package com.java.springboot.Controller;
import com.java.springboot.Data.Result;
import com.java.springboot.server.AdminSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    AdminSeverimp Adminseverimp;

    @GetMapping("/Admin")
    public Result GetDataAll() {
        if (!Adminseverimp.list().isEmpty())
            return new Result().success(200, "success", Adminseverimp.list());
        else {
            return new Result().success(200, "error", null);
        }
    }

}


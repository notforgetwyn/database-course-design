package com.java.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.AdminData;
import com.java.springboot.Data.Result;
import com.java.springboot.server.AdminSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
  @GetMapping("/Admin/one")
    public Result GetData(String Admin_id) {
        QueryWrapper<AdminData> rapper=new QueryWrapper<AdminData>().eq("ID",Admin_id);
        if (!Adminseverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", Adminseverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/Admin/del")
    public Result DeletetData(String Admin_id) {
        boolean flag = Adminseverimp.removeById(Admin_id);
        if (flag)
            return new Result().success(200, "success",Adminseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/Admin/dels")
    public Result DeletetData(@RequestBody List<String> Admin_id) {
             boolean flag= Adminseverimp.removeByIds(Admin_id);
        if (flag)
            return new Result().success(200, "success",Adminseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/Admin")
        public Result ChangedData( @RequestBody AdminData dialogData) {
              boolean flag = Adminseverimp.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",Adminseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}


package com.java.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.TeacherSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherSeverimp Teacherseverimp;
@GetMapping("/teacher")
    public Result GetDataAll() {
    if(!Teacherseverimp.list().isEmpty())
 return new Result().success( 200,"success",Teacherseverimp.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
      @GetMapping("/teacher/one")
    public Result GetData(String grade_id) {
        QueryWrapper<TeacherData> rapper=new QueryWrapper<TeacherData>().eq("ID",grade_id);
        if (!Teacherseverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", Teacherseverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/teacher/del")
    public Result DeletetData(String grade_id) {
        boolean flag = Teacherseverimp.removeById(grade_id);
        if (flag)
            return new Result().success(200, "success",Teacherseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/teacher/dels")
    public Result DeletetData(@RequestBody List<String> grade_id) {
             boolean flag= Teacherseverimp.removeByIds(grade_id);
        if (flag)
            return new Result().success(200, "success",Teacherseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/teacher")
        public Result ChangedData( @RequestBody TeacherData dialogData) {
              boolean flag = Teacherseverimp.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",Teacherseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}

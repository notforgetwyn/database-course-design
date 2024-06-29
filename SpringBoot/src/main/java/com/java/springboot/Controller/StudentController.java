package com.java.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.StudentData;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.StudentData;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.server.NoticeSeverimp;
import com.java.springboot.server.StudentSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentSeverimp Studentseverimp;
@GetMapping("/student")
    public Result GetDataAll() {
    if(!Studentseverimp.list().isEmpty())
 return new Result().success( 200,"success",Studentseverimp.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
      @GetMapping("/student/one")
    public Result GetData(String grade_id) {
        QueryWrapper<StudentData> rapper=new QueryWrapper<StudentData>().eq("ID",grade_id);
        if (!Studentseverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", Studentseverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/student/del")
    public Result DeletetData(String grade_id) {
        boolean flag = Studentseverimp.removeById(grade_id);
        if (flag)
            return new Result().success(200, "success",Studentseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/student/dels")
    public Result DeletetData(@RequestBody List<String> grade_id) {
             boolean flag= Studentseverimp.removeByIds(grade_id);
        if (flag)
            return new Result().success(200, "success",Studentseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/student")
        public Result ChangedData( @RequestBody StudentData dialogData) {
              boolean flag = Studentseverimp.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",Studentseverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}

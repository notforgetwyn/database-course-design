package com.java.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.ScholarshipListData;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.ScholarshipListData;
import com.java.springboot.Data.StudentData;
import com.java.springboot.server.ScholarshipListSeverimp;
import com.java.springboot.server.StudentSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScholarshipListController {
    @Autowired
    ScholarshipListSeverimp ScholarshiplistSeverimp;
    @Autowired
    StudentSeverimp Studentseverimp;
@GetMapping("/ScholarshipList")
    public Result GetDataAll() {
    if(!ScholarshiplistSeverimp.list().isEmpty())
 return new Result().success( 200,"success",ScholarshiplistSeverimp.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
      @GetMapping("/ScholarshipList/one")
    public Result GetData(String grade_id) {
        QueryWrapper<ScholarshipListData> rapper=new QueryWrapper<ScholarshipListData>().eq("ID",grade_id);
        if (!ScholarshiplistSeverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", ScholarshiplistSeverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/ScholarshipList/stu")
    public Result GetStudentData(String studentId) {
        QueryWrapper<ScholarshipListData> rapper=new QueryWrapper<ScholarshipListData>().eq("student_id",studentId);
        if (!ScholarshiplistSeverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", ScholarshiplistSeverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
        @GetMapping("/ScholarshipList/tea")
    public Result GetTeacherData(String studentId) {
QueryWrapper<StudentData> wrapper=new QueryWrapper<StudentData>().select("ID")
        .eq("teacher_id",studentId);
List<Integer> temp =new ArrayList<>();
for(StudentData studentData:Studentseverimp.list(wrapper)) {
    temp.add(studentData.getID());
}
        QueryWrapper<ScholarshipListData> rapper=new QueryWrapper<ScholarshipListData>().in("student_id",temp);
        if (!ScholarshiplistSeverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", ScholarshiplistSeverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/ScholarshipList/del")
    public Result DeletetData(String grade_id) {
        boolean flag = ScholarshiplistSeverimp.removeById(grade_id);
        if (flag)
            return new Result().success(200, "success",ScholarshiplistSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/ScholarshipList/dels")
    public Result DeletetData(@RequestBody List<String> grade_id) {
             boolean flag= ScholarshiplistSeverimp.removeByIds(grade_id);
        if (flag)
            return new Result().success(200, "success",ScholarshiplistSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/ScholarshipList")
        public Result ChangedData( @RequestBody ScholarshipListData dialogData) {
              boolean flag = ScholarshiplistSeverimp.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",ScholarshiplistSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}


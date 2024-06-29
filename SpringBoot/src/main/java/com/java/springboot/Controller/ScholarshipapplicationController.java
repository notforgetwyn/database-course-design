//package com.java.springboot.Controller;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.java.springboot.Data.GradeManagementData;
//import com.java.springboot.Data.Result;
//import com.java.springboot.Data.ScholarshipApplicationData;
//import com.java.springboot.Data.TeacherData;
//import com.java.springboot.server.NoticeSeverimp;
//import com.java.springboot.server.ScholarshipapplicationSeverimp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ScholarshipapplicationController {
//    @Autowired
//    ScholarshipapplicationSeverimp Scholarshipapplicationseverimp;
//@GetMapping("/ScholarshipApp")
//    public Result GetDataAll() {
//    if(!Scholarshipapplicationseverimp.list().isEmpty())
// return new Result().success( 200,"success",Scholarshipapplicationseverimp.list());
//    else {
//        return new Result().success( 200,"error",null);
//    }
//    }
//      @GetMapping("/Grade/one")
//    public Result GetData(String grade_id) {
//        QueryWrapper<GradeManagementData> rapper=new QueryWrapper<GradeManagementData>().eq("ID",grade_id);
//        if (!Scholarshipapplicationseverimp.list(rapper).isEmpty())
//            return new Result().success(200, "success", Scholarshipapplicationseverimp.list(rapper));
//        else {
//            return new Result().error(200, "error", null);
//        }
//    }
//    @GetMapping("/Grade/del")
//    public Result DeletetData(String grade_id) {
//        boolean flag = Scholarshipapplicationseverimp.removeById(grade_id);
//        if (flag)
//            return new Result().success(200, "success",Scholarshipapplicationseverimp.list() );
//        else {
//            return new Result().error(200, "error", null);
//        }
//    }
//        @PostMapping("/Grade/dels")
//    public Result DeletetData(@RequestBody List<String> grade_id) {
//             boolean flag= Scholarshipapplicationseverimp.removeByIds(grade_id);
//        if (flag)
//            return new Result().success(200, "success",Scholarshipapplicationseverimp.list() );
//        else {
//            return new Result().error(200, "error", null);
//        }
//    }
//    @PostMapping("/Grade")
//        public Result ChangedData( @RequestBody GradeManagementData dialogData) {
//              boolean flag = Scholarshipapplicationseverimp.saveOrUpdate(dialogData);
//        if (flag)
//            return new Result().success(200, "success",Scholarshipapplicationseverimp.list() );
//        else {
//            return new Result().error(200, "error", null);
//        }
//    }
//}
//

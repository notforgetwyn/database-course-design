package com.java.springboot.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.GradeManagementData;
import com.java.springboot.Data.Result;
import com.java.springboot.server.GradeManagementSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradeManagementController {
    @Autowired
    GradeManagementSeverimp GrademanagementSeverimp;

    @GetMapping("/Grade")
    public Result GetDataAll() {
        if (!GrademanagementSeverimp.list().isEmpty())
            return new Result().success(200, "success", GrademanagementSeverimp.list());
        else {
            return new Result().success(200, "error", null);
        }
    }
    @GetMapping("/Grade/one")
    public Result GetData(String grade_id) {
        QueryWrapper <GradeManagementData>rapper=new QueryWrapper<GradeManagementData>().eq("ID",grade_id);
        if (!GrademanagementSeverimp.list(rapper).isEmpty())
            return new Result().success(200, "success", GrademanagementSeverimp.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/Grade/del")
    public Result DeletetData(String grade_id) {
        boolean flag = GrademanagementSeverimp.removeById(grade_id);
        if (flag)
            return new Result().success(200, "success",GrademanagementSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/Grade/dels")
    public Result DeletetData(@RequestBody List<String> grade_id) {
             boolean flag= GrademanagementSeverimp.removeByIds(grade_id);
        if (flag)
            return new Result().success(200, "success",GrademanagementSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/Grade")
        public Result ChangedData( @RequestBody GradeManagementData dialogData) {
              boolean flag = GrademanagementSeverimp.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",GrademanagementSeverimp.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}



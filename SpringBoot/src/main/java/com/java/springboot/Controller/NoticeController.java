package com.java.springboot.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.server.NoticeSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticeController {
    @Autowired
    NoticeSeverimp Noticesever;
@GetMapping("/Notice")
    public Result GetDataAll() {
    if(!Noticesever.list().isEmpty())
 return new Result().success( 200,"success",Noticesever.list());
    else {
        return new Result().success( 200,"error",null);
    }
    }
     @GetMapping("/Notice/one")
    public Result GetData(String grade_id) {
        QueryWrapper<NoticeData> rapper=new QueryWrapper<NoticeData>().eq("ID",grade_id);
        if (!Noticesever.list(rapper).isEmpty())
            return new Result().success(200, "success", Noticesever.list(rapper));
        else {
            return new Result().error(200, "error", null);
        }
    }
    @GetMapping("/Notice/del")
    public Result DeletetData(String grade_id) {
        boolean flag = Noticesever.removeById(grade_id);
        if (flag)
            return new Result().success(200, "success",Noticesever.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
        @PostMapping("/Notice/dels")
    public Result DeletetData(@RequestBody List<String> grade_id) {
             boolean flag= Noticesever.removeByIds(grade_id);
        if (flag)
            return new Result().success(200, "success",Noticesever.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
    @PostMapping("/Notice")
        public Result ChangedData( @RequestBody NoticeData dialogData) {
              boolean flag = Noticesever.saveOrUpdate(dialogData);
        if (flag)
            return new Result().success(200, "success",Noticesever.list() );
        else {
            return new Result().error(200, "error", null);
        }
    }
}


package com.java.springboot.Controller;

import com.java.springboot.Data.NoticeData;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.TeacherData;
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
       List<NoticeData> result= Noticesever.list();
    return new Result();
    }
}


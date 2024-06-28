package com.java.springboot.Controller;
import com.java.springboot.Data.Result;
import com.java.springboot.server.NoticeSeverimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
}


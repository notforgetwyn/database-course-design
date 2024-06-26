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
return new Result().Success(Noticesever.GetDataAll());
}
@PostMapping("/Notice")
public Result GetData() {
    return new Result().Success(Noticesever.GetData());
}

}

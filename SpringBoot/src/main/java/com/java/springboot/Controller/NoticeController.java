package com.java.springboot.Controller;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.Notice;
import com.java.springboot.server.NoticeSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoticeController {
    @Autowired
    NoticeSever Noticesever;
@GetMapping("/Notice")
    public Result Selete(Notice requestData) {
    Noticesever.Select(requestData);
return new Result().Success(1);
}
@PostMapping("/Notice")
public Result SeleteAll() {
    return new Result().Success(Noticesever.SelectAll());
}
}

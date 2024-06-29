package com.java.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.springboot.Data.Result;
import com.java.springboot.Data.UserData;
import com.java.springboot.server.UserSeverimp;
import com.java.springboot.util.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserSeverimp Userseverimp;

    @GetMapping("/user")
    public Result UserLogin( UserData object) {
        QueryWrapper<UserData> rapper = new QueryWrapper<UserData>().select("id", "role")
                .eq("ID", object.getID()).eq("password", object.getPassword());
        List<UserData> ListID = Userseverimp.list(rapper);
        if (ListID.isEmpty()) {
            return new Result().error(000, "error", null);
        } else {
            Map<String, Object> claims = new HashMap<>();
            claims.put("name", object.getID());
            claims.put("username", object.getPassword());
            String jwt = Jwt.CreatedJwt(claims);
            ListID.get(0).setToken(jwt);
            return new Result().success(200, "success",ListID.get(0));
        }

    }
}

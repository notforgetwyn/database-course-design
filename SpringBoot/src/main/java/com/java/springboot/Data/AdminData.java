package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminData {
    private int admin_id ;
    private String username;
    private String password;
    private String permissions;
}

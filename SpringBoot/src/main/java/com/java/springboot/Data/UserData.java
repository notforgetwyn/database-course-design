package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@TableName(value = "user")
public class UserData {
    @TableId(value="ID", type= IdType.INPUT)
    private String ID;
    @TableField(value="password")
    private String password;
    @TableField(value="role")
    private String role;
    @TableField(exist = false)
     private String token;
}

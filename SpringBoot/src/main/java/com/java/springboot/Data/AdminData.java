package com.java.springboot.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "admin")
public class AdminData {
    @TableId(value="admin_id")
    private int admin_id ;
    @TableField(value="username")
    private String username;
   @TableField(value="password")
    private String password;
   @TableField(value="permissions")
    private String permissions;
}

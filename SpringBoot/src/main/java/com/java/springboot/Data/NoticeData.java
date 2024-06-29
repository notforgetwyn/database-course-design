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

@TableName(value = "notices")
public class NoticeData {
    @TableId(value="ID", type= IdType.INPUT)
    private int ID;
    private String title;
    private String content;
    private LocalDateTime publishDate;
    private String attachment;
    private int viewCount;
    private String createdAt;
    private String updatedAt;
}

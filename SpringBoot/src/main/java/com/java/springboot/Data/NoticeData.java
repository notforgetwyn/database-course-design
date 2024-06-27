package com.java.springboot.Data;

import cn.hutool.json.JSONObject;
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
    @TableId(value="notice_id")
    private int notice_id;
    @TableField(value="title")
    private String title;
    @TableField(value="content")
    private String content;
    @TableField(value="publish_date")
    private LocalDateTime publish_date;
    @TableField(value="attachment")
    private String attachment;
    @TableField(value="view_count")
    private int view_count;
}

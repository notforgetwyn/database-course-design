package com.java.springboot.Data;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeData {
    private int notice_id;
    private String title;
    private String content;
    private LocalDateTime publish_date;
    private JsonNode attachment;
    private int view_count;
}

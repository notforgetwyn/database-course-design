package com.java.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeData {
    private int noticeId;
    private String title;
    private String context;
    private LocalDateTime publishDate;
    private int viewCount;
}

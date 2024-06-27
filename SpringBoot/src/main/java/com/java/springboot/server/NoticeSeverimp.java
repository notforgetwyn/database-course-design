package com.java.springboot.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.server.Interface.NoticeSever;
import org.springframework.stereotype.Service;

@Service
public class NoticeSeverimp extends ServiceImpl<NoticeDao, NoticeData> implements NoticeSever {

}

package com.java.springboot.server;

import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.Data.NoticeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeSeverimp implements com.java.springboot.server.Interface.NoticeSever {
    @Autowired
    NoticeDao Noticedao;
    Oss oss;
    @Override
    public NoticeData[ ] GetDataAll() {
      return Noticedao. GetDataAll();
    }
    @Override
    public NoticeData GetData() {
      return Noticedao.GetData();
    }

}

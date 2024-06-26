package com.java.springboot.server;

import com.java.springboot.Controller.NoticeController;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.Notice;
import com.java.springboot.server.Interface.NoticeSeverInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeSever implements NoticeSeverInter {
    @Autowired
    NoticeDao Noticedao;
    @Override
    public void Select(Notice requestData) {
       Noticedao.Select(requestData.getCno(),requestData.getSno(),requestData.getGrade());
    }

    @Override
    public Notice[] SelectAll() {
      return Noticedao.SelectAll();
    }
}

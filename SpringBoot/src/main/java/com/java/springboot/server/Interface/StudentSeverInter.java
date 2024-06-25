package com.java.springboot.server.Interface;

import com.java.springboot.dao.NoticeDao;
import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface NoticeSeverInter {
  public void Select(Notice requestData);
  public Notice[] SelectAll();
}

package com.java.springboot.server.Interface;

import com.java.springboot.pojo.Notice;

public interface NoticeSever {
  public void Select(Notice requestData);
  public Notice[] SelectAll();
}

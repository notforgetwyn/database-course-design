package com.java.springboot.server.Interface;

import com.java.springboot.Data.NoticeData;

public interface NoticeSever {
  public NoticeData[] GetDataAll();
  public NoticeData GetData();

}

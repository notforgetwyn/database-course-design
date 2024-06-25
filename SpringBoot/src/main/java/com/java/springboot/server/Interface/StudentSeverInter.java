package com.java.springboot.server.Interface;

import com.java.springboot.dao.StudentDao;
import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface StudentSeverInter {
  public void Select(StudentPojo requestData);
  public StudentPojo[] SelectAll();
}

package com.java.springboot.server;

import com.java.springboot.Controller.StudentController;
import com.java.springboot.dao.StudentDao;
import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import com.java.springboot.server.Interface.StudentSeverInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSever implements StudentSeverInter {
    @Autowired
    StudentDao studentdao;
    @Override
    public void insert(StudentPojo requestData) {
       studentdao.InsertStu(requestData.getCno(),requestData.getSno(),requestData.getGrade());
    }
}

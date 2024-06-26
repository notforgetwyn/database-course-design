package com.java.springboot.server;

import cn.hutool.json.JSONArray;
import com.java.springboot.Data.StudentData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSeverimp {
    @Autowired
    StudentDao Studentdao;
    Oss oss;
    public StudentData[ ] GetDataAll() {
        return Studentdao. GetDataAll();
    }
    public StudentData GetData() {

      return Studentdao.GetData();
    }

}

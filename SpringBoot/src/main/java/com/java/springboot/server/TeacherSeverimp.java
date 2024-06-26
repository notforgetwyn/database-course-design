package com.java.springboot.server;

import cn.hutool.json.JSONArray;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.dao.TeacherDao;
import com.java.springboot.server.Interface.NoticeSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherSeverimp  {
    @Autowired
    TeacherDao Teacherdao;
    Oss oss;
    public TeacherData[ ] GetDataAll() {
        return Teacherdao. GetDataAll();
    }
    public TeacherData GetData() {

      return Teacherdao.GetData();
    }

}

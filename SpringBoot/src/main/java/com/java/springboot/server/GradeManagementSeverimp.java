package com.java.springboot.server;

import cn.hutool.json.JSONArray;
import com.java.springboot.Data.GradeManagementData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.GradeManagementDao;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.server.Interface.NoticeSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeManagementSeverimp {
    @Autowired
    GradeManagementDao GrademanagementDao;
    Oss oss;
    public GradeManagementData[ ] GetDataAll() {
        return GrademanagementDao. GetDataAll();
    }
    public GradeManagementData GetData() {

      return GrademanagementDao.GetData();
    }

}

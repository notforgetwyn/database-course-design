package com.java.springboot.server;

import cn.hutool.json.JSONArray;
import com.java.springboot.Data.ScholarshipApplicationData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.NoticeDao;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.dao.ScholarshipApplicationDao;
import com.java.springboot.server.Interface.NoticeSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipapplicationSeverimp  {
    @Autowired
    ScholarshipApplicationDao ScholarshipapplicationDao;
    Oss oss;
    public ScholarshipApplicationData[ ] GetDataAll() {
        return ScholarshipapplicationDao. GetDataAll();
    }
    public ScholarshipApplicationData GetData() {

      return ScholarshipapplicationDao.GetData();
    }

}

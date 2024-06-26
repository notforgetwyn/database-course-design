package com.java.springboot.server;

import cn.hutool.json.JSONArray;
import com.java.springboot.Data.ScholarshipListData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.ScholarshipListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipListSeverimp  {
    @Autowired
    ScholarshipListDao ScholarshiplistDao;
    Oss oss;
    public ScholarshipListData[ ] GetDataAll() {
        return ScholarshiplistDao. GetDataAll();
    }
    public ScholarshipListData GetData() {

      return ScholarshiplistDao.GetData();
    }

}

package com.java.springboot.server;

import com.java.springboot.Data.AdminData;
import com.java.springboot.aliyun.Oss;
import com.java.springboot.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminSeverimp  {
    @Autowired
    AdminDao Admindao;
    Oss oss;
    public AdminData[ ] GetDataAll() {
        return Admindao.GetDataAll();
    }
    public AdminData GetData() {

      return Admindao.GetData();
    }

}


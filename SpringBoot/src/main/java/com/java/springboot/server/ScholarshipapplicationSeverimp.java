package com.java.springboot.server;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.ScholarshipApplicationData;
import com.java.springboot.dao.ScholarshipApplicationDao;
import com.java.springboot.server.Interface.ScholarshipapplicationSever;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipapplicationSeverimp extends ServiceImpl<ScholarshipApplicationDao, ScholarshipApplicationData> implements ScholarshipapplicationSever {
}

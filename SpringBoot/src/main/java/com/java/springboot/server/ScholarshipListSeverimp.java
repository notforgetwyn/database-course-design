package com.java.springboot.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.ScholarshipListData;
import com.java.springboot.dao.ScholarshipListDao;
import com.java.springboot.server.Interface.ScholarshipListSever;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipListSeverimp extends ServiceImpl<ScholarshipListDao, ScholarshipListData> implements ScholarshipListSever {
}

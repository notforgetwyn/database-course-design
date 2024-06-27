package com.java.springboot.server;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.GradeManagementData;
import com.java.springboot.dao.GradeManagementDao;
import com.java.springboot.server.Interface.GradeManagementSever;
import org.springframework.stereotype.Service;

@Service
public class GradeManagementSeverimp extends ServiceImpl<GradeManagementDao, GradeManagementData> implements GradeManagementSever {
}

package com.java.springboot.server;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.AdminData;
import com.java.springboot.dao.AdminDao;
import com.java.springboot.server.Interface.AdminSever;
import com.java.springboot.util.Oss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminSeverimp extends ServiceImpl<AdminDao, AdminData> implements AdminSever {
}
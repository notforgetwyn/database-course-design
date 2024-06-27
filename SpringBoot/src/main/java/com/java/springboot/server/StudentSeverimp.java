package com.java.springboot.server;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.StudentData;
import com.java.springboot.dao.StudentDao;
import com.java.springboot.server.Interface.StudentSever;
import org.springframework.stereotype.Service;

@Service
public class StudentSeverimp extends ServiceImpl<StudentDao, StudentData> implements StudentSever {
}

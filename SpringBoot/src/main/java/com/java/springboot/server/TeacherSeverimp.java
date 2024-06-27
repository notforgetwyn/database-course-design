package com.java.springboot.server;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.dao.TeacherDao;
import com.java.springboot.server.Interface.TeacherSever;
import org.springframework.stereotype.Service;

@Service
public class TeacherSeverimp extends ServiceImpl<TeacherDao, TeacherData> implements TeacherSever {
}

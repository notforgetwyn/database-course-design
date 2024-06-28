package com.java.springboot.server;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.springboot.Data.TeacherData;
import com.java.springboot.Data.UserData;
import com.java.springboot.dao.TeacherDao;
import com.java.springboot.dao.UserDao;
import com.java.springboot.server.Interface.TeacherSever;
import com.java.springboot.server.Interface.UserSever;
import org.springframework.stereotype.Service;

@Service
public class UserSeverimp extends ServiceImpl<UserDao, UserData> implements UserSever {
}

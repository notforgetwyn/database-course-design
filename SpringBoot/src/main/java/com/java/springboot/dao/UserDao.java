package com.java.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.java.springboot.Data.UserData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserData> {
}

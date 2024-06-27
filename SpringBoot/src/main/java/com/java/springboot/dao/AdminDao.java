package com.java.springboot.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.Data.AdminData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends BaseMapper<AdminData> {

}

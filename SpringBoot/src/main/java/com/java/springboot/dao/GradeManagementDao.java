package com.java.springboot.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.Data.GradeManagementData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GradeManagementDao extends BaseMapper<GradeManagementData> {

}

package com.java.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.Data.ScholarshipApplicationData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScholarshipApplicationDao extends BaseMapper<ScholarshipApplicationData> {
}

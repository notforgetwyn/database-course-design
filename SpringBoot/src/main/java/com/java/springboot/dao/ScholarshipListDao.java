package com.java.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.Data.ScholarshipListData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScholarshipListDao extends BaseMapper<ScholarshipListData> {
}

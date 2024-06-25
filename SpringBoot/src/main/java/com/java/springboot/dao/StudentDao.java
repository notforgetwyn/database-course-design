package com.java.springboot.dao;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.Notice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface NoticeDao {
@Select("select *from sc where sno=#{sno}  ;")
    Notice Select(String sno,String cno,int grade);
@Select("select *from sc ;")
    Notice[] SelectAll();
}

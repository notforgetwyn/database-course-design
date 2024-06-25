package com.java.springboot.dao;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface StudentDao {
@Select("select *from sc where sno=#{sno}  ;")
    StudentPojo Select(String sno,String cno,int grade);
@Select("select *from sc ;")
    StudentPojo[] SelectAll();
}

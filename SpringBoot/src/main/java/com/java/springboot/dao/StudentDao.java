package com.java.springboot.dao;

import com.java.springboot.pojo.Result;
import com.java.springboot.pojo.StudentPojo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {
    @Insert("insert into sc values(#{sno},#{cno},#{grade})")
    void InsertStu(String sno, String cno, int grade);

}

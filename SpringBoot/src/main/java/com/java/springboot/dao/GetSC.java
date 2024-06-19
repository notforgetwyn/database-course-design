package com.java.springboot.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface GetSC {
    @Select("SELECT *FROM SC")
    public List<result> resul();
}

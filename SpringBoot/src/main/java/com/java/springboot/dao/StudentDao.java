package com.java.springboot.dao;

import com.java.springboot.Data.NoticeData;
import com.java.springboot.Data.StudentData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {
@Select("select  * from student"  )
StudentData[] GetDataAll();

@Select("select notice_id,title,content,publish_date,publish_date,view_count  from notices where notice_id=1"  )
StudentData GetData();

}

package com.java.springboot.dao;
import com.java.springboot.Data.GradeManagementData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GradeManagementDao  {
@Select("select  * from grademanagement"  )
GradeManagementData[] GetDataAll();

@Select("select notice_id,title,content,publish_date,publish_date,view_count  from notices where notice_id=1"  )
GradeManagementData GetData();

}
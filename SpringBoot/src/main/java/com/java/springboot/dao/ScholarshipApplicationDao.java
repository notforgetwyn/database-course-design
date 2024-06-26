package com.java.springboot.dao;

import com.java.springboot.Data.ScholarshipApplicationData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScholarshipApplicationDao {
@Select("select  * from scholarshipapplication"  )
 ScholarshipApplicationData[] GetDataAll();

@Select("select notice_id,title,content,publish_date,publish_date,view_count  from notices where notice_id=1"  )
 ScholarshipApplicationData GetData();

}

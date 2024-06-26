package com.java.springboot.dao;

import com.java.springboot.Data.NoticeData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NoticeDao {
@Select("select  notice_id,title,content,publish_date,publish_date, view_count,attachment from notices"  )
NoticeData[] GetDataAll();

@Select("select notice_id,title,content,publish_date,publish_date,view_count  from notices where notice_id=1"  )
NoticeData GetData();

@Insert("")
    void InsertNotice(NoticeData notice);
}

package com.java.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.Data.NoticeData;
import com.java.springboot.Data.ScholarshipListData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScholarshipListDao extends BaseMapper<ScholarshipListData> {
}
package com.java.springboot.dao;

import com.java.springboot.Data.NoticeData;
import com.java.springboot.Data.ScholarshipListData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScholarshipListDao {
@Select("select  * from scholarshiplist"  )
ScholarshipListData[] GetDataAll();

@Select("select notice_id,title,content,publish_date,publish_date,view_count  from notices where notice_id=1"  )
ScholarshipListData GetData();

}

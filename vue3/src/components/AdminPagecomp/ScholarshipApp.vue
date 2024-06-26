<template lang="">
    <div>
           <el-form :inline="true" :model="searchForm">
            <el-form-item label="奖学金名单id">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label="奖学金名称">
              <el-input v-model="searchForm.context" placeholder="" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label="日期">
              <el-date-picker v-model="searchForm.entrydate" type="daterange" range-separator="至"
                start-placeholder="开始日期" end-placeholder="结束日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="onSubmit">查询</el-button>
            </el-form-item>
          </el-form>
          <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="Scholarship_id" label="奖学金名单id" width="150"></el-table-column>
            <el-table-column prop="scholarship_name" label="奖学金名称" width="150"></el-table-column>
            <el-table-column prop="scholarship_type" label="奖学金类型" width="150"></el-table-column>
            <el-table-column prop="scholarship_level" label="奖学金等级" width="150"></el-table-column>
            <el-table-column prop="student_id" label="学生学号" width="150"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="150"></el-table-column>
            <el-table-column prop="teacher_approval" label="教师审批" width="150"></el-table-column>
            <el-table-column label="操作" width="150">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>
      
    </div>
</template>
<script>
import axios from 'axios';
export default {
  data() {
    return {
      tableData: [],
      searchForm: {
        name: "",
        gender: "",
        entrydate: []
      }
    };
  },
  methods: {

  },
  mounted() {
    new axios({ method: 'get', url: 'http://www.localhost:8080/Admin', }).then((result) => {
      this.tableData = result.data.data
    }).catch((err) => {
      console.log(err)
    })
  }
}
</script>
<template lang="">
    <div>
        <el-form :inline="true" :model="searchForm">
            <el-form-item label="成绩ID">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label="科目名称">
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
            <el-table-column prop="grade_id" label="成绩ID" width="150"></el-table-column>
            <el-table-column prop="subject_name" label="科目名称" width="150"></el-table-column>
            <el-table-column prop="subject_rank" label="科目排名" width="150"></el-table-column>
            <el-table-column prop="subject_grade" label="科目成绩" width="150"></el-table-column>
            <el-table-column prop="student_id" label="学生学号" width="150"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="150"></el-table-column>
            <el-table-column label="操作" width="250">
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
    new axios({ method: 'get', url: 'http://www.localhost:8080/Grade', }).then((result) => {
      this.tableData = result.data.data
    }).catch((err) => {
      console.log(err)
    })
  }
}
</script>
<template lang="">
    <div>
        <el-form :inline="true" :model="searchForm">
            <el-form-item label="标题">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label="内容">
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
            <el-table-column prop="notice_id" label="公告通知ID" width="100"></el-table-column>
            <el-table-column prop="title" label="公告标题" width="250"></el-table-column>
            <el-table-column prop="content" label="公告内容" width="250"></el-table-column>
            <el-table-column prop="publish_date" label="发布时间" width="250"></el-table-column>
            <el-table-column prop="attachment" label="附件" width="250"></el-table-column>
            <el-table-column prop="view_count" label="查看次数" width="100"></el-table-column>
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
      username: "123",
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
    new axios({ method: 'get', url: 'http://www.localhost:8080/Notice', }).then((result) => {
      this.tableData = result.data.data
    }).catch((err) => {
      console.log(err)
    })
  }
}
</script>
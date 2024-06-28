<template lang="">
    <div>
               <el-form :inline="true" :model="searchForm">
            <el-form-item label="学生ID">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item> 
            <el-button type="primary" style="margin-top: -20px;" @click="changed">查询</el-button>
              <el-button type="primary" style="margin-top: -20px;" @click="clear">重置</el-button>
              <el-button @click="dialogTableVisible=true" type="primary" style="margin-left :580px;margin-top: -25px;">批量删除</el-button>
          </el-form>
         <el-table :data="tableData" border height="400" highlight-current-row>
          <el-table-column type="selection" width="55" />
            <el-table-column prop="scholarship_id" label="奖学金名单id" width="150"></el-table-column>
            <el-table-column prop="scholarship_name" label="奖学金名称" width="150"></el-table-column>
            <el-table-column prop="scholarship_type" label="奖学金类型" width="150"></el-table-column>
            <el-table-column prop="scholarship_level" label="奖学金等级" width="150"></el-table-column>
            <el-table-column prop="student_id" label="学生学号" width="150"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="150"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>
 
           <div style="margin-left:20px"><el-pagination
      v-model:current-page="currentPage3"
      background
      :pager-count="pageSize3"
      layout="prev, pager, next, jumper"
      :total="total"
      @current-change="handleSizeChange"
    /></div>  
      
<el-dialog v-model="dialogTableVisible" title="编辑" width="750px"  center>
<el-form :inline="true" :model="dialogData"  ref="loginForm" label-width="120px">
        <el-form-item class="login-input" label="学生ID" >
          <el-input v-model="dialogData.name" placeholder=""></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="学业成绩">
          <el-input v-model="dialogData.region"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="学位课数量">
          <el-input v-model="dialogData.date1"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="思政课分数">
          <el-input v-model="dialogData.date2"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="科研分数">
          <el-input v-model="dialogData.delivery"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="社会服务基本分">
          <el-input v-model="dialogData.type"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="社会服务附加分">
          <el-input v-model="dialogData.resource"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="加权总分">
          <el-input v-model="dialogData.desc" disable></el-input>
        </el-form-item>
      </el-form>
      <template #footer>
        <el-button type="primary" @click="cancel">取 消</el-button>
        <el-button type="primary" @click="submit">确 定</el-button>
      </template>

</el-dialog>
</div>
</template>
<script>
import requests from '@/util/requests';
import axios from 'axios';
export default {
  data() {
    return {
      dialogTableVisible: false,
      tableData: [],
      searchForm: {
        name: "",
      },
      mutip: [],
      total: 500,
      currentPage3: 1,
      pageSize3: 15,
      dialogData:
      {
        name: '',
        region: '',
        date1: '',
        date2: '',
        delivery: '',
        type: '',
        resource: '',
        desc: '',
      }
    };
  },
  methods: {
    dele() {
      requests.get('Grade', this.num).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data;
          this.$message.success(result.data.Message)
        }
        else {
          this.$message.error(result.data.Message)
        }
      })

    },
    mutipdele() {
      const num = this.mutip.map(v => v.grade_id)
      requests.get('Grade', num).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data;
          this.$message.success(result.data.Message)
        }
        else {
          this.$message.error(result.data.Message)
        }
      })
    },
    count(val) {
      this.mutip = val
    },
    handleSizeChange() {
      requests.get("Grade", {
        params: {
          grade_id: this.currentPage3
        }
      }).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data;
          this.$message.success(result.data.Message)
        }
        else {
          this.$message.error(result.data.Message)
        }
      }
      )
    },
    changed() {
      requests.get("Grade", {
        params: {
          grade_id: this.searchForm.name
        }
      }).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data;
          this.$message.success(result.data.Message)
        }
        else {
          this.$message.error(result.data.Message)
        }
      }
      )
    },
    clear() {
      this.searchForm = {};
    },
    submit() {
      requests.get('Grade', this.dialogData).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data;
          this.$message.success("提交成功")
        }
        else {
          this.$message.error("提交失败，请联系管理员")
        }
        this.dialogTableVisible = false;
      })

    },
    cancel() {
      this.dialogTableVisible = false;
      this.dialogData = {};
    }
  },
  mounted() {
    new axios({ method: 'get', url: 'http://www.localhost:8080/ScholarshipList', }).then((result) => {
      this.tableData = result.data.data
    }).catch((err) => {
      console.log(err)
    })
  }
}
</script>
<template lang="">
        <el-form :inline="true" :model="searchForm">
            <el-form-item label="申请ID">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item> 
            <el-button type="primary" style="margin-top: -20px;" @click="changed">查询</el-button>
              <el-button type="primary" style="margin-top: -20px;" @click="clear">重置</el-button>
              <el-button type="primary" style="margin-left :530px;margin-top: -25px;" @click="open2">新增</el-button>
              <el-button @click="mutipdele" type="primary" style="margin-top: -25px;">批量删除</el-button>
          </el-form>
              <el-table :data="tableData" border height="450" highlight-current-row @selection-change="count">
                   <el-table-column type="selection" width="55" />
            <el-table-column prop="id" label="申请ID" width="150"></el-table-column>
            <el-table-column prop="scholarshipName" label="奖学金名字" width="150"></el-table-column>
            <el-table-column prop="scholarshipType" label="奖学金类型" width="150"></el-table-column>
            <el-table-column prop="applicationMaterials" label="申请材料" width="150"></el-table-column>
            <el-table-column prop="studentId" label="学生ID" width="150"></el-table-column>
            <el-table-column prop="studentName" label="学生姓名" width="150"></el-table-column>、
            <el-table-column prop="teacherApproval" label="教师批准" width="150"></el-table-column>
            <el-table-column prop="createTime" label="创建时间" width="150"></el-table-column>
          <el-table-column prop="updateTime" label="更改时间" width="150"></el-table-column>
            <el-table-column label="操作" width="250">
              <template v-slot="scope">
                    <el-button type="primary" @click="open(scope.row.id)" >编辑</el-button>
                <el-button @click="dele(scope.row.id)" type="danger">删除</el-button>
              </template>
</el-table-column>
</el-table>



<el-dialog v-model="dialogTableVisible" title="编辑" width="750px" center>
  <el-form :inline="true" :model="dialogData" label-width="120px">
    <el-form-item class="login-input" label="奖学金名字">
      <el-input v-model="dialogData.scholarshipName" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="奖学金类型">
      <el-input v-model="dialogData.scholarshipType"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="申请材料">
      <el-input v-model="dialogData.applicationMaterials"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="学生ID">
      <el-input v-model="dialogData.studentId"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="学生姓名">
      <el-input v-model="dialogData.studentName"></el-input>
    </el-form-item>
  </el-form>
  <template #footer>
            <el-button type="primary" @click="submit">确 定</el-button>
        <el-button type="primary" @click="cancel">取 消</el-button>

      </template>

</el-dialog>
</template>
<script>
import requests from '@/util/requests';
export default {
  data() {
    return {
      dialogTableVisible: false,
      tableData: [],
      searchForm: {
        name: ""
      },
      mutip: [],
      total: 500,
      currentPage3: 1,
      pageSize3: 15,
      dialogData: {
        id: '',
        scholarshipName: '',
        scholarshipType: '',
        applicationMaterials: '',
        studentId: '',
        studentName: '',
        teacherApproval: '',
        createTime: '',
        updateTime: ''
      }
    };
  },
  methods: {
    open2() {
      this.dialogTableVisible = true;
      this.dialogData = {};
    },
    open(num) {
      this.dialogData = {};
      requests.get("ScholarshipList/one", {
        params: {
          grade_id: num
        }
      }).then(result => {
        if (result.data.code === 200) {
          console.log(this.dialogData)
          this.$message.success(result.data.message)
          console.log(result.data.message)
        }
        else {
          this.$message.error(result.data.message)
        }
      }
      )
      this.dialogTableVisible = true;
    },
    dele(num) {
      requests.get("ScholarshipList/del", {
        params: {
          grade_id: num
        }
      }).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data.data;
          this.$message.success(result.data.message)
        }
        else {
          this.$message.error(result.data.message)
        }
      }
      )

    },
    mutipdele() {
      let num = this.mutip.map(v => v.id)
      if (num == 0) return;
      requests.post("ScholarshipList/dels", num).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data.data;
          this.$message.success(result.data.message)
        }
        else {
          this.$message.error(result.data.message)
        }
      }
      )
    },
    count(val) {
      this.mutip = val
    },
    changed() {
      if (this.searchForm.name == 0) return
      requests.get("ScholarshipList/one", {
        params: {
          grade_id: this.searchForm.name
        }
      }).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data.data;
          if (result.data.message == "error")
            this.$message.error(result.data.message)
          else
            this.$message.success(result.data.message)
          console.log(result.data.message)
        }
        else {
          this.$message.error(result.data.message)
        }
      }
      )
    },
    clear() {
      this.searchForm = {};
      requests(
        {
          method: 'get',
          url: 'ScholarshipList'
        }
      ).then(result => {
        this.tableData = result.data.data;
      })
    },

    submit() {
      requests.post('ScholarshipList', this.dialogData).then(result => {
        if (result.data.code === 200) {
          this.tableData = result.data.data;
          this.$message.success("提交成功")
        }
        else {
          this.$message.error("提交失败，请联系管理员")
        }
        this.dialogTableVisible = false;
        this.dialogData = {};
      })

    },
    cancel() {
      this.dialogTableVisible = false;
      this.dialogData = {};
    }
  },
  mounted() {
    requests(
      {
        method: 'get',
        url: 'ScholarshipList/stu',
        params:
        {
          studentId: localStorage.getItem("id")
        }
      }
    ).then(result => {
      this.tableData = result.data.data;
    })
  }

}
</script>
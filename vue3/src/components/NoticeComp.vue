<template lang="">
        <el-form :inline="true" :model="searchForm">
            <el-form-item label="公告ID">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item> 
            <el-button type="primary" style="margin-top: -20px;" @click="changed">查询</el-button>
              <el-button type="primary" style="margin-top: -20px;" @click="clear">重置</el-button>
              <el-button type="primary" style="margin-left :530px;margin-top: -25px;" @click="open2">新增</el-button>
              <el-button @click="mutipdele" type="primary" style="margin-top: -25px;">批量删除</el-button>
          </el-form>
              <el-table :data="tableData" border height="450" highlight-current-row @selection-change="count">
                   <el-table-column type="selection" width="55" />
            <el-table-column prop="id" label="公告ID" width="150"></el-table-column>
            <el-table-column prop="title" label="标题" width="150"></el-table-column>
            <el-table-column prop="content" label="文本内容" width="150"></el-table-column>
            <el-table-column prop="publishDate" label="发行时间" width="150"></el-table-column>
            <el-table-column prop="attachment" label="附件" width="150"></el-table-column>
            <el-table-column prop="viewCount" label="观看次数" width="150"></el-table-column>、
            <el-table-column prop="createdAt" label="创建时间" width="150"></el-table-column>
          <el-table-column prop="updatedAt" label="更改时间" width="150"></el-table-column>
            <el-table-column label="操作" width="250">
              <template v-slot="scope">
                    <el-button type="primary" @click="open(scope.row.id)" >编辑</el-button>
                <el-button @click="dele(scope.row.id)" type="danger">删除</el-button>
              </template>
</el-table-column>
</el-table>



<el-dialog v-model="dialogTableVisible" title="编辑" width="750px" center>
  <el-form :rules="rules" ref="loginForm" :inline="true" :model="dialogData" label-width="120px">
    <el-form-item class="login-input" label="公告ID" prop="id">
      <el-input v-model="dialogData.id" placeholder=""></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="标题">
      <el-input v-model="dialogData.title" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="文本内容">
      <el-input v-model="dialogData.content"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="发行时间">
      <el-input v-model="dialogData.publishDate"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="附件">
      <el-input v-model="dialogData.attachment"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="观看次数">
      <el-input v-model="dialogData.viewCount"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="创建时间">
      <el-input v-model="dialogData.createdAt"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="更改时间">
      <el-input v-model="dialogData.updatedAt"></el-input>
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
        title: '',
        content: '',
        publishDate: '',
        attachment: '',
        viewCount: '',
        teacherApproval: '',
        createdAt: '',
        updatedAt: ''
      }, rules: {
        id: [
          { required: true, message: "学号", trigger: "blur" },
        ]
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
      requests.get("Notice/one", {
        params: {
          grade_id: num
        }
      }).then(result => {
        if (result.data.code === 200) {
          console.log(this.dialogData)
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
      if (localStorage.getItem("id") != "admin") {
        this.$message.error("无权限")
        return
      }
      requests.get("Notice/del", {
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
      if (localStorage.getItem("id") != "admin") {
        this.$message.error("无权限")
        return
      }
      let num = this.mutip.map(v => v.id)
      if (num == 0) return;
      requests.post("Notice/dels", num).then(result => {
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
      requests.get("Notice/one", {
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
          url: 'Notice'
        }
      ).then(result => {
        this.tableData = result.data.data;
      })
    },

    submit() {
      if (localStorage.getItem("id") != "admin")
        this.$message.error("无权限")
      this.$refs.loginForm.validate((valid => {
        if (!valid) {
          this.$message(
            {
              type: "error",
              message: "请输入格式正确的账号和密码"
            }
          )
        } else {
          requests.post('Grade', this.dialogData).then(result => {
            if (result.data.code === 200) {
              this.tableData = result.data.data;
              this.$message.success("提交成功")
            }
            else {
              this.$message.error("提交失败，请联系管理员")
            }
            this.dialogTableVisible = false;

          })
        }
      }))
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
        url: 'Notice'
      }
    ).then(result => {
      this.tableData = result.data.data;
    })
  }

}
</script>
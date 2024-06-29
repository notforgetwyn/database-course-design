<template lang="">
        <el-form :inline="true" :model="searchForm">
            <el-form-item label="学生ID">
              <el-input v-model="searchForm.name" placeholder="" style="width:150px;"></el-input>
            </el-form-item> 
            <el-button type="primary" style="margin-top: -20px;" @click="changed">查询</el-button>
              <el-button type="primary" style="margin-top: -20px;" @click="clear">重置</el-button>
              <el-button type="primary" style="margin-left :530px;margin-top: -25px;" @click="open">新增</el-button>
              <el-button @click="mutipdele" type="primary" style="margin-top: -25px;">批量删除</el-button>
          </el-form>
              <el-table :data="tableData" border height="450" highlight-current-row @selection-change="count">
                   <el-table-column type="selection" width="55" />
            <el-table-column prop="id" label="老师ID" width="150"></el-table-column>
            <el-table-column prop="teacherName" label="老师名字" width="150"></el-table-column>
            <el-table-column prop="gender" label="性别" width="150"></el-table-column>
            <el-table-column prop="age" label="老师年龄" width="150"></el-table-column>
            <el-table-column prop="department" label="学院" width="150"></el-table-column>
            <el-table-column prop="major" label="专业" width="150"></el-table-column>、
            <el-table-column label="操作" width="250">
              <template v-slot="scope">
                    <el-button type="primary" @click="open(scope.row.id)" >编辑</el-button>
                <el-button @click="dele(scope.row.id)" type="danger">删除</el-button>
              </template>
</el-table-column>
</el-table>



<el-dialog v-model="dialogTableVisible" title="编辑" width="750px" center>
  <el-form :rules="rules" ref="loginForm" :inline="true" :model="dialogData" label-width="120px">
    <el-form-item class="login-input" label="老师ID" prop="id">
      <el-input v-model="dialogData.teacherId" placeholder=""></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="老师名字">
      <el-input v-model="dialogData.teacherName" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="性别">
      <el-input v-model="dialogData.gender"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="老师年龄">
      <el-input v-model="dialogData.age"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="学院">
      <el-input v-model="dialogData.department"></el-input>
    </el-form-item>
    <el-form-item class="login-input" label="专业">
      <el-input v-model="dialogData.major"></el-input>
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
        teacherId: '',
        teacherName: '',
        gender: '',
        age: '',
        department: '',
        major: '',
      },
      rules: {
        id: [
          { required: true, message: "学号", trigger: "blur" },
        ]
      }
    };
  },
  methods: {
    open() {
      this.dialogTableVisible = true;
      this.dialogData = {};
    },
    dele(num) {
      requests.get("teacher/del", {
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
      requests.post("teacher/dels", num).then(result => {
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
      requests.get("teacher/one", {
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
          url: 'teacher'
        }
      ).then(result => {
        this.tableData = result.data.data;
      })
    },

    submit() {
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
        url: 'teacher'
      }
    ).then(result => {
      this.tableData = result.data.data;
    })
  }

}
</script>

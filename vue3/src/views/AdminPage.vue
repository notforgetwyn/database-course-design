<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <el-icon>
          <Operation />
        </el-icon>
        <div>
          <el-avatar shape="square" :fit="fit" :icon="UserFilled" />
          <el-text style="font-size:48px;color: #EBEDF0;">{{ username }}</el-text>
        </div>
      </el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu background-color="#545c64" text-color="#fff" active-text-color="#409eff">
            <el-menu-item index="1">
              <template #title>
                <el-icon>
                  <location />
                </el-icon>
                <span>公告通知</span>
              </template>
            </el-menu-item>
            <el-menu-item index="2">
              <template #title><el-icon>
                  <Menu />
                </el-icon>
                <span>分类信息</span>
              </template>
            </el-menu-item>
            <el-menu-item index="3">
              <template #title> <el-icon>
                  <document />
                </el-icon>
                <span>成绩管理</span>
              </template>
            </el-menu-item>
            <el-sub-menu index="4">
              <template #title> <el-icon>
                  <setting />
                </el-icon>
                <span>用户管理</span>
              </template>
              <el-menu-item index="4-1">教师用户</el-menu-item>
              <el-menu-item index="4-2">学生用户</el-menu-item>
            </el-sub-menu>
            <el-sub-menu index="5">
              <template #title> <el-icon>
                  <setting />
                </el-icon>
                <span>奖学金管理</span>
              </template>
              <el-menu-item index="5-1">奖学金申请名单</el-menu-item>
              <el-menu-item index="5-2">奖学金复审名单</el-menu-item>
            </el-sub-menu>
          </el-menu>

        </el-aside>
        <el-main>
          <el-form :inline="true" :model="searchForm">
            <el-form-item label="姓名">
              <el-input v-model="searchForm.name" placeholder="姓名" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label="性别">
              <el-input v-model="searchForm.gender" placeholder="姓名" style="width:150px;"></el-input>
            </el-form-item>
            <el-form-item label=" 入职日期">
              <!-- 日期选择器 -->
              <el-date-picker v-model="searchForm.entrydate" type="daterange" range-separator="至"
                start-placeholder="开始日期" end-placeholder="结束日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="onSubmit">查询</el-button>
            </el-form-item>
          </el-form>

          <el-table :data="tableData" border height="450">
            <el-table-column prop="tableData.sno" label="名称" width="250"></el-table-column>
            <el-table-column prop="tableData.cno" label="最后操作时间" width="250"></el-table-column>
            <el-table-column prop="tableData.grade" label="最后操作时间" width="250"></el-table-column>
            <el-table-column label="操作">
              <el-button type="primary" size="mini">编辑</el-button>
              <el-button type="danger" size="mini">删除</el-button>
            </el-table-column>
          </el-table>

        </el-main>
      </el-container>
    </el-container>
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
    onSubmit() {
      new axios({
        method: 'get',
        url: 'http://www.localhost:8080/student',
        data: {
          name: this.searchForm.name,
          gender: this.searchForm.gender,
          entrydate: this.searchForm.entrydate,
        }
      }).then((result) => {
        console.log(result.data.data)
        this.tableData = result.data.data
      }).catch((err) => {
        console.log(err)
      })
    }
  },
  mounted() {
    new axios({ method: 'post', url: 'http://www.localhost:8080/student', }).then((result) => {
      console.log(result.data.data)
    }).catch((err) => {
      console.log(err)
    })
  }
}
</script>
<style scoped>
.el-header {
  background-color: #373d41;
  display: flex;
  justify-content: space-between;
  padding-left: 0%;
  align-items: center;
  color: #fff;
  font-size: 30px;
}

.el-aside {
  background-size: "100%";
  background-color: #545c64;
}
</style>
<template>
  <el-container class="layout-container-demo" style="height: 500px">
    <el-header>
      <div>奖学金系统</div>
      <el-button type=" info">Warning</el-button>
    </el-header>


    <el-container>
      <el-aside width="200px">
        <el-menu class="el-menu-vertical-demo" background-color="#545c64" text-color="#fff" active-text-color="#409eff">
          <el-sub-menu index="1">
            <template #title>
              <el-icon>
                <icon-menu />
              </el-icon>
              <span>个人中心</span>
            </template>
            <el-menu-item index="1-1">
              test1
            </el-menu-item>
          </el-sub-menu>

          <el-sub-menu index="2">
            <template #title>
              <el-icon>
                <icon-menu />
              </el-icon>
              <span>学生管理</span>
            </template>
            <el-menu-item index="2-1">
              test1
            </el-menu-item>
          </el-sub-menu>

          <el-sub-menu index="3">
            <template #title>
              <el-icon>
                <icon-menu />
              </el-icon>
              <span>奖学金类型管理</span>
            </template>
            <el-menu-item index="3-1">
              test1
            </el-menu-item>
          </el-sub-menu>

          <el-sub-menu index="4">
            <template #title>
              <el-icon>
                <icon-menu />
              </el-icon>
              <span>奖学金管理</span>
            </template>
            <el-menu-item index="4-1">
              test1
            </el-menu-item>
          </el-sub-menu>

        </el-menu>
      </el-aside>



      <el-main id="#app">
        <el-scrollbar>
          <el-table :data="tableData">
            <el-table-column prop="sno" label="Date" width="140" />
            <el-table-column prop="cno" label="Name" width="120" />
            <el-table-column prop="grade" label="Address" />
          </el-table>
        </el-scrollbar>
      </el-main>
    </el-container>
  </el-container>
</template>

<script scope setup>
import { createApp } from 'vue'
import axios from "axios"
createApp({
  el: "#app",
  data() {
    return {
      tableData: [{
        sno: 1,
        cno: 2,
        grade: 3
      }, {
        sno: 2,
        cno: 2,
        grade: 3
      }]
    }
  },
  mounted() {
    new axios.post("www.localhost:8080/student").then((result) => {
      console.log(result.data.data);
    });
  }
})

</script>
<style>
.el-header {
  background-color: #373d41;
  display: flex;
  justify-content: space-between;
  padding-left: 0%;
  align-items: center;
  color: #fff;
  font-size: 30px;
}

.layout-container-demo .el-aside {
  background: #515a62;
}

.layout-container-demo .el-main {
  padding: 0;
}
</style>
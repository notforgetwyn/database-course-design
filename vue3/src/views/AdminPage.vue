<template>
  <el-container class="layout-container-demo" style="height: 500px">
    <el-header class="el-header">
      <div style="color: #F8FCFB;  letter-spacing: 10px;vertical-align: middle;">
        奖学金系统
      </div>
    </el-header>


    <el-container>
      <el-aside width="200px">
        <el-menu class="el-menu-vertical-demo" active-text-color="#ffd04b" background-color="#545c64" text-color="#fff">
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



      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script lang="ts" setup>

</script>
<style>
.el-header {
  position: relative;
  background-color: #373D41;
  font-size: 30px;
}

.layout-container-demo .el-aside {
  background: #515a62;
}

.layout-container-demo .el-main {
  padding: 0;
}
</style>
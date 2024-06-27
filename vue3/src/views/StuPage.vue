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
          <el-menu background-color="#373d41" text-color="#fff" active-text-color="#409eff">
            <router-link to="/StuPage/">
              <el-menu-item index="1">
                <template #title>
                  <el-icon>
                    <location />
                  </el-icon>
                  <span>公告通知</span>
                </template>
              </el-menu-item>
            </router-link>
            <router-link to="/StuPage/StudentData">
              <el-menu-item index="2">
                <template #title>
                  <el-icon>
                    <location />
                  </el-icon>
                  <span>个人信息</span>
                </template>
              </el-menu-item>
            </router-link>
            <el-sub-menu index="3">
              <template #title> <el-icon>
                  <setting />
                </el-icon>
                <span>奖学金管理</span>
              </template>
              <router-link to="/AdminPage/ScholarshipList"><el-menu-item
                  index="3-1">奖学金申请名单</el-menu-item></router-link>
              <router-link to="/AdminPage/ScholarshipApp"> <el-menu-item
                  index="3-2">奖学金复审名单</el-menu-item></router-link>
            </el-sub-menu>
          </el-menu>
        </el-aside>
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
<script>

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
  background-color: #373d41;
}

<style scoped>.el-header {
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
  background-color: #373d41;
}
</style>
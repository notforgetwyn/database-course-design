<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <el-icon>
          <el-text style="font-size:48px;color: #EBEDF0;margin-left :205px;">WEICOME</el-text>
        </el-icon>
        <el-dropdown @command="handleCommand">
          <span style="font-size:20px;  color: #fff;">
            退出登录<el-icon class=" el-icon--right"><arrow-down /></el-icon>
          </span>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item command="a">退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
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
              <router-link to="/StuPage/StudentApp"><el-menu-item index="3-1">奖学金申请</el-menu-item></router-link>
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
    handleCommand() {
      localStorage.removeItem("token")
      localStorage.removeItem("id")
      this.$router.push("/LogPage")
    }
  },
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
  background-color: #373d41;
}
</style>

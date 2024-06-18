<template>
  <el-container>
    <el-header class="title">国家奖学金系统</el-header>
    <el-main>
      <el-form label-width="50px">
        <el-form-item>
          <el-input prefix-icon="el-icon-user" class="text"></el-input>
        </el-form-item>
        <el-form-item>
          <el-input prefix-icon="el-icon-lock" class="text"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" class="button">登录</el-button>
          <el-button type="info" class="button">重置</el-button>
        </el-form-item>
      </el-form>
    </el-main>
  </el-container>
</template>

<script>

</script>
<style>
.title {
  text-align: center;
  word-spacing: 10px;
}

.text {}

.button {}
</style>
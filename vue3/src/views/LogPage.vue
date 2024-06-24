<template>
  <div class="loginbody">
    <div class="logindata">
      <div class="logintext">
        <h2>后台登录</h2>
      </div>
      <div class="formdata">
        <el-form v-model="form" :rules="rules">
          <el-form-item prop="userName">
            <el-input v-model="form.userName" clearable placeholder="请输入账号"></el-input>
          </el-form-item>
          <el-form-item prop="passwd">
            <el-input v-model="form.passwd" clearable placeholder="请输入密码" show-password></el-input>
          </el-form-item>
        </el-form>
      </div>
      <div class="tool">
        <div>
          <el-checkbox v-model="checked">记住密码</el-checkbox>
        </div>
        <div>
          <span class="shou">忘记密码？</span>
        </div>
      </div>
      <div class="butt">
        <el-button type="primary" :plain="true">登录</el-button>

      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        userName: "",
        passwd: "",
      },


      checked: true,
      rules: {
        userName: [
          { required: true, message: "请输入用户名", trigger: "blur" },
          { max: 10, message: "请输入正确的用户名", trigger: "blur" },
        ],
        passwd: [
          { required: true, message: "请输入密码", trigger: "blur" },
          { min: 1, message: "密码不能为空", trigger: "blur" },
        ],
      },
    };
  }
}
</script>
<style scoped>
.loginbody {
  width: 100%;
  height: 100%;
  background-image: url("https://img.zcool.cn/community/0164505a322567a80121db803d71f8.jpg@3000w_1l_2o_100sh.jpg");
  background-size: 100% 100%;
  position: fixed;
  line-height: 100%;
  padding-top: 150px;
}

.logintext {
  margin-bottom: 20px;
  line-height: 50px;
  text-align: center;
  font-size: 30px;
  font-weight: bolder;
  color: white;
  text-shadow: 2px 2px 4px #000000;
}

.logindata {
  width: 400px;
  height: 300px;
  transform: translate(-50%);
  margin-left: 50%;
}

.tool {
  display: flex;
  justify-content: space-between;
  color: #606266;
}

.butt {
  margin-top: 10px;
  text-align: center;
}

.shou {
  cursor: pointer;
  color: #606266;
}
</style>
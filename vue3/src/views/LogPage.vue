<template>
  <div class="loginpage">
    <div class="login-container">
      <div class="login-header">奖学金管理系统</div>
      <el-form :model="form" :rules="rules" ref="loginForm" label-width="50px">
        <el-form-item class="login-input" label="学号" prop="username">
          <el-input v-model="form.username" placeholder=""></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="密码" prop="password">
          <el-input type="password" v-model="form.password" placeholder=""></el-input>
        </el-form-item>
        <el-form-item>
          <el-button class="login-button" type="primary"><router-link to="/AdminPage"
              class='login-button1'>登录</router-link></el-button>
          <el-button class="login-button" type="primary"><router-link to="/AdminPage"
              class='login-button1'>登录</router-link></el-button>
        </el-form-item>
      </el-form>
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
        username: [
          { required: true, message: "请输入学号", trigger: "blur" }
        ],
        password: [
          { required: true, message: "请输入密码", trigger: "blur" }
        ]
      }
    };
  }
}
</script>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: Arial, sans-serif;
}

.loginpage {
  background-image: url(" https://img.zcool.cn/community/0164505a322567a80121db803d71f8.jpg@3000w_1l_2o_100sh.jpg");
  background-size: 100% 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.login-container {
  background: white;
  padding:
    2rem;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  width: 100%;
  max-width: 400px;
}

.login-header {
  letter-spacing: 10px;
  text-align: center;
  margin-bottom: 1.5rem;
  font-size: 1.5rem;
  color:
    #333;
}

.login-input {
  text-align: center;
  width: 100%;
  margin-bottom: 1rem;
  border-radius: 5px;
  font-size: 2rem;
}

.login-button {
  width: 25%;
  padding: 0.8rem;
  background: #007BFF;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background 0.3s ease;
}

.login-button1 {
  text-align: center;
  color: #333;
  font-size: 1rem;
  text-decoration: none;
}

.login-button:hover {
  background: #0056b3;
}

.login-link {
  display: block;
  text-align: center;
  margin-top: 1rem;
  color: #007BFF;
  text-decoration: none;
  transition: color 0.3s ease;
}

.login-link:hover {
  color: #0056b3;
}

.login-form {
  padding: 20px;
  border-radius: 10px;
  background-color: #ffffff;
}
</style>

<template>
  <div class="loginpage">
    <div class="login-container">
      <div class="login-header">奖学金管理系统</div>
      <el-form :model="form" :rules="rules" ref="loginForm" label-width="50px">
        <el-form-item class="login-input" label="学号" prop="ID">
          <el-input v-model="form.ID" placeholder=""></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="密码" prop="password">
          <el-input type="password" v-model="form.password" placeholder=""></el-input>
        </el-form-item>
        <el-form-item>
          <el-button class="login-button" type="primary" @click="Login">登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>

</template>

<script>
import requests from '@/util/requests';
export default {
  data() {
    return {
      form: {
        ID: "",
        password: "",
      },
      rules: {
        ID: [
          { required: true, message: "请输入正确的学号", trigger: "blur" },
        ],
        password: [
          { required: true, message: "请输入正确的密码", trigger: "blur" }
        ]
      }
    };

  }, methods: {
    Login() {
      this.$refs.loginForm.validate((valid => {
        if (!valid) {
          this.$message(
            {
              type: "error",
              message: "请输入格式正确的账号和密码"
            }
          )
        }
        else {
          requests.get("user", this.form).then(
            result => {
              console.log(this.form.ID)
              console.log(result.data)
              if (result.data.code !== 200)
                this.$message.error(
                  {
                    message: "账号或者密码错误"
                  })
              else {
                localStorage.setItem("token", result.data.data.token)
                if (result.data.data.role === "teacher") {
                  localStorage.setItem("id", result.data.data.id)
                  this.$router.push("/AdminPage")
                }
                if (result.data.data.role === "student") {
                  localStorage.setItem("id", result.data.data.id)
                  this.$router.push("/StuPage")
                }
                if (result.data.data.role === "admin") {
                  localStorage.setItem("id", result.data.data.id)
                  this.$router.push("/TeacherPage")
                }
              }
            }
          )
        }
      }
      )
      )
    }
  },
}
</script>
<style scoped>
.loginpage {
  background-image: url("../assets/background-img.jpg");
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

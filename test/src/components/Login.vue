<script>
import { reactive, toRefs } from "vue"
import { ElMessage, ElMessageBox } from "element-plus";
import service from "../util/request";
import login from "../tsscript/test"

export default {
  name: "login",
  setup() {
    const data = reactive({
      loginForm: {
        username: "",
        password: "",
        verify: ""
      }
    })

    const checkVerify = () => {
      //TODO 本地校验验证码,通过返回true
      return true;
    }

    const checkLoginForm = (name, password) => {
      console.log("checkLoginForm Start")
      //TODO 将信息发送至后端校验，通过则返回true
      const userdata = {
        "name": name,
        "password": password
      }

      service.post("/people", userdata).then(()=>{
        console.log("asd")
      })

      return true
    }

    const loginMainForm = () => {
      if (!checkVerify(data.loginForm.verify)) {
        ElMessage.error('校验码错误')
      }

      if (!checkLoginForm(data.loginForm.username,data.loginForm.password)) {
        ElMessage.error('用户名或密码不对！')
      }

      //TODO 保存Socket并切换窗口
      console.log("checkLoginForm End")
      // window.location.href = "/"
    }

    const closeLoginForm = () => {

    }

    return {
      ...toRefs(data), loginMainForm, closeLoginForm
    }
  }

}
</script>

<template>
  <div class="container">
    <div class="login_box">
      <div class="avatar">
        <img class="img" src="../assets/vue.svg" />
      </div>
      <el-form label-width="100px" style="max-width: 460px" class="loginForm">
        <el-form-item label="用户名：">
          <el-input v-model="loginForm.name" />
        </el-form-item>
        <el-form-item label="密码：">
          <el-input v-model="loginForm.password" />
        </el-form-item>
        <el-form-item label="验证码：">
          <el-input v-model="loginForm.verify" />
        </el-form-item>
        <el-form-item style="margin-left: 60px;">
          <el-button type="primary" size="large" @click="loginMainForm">登录</el-button>
          <!-- <el-button type="danger" @click="closeLoginForm">退出</el-button> -->
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<style scoped>
.container {
  width: 100%;
  height: 100vh;
  background-color: #386edb;
}

.login_box {
  width: 600px;
  height: 360px;
  background-color: white;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  border-radius: 10px;
}

.avatar {
  width: 120px;
  height: 120px;
  background-color: white;
  border: 1px solid #dedede;
  position: absolute;
  left: 50%;
  transform: translate(-50%, -50%);
  border-radius: 120px;
  box-shadow: 0 0 10px #ddd;
}

.img {
  width: 50px;
  height: 80px;
  margin: 20px 0 0 35px;
}

.loginForm {
  margin: 90px 0 0 45px;
}
</style>
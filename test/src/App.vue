<script>
export default {
  name: "App",
  setup() {
    function toHome() {
      console.log("toHome")
    }

    function Logout() {
      console.log("Logout")
    }

    return {
      toHome, Logout
    }
  }
}

</script>

<template>
  <div class="container">
    <div class="top">
      <div style="float:left">首页</div>
      <div style="float:right" @click="Logout">注销</div>
    </div>
    <div class="bottom">
      <div class="sideBar">
        <el-menu default-active="2" :router="true" background-color="#333744" text-color="#fff"
          active-text-color="#409Eff" class="el-menu-vertical-demo">
          <el-menu-item index="/roomStatus">房态图</el-menu-item>
          <el-menu-item index="/roomManage">房间管理</el-menu-item>
          <el-menu-item index="7">菜单三</el-menu-item>
        </el-menu>
      </div>
      <div class="workSpace">
        <el-card>
          <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/home' }" @click="toHome">首页</el-breadcrumb-item>
            <el-breadcrumb-item>{{ $route.meta.title }}</el-breadcrumb-item>
          </el-breadcrumb>
        </el-card>
        <el-card style="margin-top: 10px;">
          <router-view></router-view>
        </el-card>
      </div>
    </div>
  </div>
</template>

<style scoped>
.container {
  width: 100vw;
  height: 100vh;
  background-color: rgb(255, 255, 255);
}

.top {
  background-color: rgb(96, 96, 96);
  height: 60px;
  width: 100vw;
  color: white;
}

.bottom {
  flex: 0;
  background-color: rgb(255, 255, 255);
  height: calc(100vh - 60px);
  width: 100%;
}

.bottom .sideBar {
  background-color: rgb(59, 59, 59);
  height: 100%;
  width: 300px;
  float: left;
}

.bottom .workSpace {
  background-color: rgb(38, 38, 38);
  height: 100%;
  width: calc(100vw - 300px);
  float: right;
}
</style>

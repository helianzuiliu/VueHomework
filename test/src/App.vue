<script setup>

</script>

<template>
  <div class="container">
    <div class="top" style="color: #ffffff;">首页</div>
    <div class="bottom">
      <div class="sideBar">
        <el-menu default-active="2" :router="true" background-color="#333744" text-color="#fff"
          active-text-color="#409Eff" class="el-menu-vertical-demo">
          <el-menu-item index="/roomStatus">房态图</el-menu-item>
          <el-menu-item index="/roomManage">房间管理</el-menu-item>
          <el-menu-item index="7">菜单三</el-menu-item>
          <el-sub-menu index="8">
            <template #title>菜单四2124</template>
            <el-menu-item index="1-4-1">菜单四1</el-menu-item>
            <el-menu-item index="1-4-2">菜单四2</el-menu-item>
            <el-menu-item index="1-4-3">菜单四3</el-menu-item>
          </el-sub-menu>
        </el-menu>
      </div>
      <div class="workSpace">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<style scoped>
.container {
  width: 100%;
  height: 100%;
  background-color: aqua;
}

.top {
  background-color: rgb(0, 0, 0);
  height: 60px;
  width: 100vw;

}

.bottom {
  flex: 1;
  background-color: rgb(255, 255, 255);
  width: 100vw;
  height: calc(100vh - 60px);
}

.bottom .sideBar {
  background-color: rgb(109, 109, 109);
  height: calc(100vh - 60px);
  width: 300px;
}

.bottom .workSpace {
  /* background-color: rgb(128, 154, 87); */
  height: auto;
  width: calc(100vw - 300px);
  float: right;
}
</style>

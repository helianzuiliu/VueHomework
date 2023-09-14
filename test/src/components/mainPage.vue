<script>
export default {
    setup() {
        return {

        }
    }
}
</script>

<template>
    <div class="container">
        <div class="top"></div>
        <div class="bottom">
            <div class="sideBar"></div>
            <div class="workSpace"></div>
        </div>
    </div>
</template>

<style scoped>
.container {
    width: 100%;
    height: 100vh;
}

.top {
    background-color: rgb(0, 0, 0);
    height: 60px;
    width: 100%;
}

.bottom {
    flex: 1;
    background-color: rgb(255, 255, 255);
    width: 100vw;
}

.bottom .sideBar {
    background-color: rgb(109, 109, 109);
    height: calc(100vh - 50px);
    width: 300px;
}

.bottom .workSpace {
    background-color: rgb(128, 154, 87);
    width: calc(100vw -310px);
    height: auto;
    float: right;
}
</style>
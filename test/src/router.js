import { createRouter, createWebHistory } from "vue-router"

const routes = [
    {
        path: "/",
        component: () => import("./components/mainPage.vue")
    },
    {
        path: "/login",
        component: () => import("./components/Login.vue")
    },
    {
        path: "/home",
        component: () => import("./components/HelloWorld.vue")
    },
    {
        path: "/roomStatus",
        component: () => import("./components/roomStatus.vue")

    },
    {
        path: "/roomManage",
        component: () => import("./components/roomManage.vue")
    },
    {
        path: "/test",
        component: () => import("./components/test.vue")
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes: routes
})

export default router



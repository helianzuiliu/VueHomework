import { createRouter, createWebHistory } from "vue-router"

const routes = [
    {
        path: "/",
        component: () => import("./components/roomStatus.vue")

    },
    {
        path: "/main",
        component: () => import("./components/mainPage.vue")
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes: routes
})


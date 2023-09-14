import { createRouter, createWebHistory } from "vue-router"

const routes = [
    {
        path: "/",
        component: () => import("./components/root.vue")

    },
    {
        path: "/main",
        component: () => import("./components/mainPage.vue")
    },
    {
        path: "/hello",
        component: () => import("./components/HelloWorld.vue")
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes: routes
})
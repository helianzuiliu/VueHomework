import { createRouter, createWebHistory } from "vue-router"

const routes = [
    {
        path: "/",
        component: () => {
            "./components/root.vue"
        }
    }, {
        path: "/main",
        component: () => { "./components/mainPage.vue" }
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes: routes
})
import { createApp } from 'vue'
import App from './App.vue'
import { router } from "./router.js"
import ElementPlus from 'element-plus'
import { zhCn } from 'element-plus/es/locale/index'

createApp(App)
    .use(router)
    .use(ElementPlus, { locale: zhCn })
    .mount('#app')


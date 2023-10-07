import App from './App.vue'
import router from "./router.js"
import ElementPlus from 'element-plus'
import { createApp } from 'vue'
import { zhCn } from 'element-plus/es/locale/index'

import "./style.css"
import "element-plus/dist/index.css"

createApp(App)
    .use(router)
    .use(ElementPlus, { locale: zhCn })
    .mount('#app')


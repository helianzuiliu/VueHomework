import axios from "../../node_modules/axios/index"

const service = axios.create({
  baseURL: "http://localhost:4090",
  timeout: 15000
})

export default service
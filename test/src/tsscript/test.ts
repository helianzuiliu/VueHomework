import axios from "../../node_modules/axios/index";

function login(name: String, password: String) {
  const userdata = {
    "name": name,
    "password": password
  }
  axios.post("people", userdata).then(() => {
    console.log(userdata)
  })

}

export default login
import axios from "axios";
const requests = axios.create({
  baseURL: "http://www.localhost:8080/",
  timeout: 5000,
});
requests.interceptors.request.use(
  function (config) {
    config.headers["Content-Type"] = "application/json;charset=utf-8";
    if (!localStorage.getItem("token"))
      config.headers["token"] = localStorage.getItem("token");
    return config;
  },
  function (error) {
    // 对请求错误做些什么
    return Promise.reject(error);
  }
);

// 添加响应拦截器
requests.interceptors.response.use(
  function (response) {
    // 对响应数据做点什么
    return response;
  },
  function (error) {
    // 对响应错误做点什么
    return Promise.reject(error);
  }
);
export default requests;

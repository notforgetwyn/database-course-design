import axios from "axios";
const requests = axios.create({
  baseURL: "http://www.localhost:8080/",
  timeout: 5000,
});
export default requests;

import axios from 'axios';

export default axios.create({
  // TODO: Change baseURL to your server's URL.
  baseURL:"http://localhost:8080/api",
  headers: {
    "Content-type": "application/json"
  }
});

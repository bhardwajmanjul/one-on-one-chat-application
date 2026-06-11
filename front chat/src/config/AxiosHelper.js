import axios from "axios";
export const baseURL = "https://my-chat-backend-cs4h.onrender.com";
export const httpClient = axios.create({
  baseURL: baseURL,
});
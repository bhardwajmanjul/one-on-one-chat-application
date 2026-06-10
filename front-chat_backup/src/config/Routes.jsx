import React from "react";
import { Routes, Route } from "react-router";
import '../App'
//import ChatPage from "../components/ChatPage";

const AppRoutes = () => {
  console.log("Hello World ")
  return (
    
    <Routes>
      <Route path="/" element={<App />} />
      
      <Route path="/chat" element = {
        
        <h1>Hello Manjul Bhardwaj </h1>}
        />
      <Route path="/about" element={<h1>This is about page</h1>} />
      <Route path="*" element={<h1>404 Page Not Found</h1>} />
    </Routes>
  );
};

export default AppRoutes;
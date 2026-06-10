import { StrictMode } from 'react'

import { BrowserRouter} from 'react-router'
import AppRoutes from "./config/routes.jsx";

const MainRoutes = () => {
  return (
    <BrowserRouter>
<AppRoutes></AppRoutes>
</BrowserRouter>
  );
};

export default MainRoutes
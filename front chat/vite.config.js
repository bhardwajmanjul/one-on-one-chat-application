import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    host: true,     // यह जरूरी है मोबाइल एक्सेस के लिए
    port: 5173,     // optional: default यही है
  },
})

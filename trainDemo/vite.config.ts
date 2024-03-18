import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  server: {
    host: "localhost",
    port: 8088,
    open: true,
    proxy: {
      "/api": {
        target: "http://localhost:8080", // 代理的目标路径(后台)
        changeOrigin: true, // 支持跨域
        rewrite(path) {
          return path.replace(/^\/api/, '')
        },

      },
    }
  },
  plugins: [
    vue(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  }
})

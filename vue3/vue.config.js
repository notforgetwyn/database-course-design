const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer:{
    port: 7070,
    // vue.config.js
  //开启代理服务器
    proxy:{
      "/#": {  // /api是自行设置的请求前缀，按照这个来匹配请求，有这个字段的请求，就会走到代理来。
          target: "http://www.aaabbbccc.com", // 需要代理的域名，目标域名，会替换掉匹配字段之前的路径
           ws: false, // 是否启用websockets
          changeOrigin: true, //是否跨域
          pathRewrite: {  //重写匹配的字段，如果不需要放在请求路径上，可以重写为""
              "^/#": ""
          }
      },
   
  },
  }

    }
)

<template>
  <div class="container">
    <div class="head">
      <img src="../assets/image/logo.svg">
      <span>用户管理系统</span>
    </div>
    <div class="body">
      <div class="menu">
        <span>用户状态</span>
        <span>用户管理</span>
      </div>
      <div class="right">
        <table>
          <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>邮箱</th>
            <th>身份</th>
            <th>操作</th>
          </tr>
          <tr v-for="item in userList" :key="item.id">
            <td>{{ item.name }}</td>
            <td>{{ item.sex }}</td>
            <td>{{ item.email }}</td>
            <td>{{ item.identity }}</td>
            <td>
              <div class="btn">
                <span class="btn-edit">修改</span>
                <span class="btn-del">删除</span>
                <span class="btn-view">查看</span>
              </div>
            </td>
          </tr>
        </table>
        <div class="page">
          <ul>
            <li class="firstPage">首页</li>
            <li class="upPage">上一页</li>
            <li v-for="index in pageTotal"> {{ index }}</li>
            <li class="upPage">下一页</li>
            <li class="lastPage">尾页</li>
          </ul>
        </div>
      </div>
    </div>

  </div>
</template>

<script lang="ts" setup>
import { defineComponent } from 'vue';
import { reactive } from 'vue'
const userList = reactive([
  {
    id: 1,
    name: "张三",
    sex: "男",
    email: "123456@qq.com",
    identity: "student"
  },
  {
    id: 2,
    name: "李四",
    sex: "男",
    email: "654321@qq.com",
    identity: "student"
  }
])

const pageTotal = userList.length



</script>

<style>
@import url('../assets/css/index.css')
</style>
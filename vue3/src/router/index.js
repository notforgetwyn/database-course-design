import { createRouter, createWebHashHistory } from 'vue-router'
const routes = [
  {
    path: '/LogPage',
    name: 'LogPage',
    component: () => import('../views/LogPage.vue')
  },  {
    path: '/AdminPage',
    name: 'AdminPage',
    component: () => import('../views/AdminPage.vue')
  },  {
    path: '/StuPage',
    name: 'StuPage',
    component: () => import('../views/StuPage.vue')
  },  {
    path: '/TeacherPage',
    name: 'TeacherPage',
    component: () => import('../views/TeacherPage.vue')
  },
  {
    path: '/',
    redirect:"/LogPage"
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

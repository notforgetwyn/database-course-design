import { createRouter, createWebHashHistory } from 'vue-router'
const routes = [
  {
    path: '/test',
    name: 'test',
    // route level code-splitting
    // this generates a separate chunk (About.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import('../views/LogPage.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

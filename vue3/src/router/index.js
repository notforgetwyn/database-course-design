import { createRouter, createWebHashHistory } from "vue-router";
const routes = [
  {
    path: "/LogPage",
    name: "LogPage",
    component: () => import("../views/LogPage.vue"),
  },
  {
    path: "/AdminPage",
    name: "AdminPage",
    component: () => import("../views/AdminPage.vue"),
    children: [
      {
        path: "",
        component: () => import("../components/NoticeComp.vue"),
      },
      {
        path: "TotalScore",
        component: () => import("../components/AdminPagecomp/TotalScore.vue"),
      },
      {
        path: "StudentData",
        component: () => import("../components/AdminPagecomp/StudentData.vue"),
      },
      {
        path: "TeacherData",
        component: () => import("../components/AdminPagecomp/TeacherData.vue"),
      },
      {
        path: "ScholarshipList",
        component: () =>
          import("../components/AdminPagecomp/ScholarshipList.vue"),
      },
      {
        path: "AddScore",
        component: () => import("../components/AdminPagecomp/AddScore.vue"),
      },
    ],
  },
  {
    path: "/StuPage",
    name: "StuPage",
    component: () => import("../views/StuPage.vue"),
    children: [
      {
        path: "",
        component: () => import("../components/NoticeComp.vue"),
      },
      {
        path: "AddScore",
        component: () => import("../components/StuPageComp/AddScore.vue"),
      },
      {
        path: "StudentData",
        component: () => import("../components/StuPageComp/StudentData.vue"),
      },
      {
        path: "StudentApp",
        component: () => import("../components/StuPageComp/StudentApp.vue"),
      },
      {
        path: "studentScore",
        component: () => import("../components/StuPageComp/studentScore.vue"),
      },
    ],
  },
  {
    path: "/TeacherPage",
    name: "TeacherPage",
    component: () => import("../views/TeacherPage.vue"),
    children: [
      {
        path: "",
        component: () => import("../components/NoticeComp.vue"),
      },
      {
        path: "ScholarshipApp",
        component: () =>
          import("../components/teacherPageComp/ScholarshipApp.vue"),
      },
      {
        path: "StudentApp",
        component: () => import("../components/teacherPageComp/StudentApp.vue"),
      },
      {
        path: "TeacherData",
        component: () =>
          import("../components/teacherPageComp/TeacherData.vue"),
      },
    ],
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;

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
        path: "StudentGrade",
        component: () => import("../components/AdminPagecomp/StudentGrade.vue"),
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
        path: "ScholarshipApp",
        component: () =>
          import("../components/AdminPagecomp/ScholarshipApp.vue"),
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
        path: "StudentGrade",
        component: () => import("../components/AdminPagecomp/StudentGrade.vue"),
      },
      {
        path: "StudentData",
        component: () => import("../components/StuPageComp/StudentData.vue"),
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
        path: "ScholarshipApp",
        component: () =>
          import("../components/AdminPagecomp/ScholarshipApp.vue"),
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
        path: "StudentGrade",
        component: () => import("../components/AdminPagecomp/StudentGrade.vue"),
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
        path: "ScholarshipApp",
        component: () =>
          import("../components/AdminPagecomp/ScholarshipApp.vue"),
      },
    ],
  },
  {
    path: "/",
    redirect: "/AdminPage",
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;

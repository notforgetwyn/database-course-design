<template lang="">
 <el-row>
    <el-col :span="16">
         <el-descriptions  title="学生信息" :column="2" border size='large' >
            <template #extra>
      <el-button type="primary" size='large' @click="open">编辑</el-button>
    </template>
<el-descriptions-item label="学生ID" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="学生姓名" label-align="center" align="center">
    {{teacherName}}
</el-descriptions-item>
<el-descriptions-item label="性别" label-align="center" align="center">
    {{gender}}
</el-descriptions-item>
<el-descriptions-item label="学院" label-align="center" align="center">
    {{department}}
</el-descriptions-item>
<el-descriptions-item label="专业" label-align="center" align="center">
    {{major}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{gpa}}
</el-descriptions-item>
<el-descriptions-item label="年龄" label-align="center" align="center">
    {{age}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{teacherId}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{teacherName}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>
<el-descriptions-item label="备注" label-align="center" align="center">
    {{id}}
</el-descriptions-item>

</el-descriptions>
</el-col>
<el-col :span="4" :offset="1">
    <el-text size="large" style="margin-top: 10px;">头像</el-text>
    <el-image style="width:280px; margin-top: 40px; height: 50%  overflow-y: auto;" src="" fit="cover" /></el-col>
</el-row>


<el-dialog v-model="dialogTableVisible" title="编辑" width="750px" center>
    <el-form :inline="true" :model="dialogData" label-width="120px">
        <el-form-item class="login-input" label="学生ID">
            <el-input v-model="dialogData.id" placeholder=""></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="学生姓名">
            <el-input v-model="dialogData.teacherName" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="性别">
            <el-input v-model="dialogData.gender"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="部门">
            <el-input v-model="dialogData.department"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="专业">
            <el-input v-model="dialogData.major"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="年龄">
            <el-input v-model="dialogData.age"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="老师ID">
            <el-input v-model="dialogData.teacherId"></el-input>
        </el-form-item>
        <el-form-item class="login-input" label="老师姓名">
            <el-input v-model="dialogData.teacherName" disable></el-input>
        </el-form-item>
    </el-form>
    <template #footer>
            <el-button type="primary" @click="submit">确 定</el-button>
        <el-button type="primary" @click="cancel">取 消</el-button>

      </template>

</el-dialog>
</template>
<script>
import requests from '@/util/requests';
export default {
    data() {
        return {
            dialogTableVisible: false,
            tableData: [],
            searchForm: {
                name: ""
            },
            mutip: [],
            teacherName: 500,
            currentPage3: 1,
            pageSize3: 15,
            dialogData: {
                id: '',
                teacherName: '',
                gender: '',
                department: '',
                major: '',
                age: '',
            }
        };
    },
    methods: {
        open2() {
            this.dialogTableVisible = true;
            this.dialogData = {};
        },
        open() {
            this.dialogData = {};
            requests.get("teacher/one", {
                params: {
                    grade_id: localStorage.getItem("id")
                }
            }).then(result => {
                if (result.data.code === 200) {
                    console.log(this.dialogData)
                    this.$message.success(result.data.message)
                    console.log(result.data.message)
                }
                else {
                    this.$message.error(result.data.message)
                }
            }
            )
            this.dialogTableVisible = true;
        },
        submit() {
            requests.post('teacher', this.dialogData).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data.data;
                    this.$message.success("提交成功")
                }
                else {
                    this.$message.error("提交失败，请联系管理员")
                }
                this.dialogTableVisible = false;
                this.dialogData = {};
            })

        },
        cancel() {
            this.dialogTableVisible = false;
            this.dialogData = {};
        }
    },
    mounted() {
        requests(
            {
                method: 'get',
                url: 'teacher/one', params: {
                    grade_id: localStorage.getItem("id")
                }

            }
        ).then(result => {
            this.dialogData = result.data.data;
            console.log(this.dialogData)
        })
    }

}
</script>

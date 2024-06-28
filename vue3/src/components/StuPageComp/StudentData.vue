<template lang="">
 <el-row>
    <el-col :span="16">
         <el-descriptions  title="学生信息" :column="2" border size='large' >
            <template #extra>
      <el-button type="primary" size='large'>编辑</el-button>
    </template>
<el-descriptions-item label="学生ID" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="学生姓名" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="年龄" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="学院" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="专业" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="绩点" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>
<el-descriptions-item label="extra_info" label-align="center" align="center">
    123
</el-descriptions-item>

</el-descriptions>
</el-col>
<el-col :span="4" :offset="1">
    <el-text size="large" style="margin-top: 10px;">头像</el-text>
    <el-image style="width:280px; margin-top: 40px; height: 50%  overflow-y: auto;" src="" fit="cover" /></el-col>
</el-row>


</template>
<script>
import requests from '@/util/requests';
import axios from 'axios';
export default {
    data() {
        return {
            dialogTableVisible: false,
            tableData: [],
            searchForm: {
                name: "",
            },
            mutip: [],
            total: 500,
            currentPage3: 1,
            pageSize3: 15,
            dialogData:
            {
                name: '',
                region: '',
                date1: '',
                date2: '',
                delivery: '',
                type: '',
                resource: '',
                desc: '',
            }
        };
    },
    methods: {
        dele() {
            requests.get('Grade', this.num).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data;
                    this.$message.success(result.data.Message)
                }
                else {
                    this.$message.error(result.data.Message)
                }
            })

        },
        mutipdele() {
            const num = this.mutip.map(v => v.grade_id)
            requests.get('Grade', num).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data;
                    this.$message.success(result.data.Message)
                }
                else {
                    this.$message.error(result.data.Message)
                }
            })
        },
        count(val) {
            this.mutip = val
        },
        handleSizeChange() {
            requests.get("Grade", {
                params: {
                    grade_id: this.currentPage3
                }
            }).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data;
                    this.$message.success(result.data.Message)
                }
                else {
                    this.$message.error(result.data.Message)
                }
            }
            )
        },
        changed() {
            requests.get("Grade", {
                params: {
                    grade_id: this.searchForm.name
                }
            }).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data;
                    this.$message.success(result.data.Message)
                }
                else {
                    this.$message.error(result.data.Message)
                }
            }
            )
        },
        clear() {
            this.searchForm = {};
        },
        submit() {
            requests.get('Grade', this.dialogData).then(result => {
                if (result.data.code === 200) {
                    this.tableData = result.data;
                    this.$message.success("提交成功")
                }
                else {
                    this.$message.error("提交失败，请联系管理员")
                }
                this.dialogTableVisible = false;
            })

        },
        cancel() {
            this.dialogTableVisible = false;
            this.dialogData = {};
        }
    },
    mounted() {
        new axios({ method: 'get', url: 'teacher', }).then((result) => {
            this.tableData = result.data.data
        }).catch((err) => {
            console.log(err)
        })
    }

}
</script>
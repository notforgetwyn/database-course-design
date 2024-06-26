<template>
    <div>
        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="notice_id" label="公告通知ID" width="100"></el-table-column>
            <el-table-column prop="title" label="公告标题" width="250"></el-table-column>
            <el-table-column prop="content" label="公告内容" width="250"></el-table-column>
            <el-table-column prop="publish_date" label="发布时间" width="250"></el-table-column>
            <el-table-column prop="attachment" label="附件" width="250"></el-table-column>
            <el-table-column prop="view_count" label="查看次数" width="100"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>



        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="grade_id" label="成绩ID" width="100"></el-table-column>
            <el-table-column prop="subject_name" label="科目名称" width="250"></el-table-column>
            <el-table-column prop=" subject_rank" label="科目排名" width="250"></el-table-column>
            <el-table-column prop="subject_grade" label="科目成绩" width="250"></el-table-column>
            <el-table-column prop=" student_id" label="学生学号" width="250"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="100"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>

        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="student_id" label="学生ID" width="100"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="250"></el-table-column>
            <el-table-column prop=" gender" label="性别" width="250"></el-table-column>
            <el-table-column prop="department" label="学院" width="250"></el-table-column>
            <el-table-column prop=" major" label="专业" width="250"></el-table-column>
            <el-table-column prop="age" label="年龄" width="100"></el-table-column>
            <el-table-column prop="gpa" label="绩点" width="250"></el-table-column>
            <el-table-column prop="teacher_id" label="教师ID" width="250"></el-table-column>
            <el-table-column prop="teacher_name" label="教师姓名" width="100"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>

        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="teacher_id" label="教师ID" width="100"></el-table-column>
            <el-table-column prop="teacher_name" label="教师姓名" width="250"></el-table-column>
            <el-table-column prop="gender" label="性别" width="250"></el-table-column>
            <el-table-column prop="age" label="年龄" width="250"></el-table-column>
            <el-table-column prop="department" label="学院" width="250"></el-table-column>
            <el-table-column prop="major" label="专业" width="100"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>

        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="Scholarship_id" label="奖学金名单id" width="100"></el-table-column>
            <el-table-column prop="scholarship_name" label="奖学金名称" width="250"></el-table-column>
            <el-table-column prop="scholarship_type" label="奖学金类型" width="250"></el-table-column>
            <el-table-column prop="scholarship_level" label="奖学金等级" width="250"></el-table-column>
            <el-table-column prop="student_id" label="学生学号" width="250"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="100"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>

        <el-table :data="tableData" border height="480" highlight-current-row>
            <el-table-column prop="Scholarship_id" label="奖学金名单id" width="100"></el-table-column>
            <el-table-column prop="scholarship_name" label="奖学金名称" width="250"></el-table-column>
            <el-table-column prop="scholarship_type" label="奖学金类型" width="250"></el-table-column>
            <el-table-column prop="scholarship_level" label="奖学金等级" width="250"></el-table-column>
            <el-table-column prop="student_id" label="学生学号" width="250"></el-table-column>
            <el-table-column prop="student_name" label="学生姓名" width="100"></el-table-column>
            <el-table-column prop="teacher_approval" label="教师审批" width="250"></el-table-column>
            <el-table-column label="操作" width="250">
                <el-button type="primary" size="">编辑</el-button>
                <el-button type="danger" size="">删除</el-button>
            </el-table-column>
        </el-table>
    </div>
</template>
<script>
export default {

}
</script>
<style lang="">

</style>
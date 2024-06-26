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
            <el-table-column prop="grade_id" label="公告通知ID" width="100"></el-table-column>
            <el-table-column prop="subject_name" label="公告标题" width="250"></el-table-column>
            <el-table-column prop=" subject_rank" label="公告内容" width="250"></el-table-column>
            <el-table-column prop="subject_grade" label="发布时间" width="250"></el-table-column>
            <el-table-column prop=" student_id" label="附件" width="250"></el-table-column>
            <el-table-column prop="student_name" label="查看次数" width="100"></el-table-column>
            <el-table-column prop="extra_info" label="查看次数" width="100"></el-table-column>
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
const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","导出"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除","导出"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级类型","menuJump":"列表","tableName":"banjileixing"}],"menu":"班级类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"标签类型","menuJump":"列表","tableName":"biaoqianleixing"}],"menu":"标签类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"试题信息列表","menuJump":"列表","tableName":"shitixinxi"}],"menu":"试题信息模块"},{"child":[{"buttons":["查看"],"menu":"考试成绩列表","menuJump":"列表","tableName":"kaoshichengji"}],"menu":"考试成绩模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","测试"],"menu":"试题信息","menuJump":"列表","tableName":"shitixinxi"}],"menu":"试题信息管理"},{"child":[{"buttons":["查看"],"menu":"试题测试","menuJump":"列表","tableName":"shiticeshi"}],"menu":"试题测试管理"},{"child":[{"buttons":["查看"],"menu":"试卷批阅","menuJump":"列表","tableName":"shijuanpiyue"}],"menu":"试卷批阅管理"},{"child":[{"buttons":["查看"],"menu":"考试成绩","menuJump":"列表","tableName":"kaoshichengji"}],"menu":"考试成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"试题信息列表","menuJump":"列表","tableName":"shitixinxi"}],"menu":"试题信息模块"},{"child":[{"buttons":["查看"],"menu":"考试成绩列表","menuJump":"列表","tableName":"kaoshichengji"}],"menu":"考试成绩模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看"],"menu":"试题信息","menuJump":"列表","tableName":"shitixinxi"}],"menu":"试题信息管理"},{"child":[{"buttons":["查看","批阅"],"menu":"试题测试","menuJump":"列表","tableName":"shiticeshi"}],"menu":"试题测试管理"},{"child":[{"buttons":["查看"],"menu":"试卷批阅","menuJump":"列表","tableName":"shijuanpiyue"}],"menu":"试卷批阅管理"},{"child":[{"buttons":["新增","查看","报表"],"menu":"考试成绩","menuJump":"列表","tableName":"kaoshichengji"}],"menu":"考试成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"试题信息列表","menuJump":"列表","tableName":"shitixinxi"}],"menu":"试题信息模块"},{"child":[{"buttons":["查看"],"menu":"考试成绩列表","menuJump":"列表","tableName":"kaoshichengji"}],"menu":"考试成绩模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]
    }
}
export default menu;

const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1qp70/",
            name: "ssm1qp70",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1qp70/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "随堂测微信小程序"
        } 
    }
}
export default base

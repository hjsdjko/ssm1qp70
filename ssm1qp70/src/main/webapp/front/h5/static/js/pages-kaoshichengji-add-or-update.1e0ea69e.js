(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-kaoshichengji-add-or-update"],{"0ff9":function(r,e,t){"use strict";var i=t("e3cc"),o=t.n(i);o.a},"2bc3":function(r,e,t){"use strict";var i=t("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,t("ac6a"),t("96cf");var o=i(t("3b8d")),n=i(t("e2b1")),a={data:function(){return{ruleForm:{jiaoshigonghao:"",jiaoshixingming:"",xuehao:"",xingming:"",ceshimingcheng:"",zhengqueshu:"",kaoshichengji:"",paiming:"",pingyu:"",tupian:"",userid:""},xuehaoOptions:[],xuehaoIndex:0,user:{},ro:{jiaoshigonghao:!1,jiaoshixingming:!1,xuehao:!1,xingming:!1,ceshimingcheng:!1,zhengqueshu:!1,kaoshichengji:!1,paiming:!1,pingyu:!1,tupian:!1,userid:!1}}},components:{wPicker:n.default},computed:{},onLoad:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(e){var t,i,o,n;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return t=uni.getStorageSync("nowTable"),r.next=3,this.$api.session(t);case 3:return i=r.sent,this.user=i.data,this.ruleForm.jiaoshigonghao=this.user.jiaoshigonghao,this.ruleForm.jiaoshixingming=this.user.jiaoshixingming,r.next=9,this.$api.option("xuesheng","xuehao",{});case 9:if(i=r.sent,this.xuehaoOptions=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){r.next=19;break}return this.ruleForm.id=e.id,r.next=17,this.$api.info("kaoshichengji",this.ruleForm.id);case 17:i=r.sent,this.ruleForm=i.data;case 19:if(!e.cross){r.next=70;break}o=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(o);case 22:if((r.t1=r.t0()).done){r.next=70;break}if(n=r.t1.value,"jiaoshigonghao"!=n){r.next=28;break}return this.ruleForm.jiaoshigonghao=o[n],this.ro.jiaoshigonghao=!0,r.abrupt("continue",22);case 28:if("jiaoshixingming"!=n){r.next=32;break}return this.ruleForm.jiaoshixingming=o[n],this.ro.jiaoshixingming=!0,r.abrupt("continue",22);case 32:if("xuehao"!=n){r.next=36;break}return this.ruleForm.xuehao=o[n],this.ro.xuehao=!0,r.abrupt("continue",22);case 36:if("xingming"!=n){r.next=40;break}return this.ruleForm.xingming=o[n],this.ro.xingming=!0,r.abrupt("continue",22);case 40:if("ceshimingcheng"!=n){r.next=44;break}return this.ruleForm.ceshimingcheng=o[n],this.ro.ceshimingcheng=!0,r.abrupt("continue",22);case 44:if("zhengqueshu"!=n){r.next=48;break}return this.ruleForm.zhengqueshu=o[n],this.ro.zhengqueshu=!0,r.abrupt("continue",22);case 48:if("kaoshichengji"!=n){r.next=52;break}return this.ruleForm.kaoshichengji=o[n],this.ro.kaoshichengji=!0,r.abrupt("continue",22);case 52:if("paiming"!=n){r.next=56;break}return this.ruleForm.paiming=o[n],this.ro.paiming=!0,r.abrupt("continue",22);case 56:if("pingyu"!=n){r.next=60;break}return this.ruleForm.pingyu=o[n],this.ro.pingyu=!0,r.abrupt("continue",22);case 60:if("tupian"!=n){r.next=64;break}return this.ruleForm.tupian=o[n],this.ro.tupian=!0,r.abrupt("continue",22);case 64:if("userid"!=n){r.next=68;break}return this.ruleForm.userid=o[n],this.ro.userid=!0,r.abrupt("continue",22);case 68:r.next=22;break;case 70:this.styleChange();case 71:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},xuehaoChange:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(e){var t;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.xuehaoIndex=e.target.value,this.ruleForm.xuehao=this.xuehaoOptions[this.xuehaoIndex],r.next=4,this.$api.follow("xuesheng","xuehao",{columnValue:this.ruleForm.xuehao});case 4:t=r.sent,t.data.xingming&&(this.ruleForm.xingming=t.data.xingming);case 6:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),tupianTap:function(){var r=this;this.$api.upload((function(e){r.ruleForm.tupian=r.$base.url+"upload/"+e.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.ruleForm.zhengqueshu||this.$validate.isIntNumer(this.ruleForm.zhengqueshu)){r.next=3;break}return this.$utils.msg("正确数应输入整数"),r.abrupt("return");case 3:if(!this.ruleForm.kaoshichengji||this.$validate.isIntNumer(this.ruleForm.kaoshichengji)){r.next=6;break}return this.$utils.msg("考试成绩应输入整数"),r.abrupt("return");case 6:if(!this.ruleForm.paiming||this.$validate.isIntNumer(this.ruleForm.paiming)){r.next=9;break}return this.$utils.msg("排名应输入整数"),r.abrupt("return");case 9:if(!this.ruleForm.id){r.next=14;break}return r.next=12,this.$api.update("kaoshichengji",this.ruleForm);case 12:r.next=16;break;case 14:return r.next=16,this.$api.add("kaoshichengji",this.ruleForm);case 16:this.$utils.msgBack("提交成功");case 17:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,t=e.getFullYear(),i=e.getMonth()+1,o=e.getDate();return"start"===r?t-=60:"end"===r&&(t+=2),i=i>9?i:"0"+i,o=o>9?o:"0"+o,"".concat(t,"-").concat(i,"-").concat(o)},toggleTab:function(r){this.$refs[r].show()}}};e.default=a},"5ba5":function(r,e,t){"use strict";t.r(e);var i=t("2bc3"),o=t.n(i);for(var n in i)"default"!==n&&function(r){t.d(e,r,(function(){return i[r]}))}(n);e["default"]=o.a},bd49:function(r,e,t){"use strict";t.r(e);var i=t("d1f7"),o=t("5ba5");for(var n in o)"default"!==n&&function(r){t.d(e,r,(function(){return o[r]}))}(n);t("0ff9");var a,s=t("f0c5"),u=Object(s["a"])(o["default"],i["b"],i["c"],!1,null,"5c907226",null,!1,i["a"],a);e["default"]=u.exports},d1f7:function(r,e,t){"use strict";var i,o=function(){var r=this,e=r.$createElement,t=r._self._c||e;return t("v-uni-view",{staticClass:"content"},[t("v-uni-form",{staticClass:"app-update-pv"},[t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("教师工号")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.jiaoshigonghao,placeholder:"教师工号"},model:{value:r.ruleForm.jiaoshigonghao,callback:function(e){r.$set(r.ruleForm,"jiaoshigonghao",e)},expression:"ruleForm.jiaoshigonghao"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("教师姓名")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.jiaoshixingming,placeholder:"教师姓名"},model:{value:r.ruleForm.jiaoshixingming,callback:function(e){r.$set(r.ruleForm,"jiaoshixingming",e)},expression:"ruleForm.jiaoshixingming"}})],1),t("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("学号")]),t("v-uni-picker",{attrs:{value:r.xuehaoIndex,range:r.xuehaoOptions},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.xuehaoChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[r._v(r._s(r.xuehaoOptions[r.xuehaoIndex]))])],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("姓名")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.xingming,placeholder:"姓名"},model:{value:r.ruleForm.xingming,callback:function(e){r.$set(r.ruleForm,"xingming",e)},expression:"ruleForm.xingming"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("测试名称")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.ceshimingcheng,placeholder:"测试名称"},model:{value:r.ruleForm.ceshimingcheng,callback:function(e){r.$set(r.ruleForm,"ceshimingcheng",e)},expression:"ruleForm.ceshimingcheng"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("正确数")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.zhengqueshu,placeholder:"正确数"},model:{value:r.ruleForm.zhengqueshu,callback:function(e){r.$set(r.ruleForm,"zhengqueshu",e)},expression:"ruleForm.zhengqueshu"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("考试成绩")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.kaoshichengji,placeholder:"考试成绩"},model:{value:r.ruleForm.kaoshichengji,callback:function(e){r.$set(r.ruleForm,"kaoshichengji",e)},expression:"ruleForm.kaoshichengji"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("排名")]),t("v-uni-input",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"110rpx"},attrs:{disabled:r.ro.paiming,placeholder:"排名"},model:{value:r.ruleForm.paiming,callback:function(e){r.$set(r.ruleForm,"paiming",e)},expression:"ruleForm.paiming"}})],1),t("v-uni-view",{staticClass:"cu-form-group",class:"left"==r.left?"":"active",style:{boxShadow:"0 0 4rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.tupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("图片")]),t("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[r.ruleForm.tupian?t("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:r.ruleForm.tupian,mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"308rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[r._v("评语")]),t("v-uni-textarea",{style:{boxShadow:"0 0 4rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(23, 152, 242, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"280rpx"},attrs:{placeholder:"评语"},model:{value:r.ruleForm.pingyu,callback:function(e){r.$set(r.ruleForm,"pingyu",e)},expression:"ruleForm.pingyu"}})],1),t("v-uni-view",{staticClass:"btn"},[t("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",backgroundColor:"#409EFF",borderColor:"#409EFF",borderRadius:"8rpx",color:"#fff",borderWidth:"2rpx",width:"160rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},n=[];t.d(e,"b",(function(){return o})),t.d(e,"c",(function(){return n})),t.d(e,"a",(function(){return i}))},dc8b:function(r,e,t){var i=t("24fb");e=i(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-5c907226]{padding:%?20?%}.content[data-v-5c907226]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-5c907226]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-5c907226]{width:%?180?%}.avator[data-v-5c907226]{width:%?150?%;height:%?60?%}.right-input[data-v-5c907226]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-5c907226]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-5c907226]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-5c907226]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-5c907226]{border:0}.cu-form-group uni-input[data-v-5c907226]{padding:0 %?30?%}.uni-input[data-v-5c907226]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-5c907226]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-5c907226]::after{line-height:%?88?%}.select .uni-input[data-v-5c907226]{line-height:%?88?%}.input .right-input[data-v-5c907226]{line-height:%?110?%}',""]),r.exports=e},e3cc:function(r,e,t){var i=t("dc8b");"string"===typeof i&&(i=[[r.i,i,""]]),i.locals&&(r.exports=i.locals);var o=t("4f06").default;o("12236caf",i,!0,{sourceMap:!1,shadowMode:!1})}}]);
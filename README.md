## 使用的框架
- 后端
    - SpringBoot
    - MyBatis
- 前端
    - Bootstrap
    - LayUI
    - Thymeleaf

## QA
1. SQL文件位于resources
1. 很多异常未处理，只对登录和注册表单做了校验，登录密码错误等均无提醒


## 要点
1. 项目介绍
1. 设计方案
    1. 框架的选择 --> 选择SpringBoot快捷方便搭建网站
    1. 数据库表的创建 --> 选择字段冗余（如stall和stall_apply表中都有username），使得SQL语句不会过于复杂
    1. 付款的简易实现方案 --> 流程图
    1. 用户输入校验 --> login.html 72行  register.html 52行
    1. 单点登录的实现方案 --> 将用户信息存在session，用户就可以跨域访问，只要访问过程中没有关闭浏览器，就无需重新登录
    1. 难点亮点：session的用户信息如果过多造成服务器存储问题？如何去解决？ --> 生成用户的token，在本地存储cookie中存放，服务器根据token进行校验，实现用户跨域访问
1. 代码实现
1. 测试
    1. 单元测试
    1. 界面测试
        1. 功能测试
        1. 性能测试
    



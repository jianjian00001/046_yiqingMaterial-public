### 作者QQ：1556708905(支持修改、 部署调试、 支持代做毕设)

#### 支持代做任何毕设论、接网站建设、小程序、H5、APP、各种系统等

**毕业设计所有选题地址 [https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)**

**博客地址：[https://blog.csdn.net/2303_76227485/article/details/128665592](https://blog.csdn.net/2303_76227485/article/details/128665592)**

**视频演示：[https://www.bilibili.com/video/BV1aP411q74k/](https://www.bilibili.com/video/BV1aP411q74k/)**

## 基于Springboot+vue的疫情物资管理系统(源代码+数据库)

## 一、系统介绍

本项目分为管理员与普通用户两种角色

管理员角色包含以下功能：

- 系统管理
  
  控制面板、用户管理、菜单权限管理、部门管理、角色管理、图标管理
- 业务管理
  
  物资去处管理、入库记录管理、物资资料管理、物资类别管理、物资来源管理、发放记录管理、物资库存管理
- 健康报备
  
  全国疫情速报、健康打卡
- 请假管理
  
  操作日志、登录日志、系统接口

用户角色包含以下功能：

- 业务管理
  
  物资去处管理、入库记录管理、物资资料管理、物资类别管理、物资来源管理、发放记录管理、物资库存管理
- 健康报备
  
  全国疫情速报、健康打卡

## 二、所用技术

后端技术栈：

- springboot
- mybatis
- shiro
- mysql
- jwt

前端技术栈：

- vue全家桶
- elment-ui
- echarts
- axios

## 三、环境介绍

基础环境 :IDEA/eclipse, JDK 1.8, Mysql5.7及以上,Node.js(v12.9.1版本),Maven

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图

![contents](./picture/picture8.png)

![contents](./picture/picture1.png)

![contents](./picture/picture2.png)

![contents](./picture/picture3.png)

![contents](./picture/picture4.png)

![contents](./picture/picture5.png)

![contents](./picture/picture6.png)

![contents](./picture/picture7.png)

![contents](./picture/picture9.png)

![contents](./picture/picture10.png)

![contents](./picture/picture11.png)

![contents](./picture/picture12.png)

![contents](./picture/picture13.png)

![contents](./picture/picture14.png)

![contents](./picture/picture15.png)

![contents](./picture/picture16.png)

![contents](./picture/picture17.png)

![contents](./picture/picture18.png)

## 五、浏览地址

前端访问地址：http://localhost:8080/#/login

用户账号/密码：lisi/123456

管理员账号/密码：zhangsan/123456

## 六、安装教程

1. 使用Navicat或者其它工具、在mysql中创建对应名称的数据库、并导入项目的sql文件；
2. 使用IDEA/Eclipse导入项目，若为maven项目请选择maven，导入成功后请执行maven clean;maven install命令
3. 修改back后端项目里面的application-dev.yml 里面的数据库配置，修改UploadServiceImpl里面的PATH路径
4. 启动项目后端项目 
5. vscode打开xinguan-vue-main项目
6. 打开终端，执行npm install 依赖下载完成后执行 npm run dev,执行成功后会显示访问地址（注意node一定要安装12.9.1版本） 

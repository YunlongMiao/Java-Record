---

---



第四章内容

```
/src/request
/src/response
/web/form.html
/web/login.html
/web/welcome.html
```



第5章内容

```
显示用户上次访问时间

实现购物车

应用session对象模拟用户登录
```

```
/src/cn.itcast.session/entity
/src/cn.itcast.session/servlet
/src/LastAccessServlet.java
/web/WEB-INF/lib/servlet-api.jar
```

第5章修改记录

```
/*/src/response/LoginServlet.java
* 第4章内容
* LoginServlet.java
* 注释原因：与第5章内容重合
* 改名LoginServlet001.java
 * */
```



第6章内容

```
将页面转发到用户登录界面
网上蛋糕商城jsp界面
```

```
/example/Ejsp		jsp功能测试文件夹，无用
/web/css
/web/fonts
/web/header.jsp
/web/footer.jsp
/web/forward.jsp
/web/login.jsp
/web/user_register.jsp

```

第7章

```
根据参数请求显示不同的页面
```

```
/example/eElAndJstl		el和jstl功能测试文件夹，无用
/src/cn.itcast.servlet/MyServlet.java
/web/WEB-INF/lib/jstl.jar
/web/WEB-INF/lib/standard.jar
/web/if.jsp
```



第8章

```
判断用户名是否有效
按照JSP Moderl2思想实现用户注册功能
```

```
example/eJavaBean		JavaBean和jsp开发模型功能测试文件夹，无用

/src/cn.itcast/Email.java
/src/cn.itcast/CharactorEncoding.java
/web/email.jsp
/web/release.jsp

/web/login.jsp
/web/judge.jsp

src/cn/itcast/chapter08/model2/domain/RegisterFormBean.java
src/cn/itcast/chapter08/model2/domain/UserBean.java
src/cn/itcast/chapter08/model2/util/DBUtil.java
src/cn/itcast/chapter08/model2/web/ControllerServlet.java
web/register.jsp
web/loginSuccess.jsp
```

```
/web/login.jsp	-->   /web/login6.jsp
```



第9章

```
Filter在Cookie自动登录中的使用
实现文件上传
实现文件下载
```



```
src/cn/itcast/chapter09/entity/User.java
src/cn/itcast/chapter09/filter/LoginServlet.java
src/cn/itcast/chapter09/filter/LogoutServlet.java
src/cn/itcast/chapter09/filter/AutoLoginFilter.java
web/login.jsp

src/cn/itcast/fileupload/UploadServlet.java
out/artifacts/CakeShopWebs_war_exploded2/upload			上传文件所在目录
web/form.jsp

src/cn/itcast/fileupload/DownloadServlet.java
web/download/ASCII.jpg				测试文件下载，测试文件所在目录
web/download.jsp
```

```
web/login.jsp		-->		web/login08.jsp
web/index.jsp  内容置换
```





第10章

```
使用JDBC完成数据的增删查改
用户登录功能
```



```
src/cn/itcast/jdbc/example/dao/UsersDao.java		数据库操作
src/cn/itcast/jdbc/example/domain/User.java
src/cn/itcast/jdbc/example/utils/JDBCUtils.java		连接数据库配置文件，数据库名，用户名和密码
web/WEB-INF/lib/mysql-connector-java-8.0.15.jar		驱动

src/cn/itcast/jdbc/example/JdbcInsertTest.java
src/cn/itcast/jdbc/example/DeleteUserTest.java
src/cn/itcast/jdbc/example/FindUserByIdTest.java
src/cn/itcast/jdbc/example/FindAllUsersTest.java
src/cn/itcast/jdbc/example/UpdateUserTest.java


web/login10.jsp	
src/cn/itcast/GetConnection.java
src/cn/itcast/LoginServlet.java			
```

```
web/login.jsp	--->		web/login09.jsp
第9章部分内容因login.jsp改名修改
```


---

---



### 第四章内容

```
/src/request
/src/response
/web/form.html
/web/login04.html
/web/welcome.html
```

#### 	测试

```
http://localhost:8080/CakeShopWebs/form.html
用户密码随意
```

```
http://localhost:8080/CakeShopWebs/login04.html
itcast
123
```



### 第5章内容

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
/web/login05.html
```

#### 测试

```
http://localhost:8080/CakeShopWebs/LastAccessServlet
```

```
http://localhost:8080/CakeShopWebs/login05.html
itcast
123

备注
 class cn.itcast.chapter09.entity.User cannot be cast to class cn.itcast.session.entity.User (cn.itcast.chapter09.entity.User and cn.itcast.session.entity.User are in unnamed module of loader org.apache.catalina.loader.ParallelWebappClassLoader @7cea41e1)
 
 创建了两个相同的session对象
```



第5章修改记录

~~/*/src/response/LoginServlet.java~~

* ~~第4章内容~~
* ~~LoginServlet.java~~
* ~~注释原因：与第5章内容重合~~
* ~~改名LoginServlet001.java~~
 * ~~*/~~



### 第6章内容

```
将页面转发到用户登录界面
网上蛋糕商城jsp界面
```

```
/example/Ejsp		jsp功能测试文件夹，无用
/web/css
/web/fonts
/web/header06.jsp
/web/footer06.jsp
/web/forward06.jsp
/web/login06.jsp
/web/user_register06.jsp
```

#### 	测试

```
http://localhost:8080/CakeShopWebs/forward.jsp
```

```
http://localhost:8080/CakeShopWebs/user_register06.jsp
```





### 第7章

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

#### 	测试

```
http://localhost:8080/CakeShopWebs/if.jsp?action=mon
tues  wed  thu	fri	sat	sun
```



### 第8章

```
使用JavaBean解决中文乱码		否

判断用户名是否有效
按照JSP Moderl2思想实现用户注册功能
```

```
example/eJavaBean		JavaBean和jsp开发模型功能测试文件夹，无用

/src/cn.itcast/Email.java
/src/cn.itcast/CharactorEncoding.java
/web/email08.jsp
/web/release08.jsp

/web/login08.jsp
/web/judge08.jsp

src/cn/itcast/chapter08/model2/domain/RegisterFormBean.java
src/cn/itcast/chapter08/model2/domain/UserBean.java
src/cn/itcast/chapter08/model2/util/DBUtil.java
src/cn/itcast/chapter08/model2/web/ControllerServlet.java
web/register08.jsp
web/loginSuccess08.jsp
```

~~/web/login.jsp	-->   /web/login6.jsp~~



#### 测试

```
http://localhost:8080/CakeShopWebs/email08.jsp
```

```
http://localhost:8080/CakeShopWebs/login08.jsp
```

```
http://localhost:8080/CakeShopWebs/register08.jsp
```



### 第9章

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
web/login09.jsp

src/cn/itcast/fileupload/UploadServlet.java
out/artifacts/CakeShopWebs_war_exploded2/upload			上传文件所在目录
web/upload09.jsp

src/cn/itcast/fileupload/DownloadServlet.java
web/download/ASCII.jpg				测试文件下载，测试文件所在目录
web/download09.jsp
```

```
web/login.jsp		-->		web/login08.jsp
web/index.jsp  内容置换
```

#### 测试

```
http://localhost:8080/CakeShopWebs/login09.jsp
itcast
123456
```

```
http://localhost:8080/CakeShopWebs/upload09.jsp
```

```
http://localhost:8080/CakeShopWebs/download09.jsp
```



### 第10章

```
使用JDBC完成数据的增删查改
用户登录功能
```



```
src/cn/itcast/jdbc/example/dao/UsersDao.java		数据库操作
src/cn/itcast/jdbc/example/domain/User.java
src/cn/itcast/jdbc/example/utils/JDBCUtils.java		连接数据库配置文件，数据库名，用户名和密码
web/WEB-INF/lib/mysql-connector-java-8.0.15.jar		驱动

example/source/jdbc.sql								第10章数据库文件

src/cn/itcast/jdbc/example/JdbcInsertTest.java		增
src/cn/itcast/jdbc/example/DeleteUserTest.java		删
src/cn/itcast/jdbc/example/FindUserByIdTest.java	查单个
src/cn/itcast/jdbc/example/FindAllUsersTest.java	查所有
src/cn/itcast/jdbc/example/UpdateUserTest.java		改


web/login10.jsp	
src/cn/itcast/GetConnection.java
src/cn/itcast/LoginServlet.java			
```



~~web/login.jsp	--->		web/login09.jsp~~
~~第9章部分内容因login.jsp改名修改~~

#### 测试

```
分别运行
JdbcInsertTest.java		增
UpdateUserTest.java		改
FindAllUsersTest.java	查所有
FindUserByIdTest.java	查单个
DeleteUserTest.java		删
```

```
http://localhost:8080/CakeShopWebs/login10.jsp
张三
123
```

Debug记录

关于src/cn/itcast/LoginServlet.java中服务LoginServlet10在web运行中始终无法找到的问题

将web/login10.jsp	第58行

```
<form action="/LoginServlet10" method="post">
```

改为

```
<form action="/CakeShopWebs/LoginServlet10" method="post">
```

得以解决。。。。

服务过多，找不到？







### 第11章

```
使用DBUtils实现增删查改
```



```
web/WEB-INF/lib/commons-dbcp2-2.7.0.jar		DBCP数据库连接池实现包
web/WEB-INF/lib/commons-pool2-2.8.0.jar		commons-dbcp2-2.7.0.jar依赖包

web/WEB-INF/lib/c3p0-0.9.2.1.jar
web/WEB-INF/lib/commons-dbutils-1.7.jar
web/WEB-INF/lib/commons-logging-1.2.jar
web/WEB-INF/lib/mchange-commons-java-0.2.3.4.jar
example/sources/jdbc_user.sql					第11章数据库文件



src/cn/itcast/chapter11/example			分别写了JDBC和C3P0数据库连接池在使用配置文件和其他方式获取连接的不同，Example01~Example04
src/cn/itcast/jdbc/dao		C3P0数据库连接池增删查改操作
src/cn/itcast/jdbc/javabean/User.java		测试实例对象
src/cn/itcast/jdbc/utils/C3p0Utils.java		//创建数据源
src/c3p0-config.xml		C3P0数据库的连接信息和数据源的初始化信息
src/dbcpconfig.properties		JDBC数据库配置文件

```

#### 测试

```
分别运行
InsertDao.java		增
UpdateDao.java		改
QueryDao.java		查
DeleteDao.java		删
```





### 第12章

```
Ajax--实时显示公告信息
```

```
web/jquery-3.6.0.js
example/sources/info.sql"				第11章数据库文件		
src/cn/itcast/chapter12/ConnDB.java
src/cn/itcast/chapter12/connDB.properties
web/getInfo12.jsp
web/index.jsp
```

#### 测试

```
自动跳转
```


/*
 * 第4章内容
 * LoginServlet.java
 * 注释原因：与第5章内容重合
 * 改名LoginServlet001.java
 * */

package response;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "LoginServlet04 ",urlPatterns = "/LoginServlet04")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // 用HttpServletRequest对象的getParameter()方法获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 假设用户名和密码分别为：itcast和123
        if ("itcast".equals(username) &&"123".equals(password)) {
            // 如果用户名和密码正确，重定向到 welcome.html
            response.sendRedirect("/CakeShopWebs/welcome.html");
        } else {
            // 如果用户名和密码错误，重定向到login.html
            response.sendRedirect("/CakeShopWebs/login04.html");
        }
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}

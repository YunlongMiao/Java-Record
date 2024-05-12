//处理用户登录请求

package cn.itcast.chapter09.filter;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import cn.itcast.chapter09.entity.User;
@WebServlet(name = "LoginServlet09",urlPatterns = "/LoginServlet09")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 获得用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 检查用户名和密码
        if ("itcast".equals(username) && "123456".equals(password)) {
            // 登录成功
            // 将用户状态 user 对象存入 session域
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            request.getSession().setAttribute("user", user);
            // 发送自动登录的cookie
            String autoLogin = request.getParameter("autologin");
            if (autoLogin != null) {
                // 注意 cookie 中的密码要加密
                Cookie cookie = new Cookie("autologin", username + "-"
                        + password);
                cookie.setMaxAge(Integer.parseInt(autoLogin));
                cookie.setPath(request.getContextPath());
                response.addCookie(cookie);
            }
            // 跳转至首页
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        } else {
            request.setAttribute("errerMsg", "用户名或密码错误");
            request.getRequestDispatcher("/login09.jsp")
                    .forward(request,response);
        }
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
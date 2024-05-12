package cn.itcast.session.servlet;
import cn.itcast.session.entity.User05;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "LoginServlet05",urlPatterns="/LoginServlet05")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        //假设正确的用户名 是itcast 密码是123
        if (("itcast").equals(username) && ("123").equals(password)) {
            User05 user = new User05();
            user.setUsername(username);
            user.setPassword(password);
            request.getSession().setAttribute("user05", user);
            response.sendRedirect("/CakeShopWebs/IndexServlet");
        } else {
            pw.write("用户名或密码错误，登录失败");
        }
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

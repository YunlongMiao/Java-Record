package cn.itcast.session.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "LogoutServlet",urlPatterns="/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 将Session对象中的User对象移除
        request.getSession().removeAttribute("user05");
        response.sendRedirect("/CakeShopWebs/IndexServlet");
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}

package cn.itcast.session.servlet;
import cn.itcast.session.entity.User05;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "IndexServlet",urlPatterns="/IndexServlet")
public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
        // 解决乱码问题
        response.setContentType("text/html;charset=utf-8");
        // 创建或者获取保存用户信息的Session对象
        HttpSession session = request.getSession();
        User05 user = (User05) session.getAttribute("user05");
        if (user == null) {
            response.getWriter().print(
                    "您还没有登录，请<a href='/CakeShopWebs/login05.html'>登录</a>");
        } else {
            response.getWriter().print("您已登录，欢迎你，" + user.getUsername() + "！");
            response.getWriter().print(
                    "<a href='/CakeShopWebs/LogoutServlet'>退出</a>");
            // 创建Cookie存放Session的标识号
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60 * 30);
            cookie.setPath("/CakeShopWebs");
            response.addCookie(cookie);
        }
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

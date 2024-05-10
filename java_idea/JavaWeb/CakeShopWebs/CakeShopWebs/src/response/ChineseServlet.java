package response;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ChineseServlet",urlPatterns = "/ChineseServlet")
public class ChineseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        //设置字符编码
        response.setContentType("text/html;charset=utf-8");
        String data = "中国";
        PrintWriter out = response.getWriter();
        out.println(data);
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}


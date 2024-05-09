package response;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "LoginServlet ",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // ��HttpServletRequest�����getParameter()������ȡ�û���������
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // �����û���������ֱ�Ϊ��itcast��123
        if ("itcast".equals(username) &&"123".equals(password)) {
            // ����û�����������ȷ���ض��� welcome.html
            response.sendRedirect("/chapter04/welcome.html");
        } else {
            // ����û�������������ض���login.html
            response.sendRedirect("/chapter04/login.html");
        }
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}

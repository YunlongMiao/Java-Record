package response;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "PrintServlet",urlPatterns = "/PrintServlet")
public class PrintServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws ServletException, IOException {
        String data = "itcast";
      /*  // ��ȡ�ֽ����������
        OutputStream out = response.getOutputStream();
        out.write(data.getBytes());// �����Ϣ*/
        // ��ȡ�ַ����������
        PrintWriter print = response.getWriter();
        print.write(data); // �����Ϣ

    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}


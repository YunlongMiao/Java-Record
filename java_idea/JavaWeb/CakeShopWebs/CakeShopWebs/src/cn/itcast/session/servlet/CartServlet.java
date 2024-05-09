package cn.itcast.session.servlet;
import cn.itcast.session.entity.Cake;
import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "CartServlet",urlPatterns="/CartServlet")
public class CartServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        // ����cart�����û��Ĺ��ﳵ
        List<Cake> cart = null;
        // ����pruFlag����û��Ƿ������Ʒ
        boolean purFlag = true;
        // ����û���session
        HttpSession session = req.getSession(false);
        // ���sessionΪnull��purFlag��Ϊfalse
        if (session == null) {
            purFlag = false;
        } else {
            // ����û����ﳵ
            cart = (List) session.getAttribute("cart");
            // ����õĹ��ﳵΪnull��purFlag��Ϊfalse
            if (cart == null) {
                purFlag = false;
            }
        }
        /*
         * ���purFlagΪfalse�������û�û�й��򵰸�  �ض���ListServletҳ��
         */
        if (!purFlag) {
            out.write("�Բ�������û�й����κ���Ʒ��<br>");
        } else {
            // ������ʾ�û����򵰸����Ϣ
            out.write("������ĵ����У�<br>");
            double price = 0;
            for (Cake cake : cart) {
                out.write(cake.getName() + "<br>");
            }
        }
    }
}

package cn.itcast.session.servlet;
import cn.itcast.session.entity.Cake;
import cn.itcast.session.entity.CakeDB;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "PurchaseServlet",urlPatterns="/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // ����û��������Ʒ
        String id = req.getParameter("id");
        if (id == null) {
            // ���idΪnull���ض���ListBookServletҳ��
            String url = "ListBookServlet";
            resp.sendRedirect(url);
            return;
        }
        Cake book = CakeDB.getCake(id);
        // �������߻���û���Session����
        HttpSession session = req.getSession();
        // ��Session�����л���û��Ĺ��ﳵ
        List<Cake> cart = (List) session.getAttribute("cart");
        if (cart == null) {
            // �״ι���Ϊ�û�����һ�����ﳵ(List����ģ�⹺�ﳵ)
            cart = new ArrayList<Cake>();
            // ������Ǵ���Session����
            session.setAttribute("cart", cart);
        }
        // ����Ʒ���빺�ﳵ
        cart.add(book);
        // ����Cookie���Session�ı�ʶ��
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(60 * 30);
        cookie.setPath("/Servlet");
        resp.addCookie(cookie);
        // �ض��򵽹��ﳵҳ��
        String url = "CartServlet";
        resp.sendRedirect(url);
    }
}

package cn.itcast.session.servlet;
import cn.itcast.session.entity.Cake05;
import cn.itcast.session.entity.CakeDB05;
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
        // 获得用户购买的商品
        String id = req.getParameter("id");
        if (id == null) {
            // 如果id为null，重定向到ListBookServlet页面
            String url = "ListBookServlet";
            resp.sendRedirect(url);
            return;
        }
        Cake05 book = CakeDB05.getCake(id);
        // 创建或者获得用户的Session对象
        HttpSession session = req.getSession();
        // 从Session对象中获得用户的购物车
        List<Cake05> cart = (List) session.getAttribute("cart05");
        if (cart == null) {
            // 首次购买，为用户创建一个购物车(List集合模拟购物车)
            cart = new ArrayList<Cake05>();
            // 将购物城存入Session对象
            session.setAttribute("cart05", cart);
        }
        // 将商品放入购物车
        cart.add(book);
        // 创建Cookie存放Session的标识号
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(60 * 30);
        cookie.setPath("/Servlet");
        resp.addCookie(cookie);
        // 重定向到购物车页面
        String url = "CartServlet";
        resp.sendRedirect(url);
    }
}

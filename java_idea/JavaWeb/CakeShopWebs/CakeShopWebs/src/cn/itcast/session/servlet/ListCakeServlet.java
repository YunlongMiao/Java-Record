package cn.itcast.session.servlet;
import cn.itcast.session.entity.Cake05;
import cn.itcast.session.entity.CakeDB05;
import java.io.*;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "ListCakeServlet",urlPatterns="/ListCakeServlet")
public class ListCakeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        Collection<Cake05> cakes = CakeDB05.getAll();
        out.write("本站提供的蛋糕有：<br>");
        for (Cake05 cake : cakes) {
            String url = "PurchaseServlet?id=" + cake.getId();
            out.write(cake.getName() + "<a href='" + url
                    + "'>点击购买</a><br>");
        }
    }
}

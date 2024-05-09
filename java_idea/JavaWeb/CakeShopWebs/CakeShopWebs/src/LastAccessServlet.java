import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "LastAccessServlet",urlPatterns = "/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException,IOException {
        //ָ��������������ݵı��뷽ʽUTF-8����ֹ��������
        response.setContentType("text/html;charset=utf-8");
        //��ȡ����cookie
        Cookie[] cookies=request.getCookies();
        //����flag��boolean�����������ж�cookies�Ƿ�Ϊ��
        boolean flag=false;
        //����cookie����
        if(cookies.length >0&&cookies!=null){
            for(Cookie cookie:cookies) {
                //��ȡcookie������
                String name=cookie.getName();
                //�ж������Ƿ���lastTime
                if("lastTime".equals(name)){
                    //�и�cookie���ǵ�һ�η���
                    flag=true;
                    //��Ӧ����
                    //��ȡcookie��valueʱ��
                    String value=cookie.getValue();
                    System.out.println("����ǰ��"+value);
                    //URL����
                    value= URLDecoder.decode(value, "utf-8");
                    System.out.println("�����"+value);
                    response.getWriter().write("��ӭ�����������������ϴη���ʱ��Ϊ:"+value);
                    //����cookie��value
                    //��ȡ��ǰʱ����ַ�������������cookie��ֵ�����·���cookie
                    Date date=new Date();
                    SimpleDateFormat timesdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
                    String str_time=timesdf.format(date);
                    System.out.println("����ǰ��"+str_time);
                    //URL����
                    str_time=URLEncoder.encode(str_time, "utf-8");
                    System.out.println("�����"+str_time);
                    cookie.setValue(str_time);
                    //����cookie���ʱ��
                    cookie.setMaxAge(60*60*24*30);	//һ����
                    //���뵱ǰcookie����ʱ��
                    response.addCookie(cookie);
                    break;
                }
            }
            //���cookies��û��ʱ�䣬Ҳ����û�з��ʹ�
            if(cookies==null || cookies.length==0 || flag==false){
                //����cookie��value
                //��ȡ��ǰʱ����ַ�������������cookie��ֵ�����·���cookie
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
                String str_date=sdf.format(date);
                System.out.println("����ǰ��"+str_date);
                //URL����
                str_date= URLEncoder.encode(str_date,"utf-8");
                System.out.println("�����"+str_date);
                Cookie cookie=new Cookie("lastTime",str_date);
                //����cookie���ʱ��
                cookie.setMaxAge(60*60*24*30);//һ����
                response.addCookie(cookie);
                response.getWriter().write("���ã���ӭ���״η���");
            }
        }
    }
    public void doPost(HttpServletRequest request,HttpServletResponse
            response)throws ServletException,IOException{
        this.doPost(request,response);
    }
}

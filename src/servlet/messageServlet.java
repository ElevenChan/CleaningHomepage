package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by DELL on 2015/7/24.
 */
public class messageServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=gb2312");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String addr = request.getParameter("addr");
        String company = request.getParameter("company");
        String msg = request.getParameter("msg");

    }
}

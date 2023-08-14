
package cookieDemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
    
       Cookie ck[]= request.getCookies();
       out.println("Welcome "+ ck[0].getValue());
       out.close();
       
       
}
}

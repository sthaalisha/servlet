
package cookieDemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet extends HttpServlet{
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("un");
       out.println("Miss  " +name);
       
       Cookie ck = new Cookie("n", name);
       response.addCookie(ck);
       
      
       
       out.println("<form action ='serv' method='post'>");
       out.println("<input type='submit', value='go'>");
  
       out.println("</form>");
       
   } 
    
}

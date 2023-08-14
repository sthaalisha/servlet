
package basicservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleRequest extends HttpServlet{
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("un");
       String password = request.getParameter("pass");
       out.println("<html><body>");
       out.println("Miss  " +name);
       
       out.println("</body></html>");
       out.close();
       
   } 
}
    
    


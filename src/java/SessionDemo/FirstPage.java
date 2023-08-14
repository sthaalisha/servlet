
package SessionDemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("username");
       
       HttpSession session = request.getSession();
       session.setAttribute("n" ,name);
       out.println("<html><body>");
       out.println("hello" + name);
       
       out.println("<form action ='Sec' method='post'>");
       out.println("<input type='submit' value='go'>");
  
       out.println("</form>");
       out.println("</body></html>");
       out.close();
       
   } 
    
}


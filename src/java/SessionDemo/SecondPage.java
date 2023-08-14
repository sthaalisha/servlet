
package SessionDemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondPage extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
    
       HttpSession session = request.getSession(false);
       String name = (String)session.getAttribute("n");
       out.println("</body></html>");
       out.println("welcome " + name);
       out.println("</body></html>");
      out.close();
       
       
}
    
}


package basicservlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class SimpleServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("</body></html>");
        out.println("my first web app");
        out.println("</body></html>");
        out.close();
    }
    
}

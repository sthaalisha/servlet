
package basicservlet;
import javax.servlet.GenericServlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
         res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<body></html>");
        out.println("my second web app");
        out.println("</body></html>");
        out.close();
    }
    
}


package basicservlet;
import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet {
    ServletConfig conf = null;
    
    public void init(ServletConfig conf)
    {
        this.conf = conf;
        System.out.println("conf");
        
    }
    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
         res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("my first web app");
        out.close();
    }
    public void destroy()
    {
        System.out.println("destroyed");
    }
    public ServletConfig getServletConfig()
    {
        return conf;
    }
    
   public String getServletInfo()
   {
       return "Servlet creation";
               }

   }
    



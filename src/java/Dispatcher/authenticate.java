/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispatcher;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class authenticate extends HttpServlet {
    
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("Username");
        String password = request.getParameter("Password");
       if(password.equalsIgnoreCase("admin"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("welcome");
           rd.forward(request, response);
       }
       else
       {
           out.print("The entered Password is incorrect");
           RequestDispatcher rd = request.getRequestDispatcher("Dispatcher.html");
           rd.include(request, response);
       }
       out.close();
     }
    
    
}

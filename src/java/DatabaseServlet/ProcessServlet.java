
package DatabaseServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ProcessServlet extends HttpServlet{
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       int id= Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       String address= request.getParameter("address");
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
        PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?");
        
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,address);
        
        int a=pst.executeUpdate();
        out.println(a+"Inserted Sucessfully");
    }catch (Exception e){
        e.printStackTrace();
    }
        
    }
    
       
}

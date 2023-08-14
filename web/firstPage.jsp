<%-- 
    Document   : firstPage
    Created on : Apr 28, 2023, 11:58:56 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("un");
       Cookie ck = new Cookie("n", name);
       response.addCookie(ck);
            out.println("Miss  " +name);

            %>
            <form action="SecondPage.jsp" method = "post">
      <input type = "submit" value="Go">
    </body>
</html>

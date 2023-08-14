<%-- 
    Document   : SecondPage
    Created on : Apr 28, 2023, 11:59:10 AM
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
            Cookie ck[] = request.getCookies();
            
            out.println("Welcome "+ ck[1].getValue());
            %>
    </body>
</html>

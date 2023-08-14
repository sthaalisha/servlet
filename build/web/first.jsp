<%-- 
    Document   : first
    Created on : Apr 18, 2023, 12:28:15 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial</title>
    </head>
    <body>
        <H1>factorial</H1>

<%!

int numberfactorial(int number)

{

if (number == 1) {

return number;

}

else {

return number * numberfactorial(number - 1);

}

}

%>

<%

out.println("The factorial of 5 is " + numberfactorial(5));

%>

        
    </body>
</html>


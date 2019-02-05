<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="style1.css">
</head>

<body>

    <div class="loginbox">
    <img src="avatar1.png" class="avatar">
    <h2>
    <%
    String k=request.getParameter("uname");  
    out.println("Hello "+k);
   %></h2>
   <h2>Welcome To This New Social Networking Site</h2>
   <h2>Hope You Feel Better Here</h2>
   <h2>Welcome To This New Social Networking Site</h2>
   <h2>Hope You Feel Better Here</h2>
   
       </div>
        
 
</body>
</html>
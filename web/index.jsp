<%--
  Created by IntelliJ IDEA.
  User: peter.zahariev
  Date: 6/11/2019
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hi from default page</h1>
<p>and from ${name}</p>
<%String anotherName = (String)request.getAttribute("name"); %>
<p>Hi from <%= anotherName%></p>
</body>
</html>

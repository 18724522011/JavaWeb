<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
     session.setAttribute("name","李四");
     session.setAttribute("age",23);
     request.setAttribute("name","张三");
     request.setAttribute("str","");
%>
<h3>el获取值</h3>
${requestScope.name}
${requestScope.str}
${sessionScope.name}
${sessionScope.age}
${name}
<%--最近的为止--%>
</body>
</html>

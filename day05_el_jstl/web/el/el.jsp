<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true"  %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
${3>4}<br>
\${3>4}<br>
<h3>算数运算符</h3>
${3+4}
${3-4}
${3%4}
${3 div 4}
<h3>比较运算符</h3>
${3==4}
<h3>逻辑运算符</h3>
${3>4&&3<4}
${3>4 and 3<4}
<h3>empty运算符</h3>
<%
    String str = "";
    request.setAttribute("str", str);
    List<String> list = new ArrayList<>();
    list.add("aa");
    request.setAttribute("list", list);

%>
<%--empty判断为空--%>
${ empty str }
${empty list}
${not empty str}
${not empty list}
</body>
</html>

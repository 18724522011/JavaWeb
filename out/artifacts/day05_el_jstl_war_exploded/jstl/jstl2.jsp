<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>foreach标签</title>
</head>
<body>
<%--
begin开始
end结束
var临时变量
step步厂
varStatus：循环状态对象
index:容器中索引
count:循环次数
--%>
<%--<c:forEach begin="1" end="10" var="i" step="1" varStatus="s">--%>
<%--    ${i}--%>
<%--    <h3>${s.index}</h3>--%>
<%--    <h3>${s.count}</h3>--%>
<%--</c:forEach>--%>

<%
    List<String> list = new ArrayList<>();
    list.add("bbb");
    list.add("aaa");
    list.add("ccc");
    request.setAttribute("list",list);

%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.count}---
    ${s.index}---
    ${str}----
</c:forEach>
</body>
</html>


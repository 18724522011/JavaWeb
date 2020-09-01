<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--c:if
  1、 属性 test 必须属性， 接受的是boolean表达式
    一般 test配合 el表达式一起使用
    2、 没有else部分， 想要的话需要在定义一个 c:if false不显示
--%>
<c:if test="true">
    <h1>还有一个月就过节了</h1>
</c:if>
<%
    List<Object> list = new ArrayList<>();
    list.add("bbb");
    request.setAttribute("list",list);
    request.setAttribute("number",7);
%>
<c:if test="${ not empty list}">
    <h4></h4>遍历集合
</c:if>
<c:if test="${not empty requestScope.list}">
    <h2>遍历集合</h2>
</c:if>
<br>
<c:if test="${number % 2 != 0}">
    <h2>${number}为奇数</h2>
</c:if>
<c:if test="${number % 2 == 0}">
    <h2>${number}为偶数</h2>
</c:if>

</body>
</html>


<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.neusoft.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setAge(13);
    user.setName("张三");
    user.setBirthday(new Date());
    request.setAttribute("u", user);

    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("user");
    request.setAttribute("list", list);
    HashMap<String, Object> map = new HashMap<>();
    map.put("sname", "赵四");
    map.put("gender", "男");
    map.put("user", user);
    request.setAttribute("map", map);
%>
${requestScope.list[0]}<br>
${list[3]}<br>

${map.gender}<br>
${ map["gender"] }<br>
${map.user.name}
<h1>el</h1>
${requestScope.u.age}
${requestScope.u}
${u.age}
${u.birthday}

</body>
</html>

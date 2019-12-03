<%@ page import="net.been.user" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: aabc
  Date: 2019/12/4
  Time: 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name", "小明");
    user us = new user();
    us.setName("小红");
    us.setSex("女");
    session.setAttribute("user", us);
    List<user> list = new ArrayList<>();
    user us1 = new user();
    us1.setName("小强");
    us1.setSex("男");

    user us2 = new user();
    us2.setName("小李");
    us2.setSex("女");
    list.add(us1);
    list.add(us2);

    application.setAttribute("list", list);

%>

<%=request.getAttribute("name")%>
<%
    user ur = (user) session.getAttribute("user");
    String name = ur.getName();
    out.write(name);


%>


<%
    List<user> list1 = (List<user>) application.getAttribute("list");
    user user = list.get(0);
    out.write(user.getName());
%>

${requestScope.name}
${sessionScope.user.name}
${applicationScope.list[0].name}

${name}
${user.name}
${list[1].name}
</body>
</html>

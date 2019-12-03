<%--
  Created by IntelliJ IDEA.
  User: aabc
  Date: 2019/12/3
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
//内部的JAVA代码翻译到SERVICE方法的内部<%--  jsp注释  --%>
<%
    /*
    *
    * 多行
    * 注释
    * */
int i=0;
i++;
%>

//会被翻译成SERVICE方法内部的OUT.PRINT()
<%="变量I=" +i
%>

//翻译成SERVLET的成员的内容  线程问题，不建议使用
<%!
int x = 0;
%>
</body>
</html>

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
    <title>我是标题</title>

</head>
<body>
<%--  jsp注释  --%>
<%
    /*
    *
    * 多行 的行为
    * 注释
    * */
    //内部的JAVA代码翻译到SERVICE方法的内部
int i=0;
i++;
%>


<%="变量I=" +i
//会被翻译成SERVICE方法内部的OUT.PRINT()
%>


<%!
int x = 0;
//翻译成SERVLET的成员的内容  线程问题，不建议使用
%>
</body>
</html>

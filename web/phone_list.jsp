<%--
  Created by IntelliJ IDEA.
  User: aabc
  Date: 2019/12/4
  Time: 1:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>商品列表</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
    <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <!-- 引入自定义css文件 style.css -->
</head>
<body>
<c:forEach items="${list}" var="phone">

    <div class="col-md-2" style="height:250px">
        <img src="${phone.image}" width="170" height="170" style="display: inline-block;">
        </a>
        <p>
            <a href="product_info.html" style='color: green'>${phone.name}</a>
        </p>
        <p>
            <font color="#FF0000">商城价：&yen;${phone.price}</font>
        </p>
    </div>

</c:forEach>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: xiaokang_dai
  Date: 2019/7/21
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
giao哥哥，一给里我里giao
<a href="account/findall">测试springmvc</a>

<h3>测试保存</h3>
<form action="account/save" method="post">
    姓名:<input type="text" name="name"/><br/>
    金额:<input type="text" name="money"/><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>

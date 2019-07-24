<%--
  Created by IntelliJ IDEA.
  User: xiaokang_dai
  Date: 2019/7/21
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>喔胡卧虎哈哈哈</h3>

<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}
</c:forEach>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="<%=request.getContextPath()%>/auth-servlet">Đăng Nhập</a>
<%-- request.getContextPath để tránh lỗi 404 trong java --%>
</body>
</html>
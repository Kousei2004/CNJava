<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Ứng dụng đếm ký tự</title></head>
<body>
    <h2>Nhập chuỗi để đếm số ký tự:</h2>
    <form action="count" method="post">
        <input type="text" name="inputString" />
        <input type="submit" value="Đếm" />
    </form>

    <c:if test="${not empty requestScope.count}">
        <h3>Kết quả:</h3>
        <p>Chuỗi: <c:out value="${requestScope.input}"/></p>
        <p>Số ký tự: <c:out value="${requestScope.count}"/></p>

        <c:if test="${requestScope.count > 10}">
            <p style="color:red;">Chuỗi dài hơn 10 ký tự!</p>
        </c:if>
    </c:if>
</body>
</html>

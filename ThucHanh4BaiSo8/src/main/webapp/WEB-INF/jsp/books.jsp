<%-- Khai báo sử dụng thư viện JSTL Core để sử dụng các thẻ như c:forEach, c:if --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- Khai báo encoding UTF-8 để hiển thị tiếng Việt --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Library Books</title>
</head>
<body>
    <%-- Tiêu đề trang --%>
    <h2>Danh sách sách</h2>
    <%-- Bảng hiển thị danh sách sách --%>
    <table border="1">
        <%-- Header của bảng --%>
        <tr>
            <th>ID</th>
            <th>Tiêu đề</th>
            <th>Tác giả</th>
            <th>Trạng thái</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
             
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.status}</td>
                <td>
                    
                    <c:if test="${book.status == 'AVAILABLE'}">
                     
                        <form action="borrow" method="post">
                            
                            <input type="hidden" name="bookId" value="${book.id}" />
                         
                            <input type="text" name="userId" placeholder="User ID" required />
                         
                            <button type="submit">Mượn</button>
                        </form>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html> 
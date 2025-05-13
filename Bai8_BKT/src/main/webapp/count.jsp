<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Character Counter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
        }
        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .result {
            margin-top: 20px;
            padding: 10px;
            border: 1px solid #ddd;
        }
        .warning {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <h1>Character Counter</h1>
    
    <form action="count" method="post">
        <div class="form-group">
            <label for="inputString">Enter your text:</label>
            <input type="text" id="inputString" name="inputString" value="${param.inputString}" required>
        </div>
        <button type="submit">Count Characters</button>
    </form>

    <c:if test="${not empty requestScope.count}">
        <div class="result">
            <h3>Result:</h3>
            <p>Input string: <c:out value="${requestScope.inputString}"/></p>
            <p>Number of characters: <c:out value="${requestScope.count}"/></p>
            
            <c:if test="${requestScope.count > 10}">
                <p class="warning">Warning: The input string is longer than 10 characters!</p>
            </c:if>
        </div>
    </c:if>
</body>
</html> 
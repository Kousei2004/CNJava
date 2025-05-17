<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Blog Posts</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Blog Posts</h1>
        
        <sec:authorize access="hasRole('ADMIN')">
            <a href="/posts/new" class="btn btn-primary mb-3">Create New Post</a>
        </sec:authorize>

        <div class="row">
            <c:forEach items="${posts}" var="post">
                <div class="col-md-12 mb-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">${post.title}</h5>
                            <h6 class="card-subtitle mb-2 text-muted">By ${post.author} on ${post.createdAt}</h6>
                            <p class="card-text">${post.content}</p>
                            
                            <sec:authorize access="hasRole('ADMIN')">
                                <a href="/posts/edit/${post.id}" class="btn btn-warning">Edit</a>
                                <a href="/posts/delete/${post.id}" class="btn btn-danger" 
                                   onclick="return confirm('Are you sure you want to delete this post?')">Delete</a>
                            </sec:authorize>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html> 
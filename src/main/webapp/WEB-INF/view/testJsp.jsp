<!doctype html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" class="no-js" >
<head>
    <meta charset="utf-8" />
    <meta name="author" content="" />
    <meta name="keywords" content="" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <title></title>

    <script src="../webjars/jquery/3.1.1/jquery.min.js"></script>
    <script src="../webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../webjars/bootstrap/3.3.5/css/bootstrap.min.css" />

</head>

<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <table class="table table-striped table-bordered">
            <c:forEach var="person" items="${personList}">
                <tr class="text-info">
                    <td>${person.userName}</td>
                    <td>${person.age}</td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>
</body>
</html>
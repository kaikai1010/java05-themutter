<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

<h1>User Info Change Done</h1>
<br>
<br>

<p>
Your User Info is changed.
</p>
<br>

<button type="button" class="btn btn-link" onclick="location.href='/themutter/UserInfoChangeServ'">Back to Change User Info</button>
<br>
<br>

<jsp:include page="/WEB-INF/include/footer.jsp"/>
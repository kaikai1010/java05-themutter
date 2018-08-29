<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

<c:choose>
<c:when test="${empty u}">
<%-- 会員登録失敗 --%>
<h1>Registration Failed</h1>
<br>
<br>

<p>
Your registration is failed..
</p>
<br>

<button type="button" class="btn btn-default" onclick="location.href='/themutter/RegisterServ'">Try Again</button>
</c:when>

<c:otherwise>
<%-- 会員登録成功 --%>
<h1>Registration Done</h1>
<br>
<br>

<p>
Your registration is done sucessfully, <c:out value="${requestScope.u.id}" />.<br>
Now you can login.
</p>
<br>
<br>

<button type="button" class="btn btn-primary" onclick="location.href='/themutter/LoginServ'">Login</button>
<button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
</c:otherwise>
</c:choose>

<br>
<br>
<jsp:include page="/WEB-INF/include/footer.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

<c:choose>
<c:when test="${empty ul}">
<%-- ログイン失敗 --%>
<h1>Login Failed</h1>
<br>
<br>

<p>
Your login is failed..
</p>
<br>

<button type="button" class="btn btn-default" onclick="location.href='/themutter/LoginServ'">Try Again</button>
</c:when>

<c:otherwise>
<%-- ログイン成功 --%>
<h1>Login Done</h1>
<br>
<br>

<p>
Your login is done sucessfully, <c:out value="${ul.id}" />.<br>
Now you can mutter.
</p>
<br>
<br>

<button type="button" class="btn btn-primary" onclick="location.href='/themutter/MutterPostServ'">Post MUTTER</button>
<button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
</c:otherwise>
</c:choose>

<br>
<br>
<jsp:include page="/WEB-INF/include/footer.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp" />

<img src="themutter.jpg" alt="themutter">
<br>
<br>
<br>

<h1>HOME</h1>
<br>
<br>

<c:choose>
<c:when test="${empty ul}">
<%-- ログイン --%>
<p>
Welcome to <b>The Mutter.</b><br>
Register your User ID, Email, and Password.<br>
So you can login and MUTTER with other users.
</p>
<br>
<br>

<button type="button" class="btn btn-primary" onclick="location.href='/themutter/RegisterServ'">User Registration</button>
<button type="button" class="btn btn-primary" onclick="location.href='/themutter/LoginServ'">LOGIN</button>
</c:when>

<c:otherwise>
<%-- ログアウト --%>
<p>
Hi, <c:out value="${ul.id}" />. You're now <b>logged-in.</b>
<button type="button" class="btn btn-default" onclick="return logoutConfirm();">Logout</button>
</p>
<br>
<br>

<button type="button" class="btn btn-primary" onclick="location.href='/themutter/MutterPostServ'">Post MUTTER</button>
<button type="button" class="btn btn-default" onclick="location.href='/themutter/UserInfoChangeServ'">Change User Info</button>
</c:otherwise>
</c:choose>

<br>
<br>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"></script>

<jsp:include page="/WEB-INF/include/footer.jsp" />
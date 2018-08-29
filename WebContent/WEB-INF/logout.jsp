<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

<%-- ログイン失敗 --%>
<h1>Logout Done</h1>
<br>
<br>

<p>
You're logged-out.. See you soon.
</p>
<br>

<button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
<br>
<br>

<jsp:include page="/WEB-INF/include/footer.jsp"/>
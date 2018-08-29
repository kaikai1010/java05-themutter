<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

    <h1>Mutter Post</h1>
    <br>
    <br>

<p>
Hi, <c:out value="${ul.id}" />. You're now <b>logged-in.</b>
<button type="button" class="btn btn-default" onclick="return logoutConfirm();">Logout</button>
</p>


<p>
<img alt="coffee" src="coffee.jpg">
<br>
<br>
Need some coffee? Or update the mutter list?
<button type="button" class="btn btn-primary" onclick="location.href='/themutter/MutterPostServ'">Update</button>
</p>
<br>
<br>

    <form class="form-group" action="/themutter/MutterPostServ" method="post">

  <div class="form-group">
    <label for="inputText" class="col-lg-2 control-label"></label>
    <div class="col-lg-10">
      <input type="text" name="text" class="form-control" id="inputText" placeholder="Mutter something..">
    </div>
  </div>

  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <button type="submit" class="btn btn-primary">MUTTER</button>
      <button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
    </div>
  </div>

</form>
<br>

<c:choose>
<c:when test="${not empty errorMsg}">
<p>${errorMsg}</p>
</c:when>

<c:otherwise>
<c:forEach var="m" items="${list}">
<p>
<c:out value="${m.id}" /> : <c:out value="${m.text}" /> (<c:out value="${m.time}" />)
</p>
</c:forEach>
</c:otherwise>
</c:choose>

<jsp:include page="/WEB-INF/include/footer.jsp"/>
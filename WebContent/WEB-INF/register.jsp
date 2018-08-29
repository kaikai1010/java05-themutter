<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

    <h1>User Registration</h1>
    <br>
    <br>

    <form class="form-group" method="post" onsubmit="return registerSubmitCheck();">

  <div class="form-group">
    <label for="inputId" class="col-lg-2 control-label">User ID</label>
    <div class="col-lg-10">
      <input type="text" name="id" class="form-control" id="inputId" placeholder="kaikai">
    </div>
  </div>

  <div class="form-group">
    <label for="inputMail" class="col-lg-2 control-label">Email</label>
    <div class="col-lg-10">
      <input type="email" name="mail" class="form-control" id="inputMail" placeholder="kaikai@xxx.com">
    </div>
  </div>

  <div class="form-group">
    <label for="inputPass" class="col-lg-2 control-label">Password</label>
    <div class="col-lg-10">
      <input type="password" name="pass" class="form-control" id="inputPass" placeholder="1234 (*4 digits only)">
      <br>
    </div>
  </div>

  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
      <button type="submit" class="btn btn-primary">Register NOW</button>
      <button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
    </div>
  </div>

</form>
<br>
<br>

<jsp:include page="/WEB-INF/include/footer.jsp"/>
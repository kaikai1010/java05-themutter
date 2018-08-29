<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp"/>

    <h1>Change User info</h1>
    <br>
    <br>

<p>
Hi, <c:out value="${ul.id}" />. You're now <b>logged-in.</b>
<button type="button" class="btn btn-default" onclick="return logoutConfirm();">Logout</button>
</p>
<br>
<br>

<div class="container">
  <table class="table">
      <thead>
      <tr>
        <th>Registrated User Info</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">User ID</th>
          <td><c:out value="${ul.id}" /></td>
      </tr>
      <tr>
        <th scope="row">Email</th>
          <td><c:out value="${ul.mail}" /></td>
      </tr>
      <tr>
        <th scope="row">Password</th>
          <td><c:out value="${ul.pass}" /></td>
      </tr>
    </tbody>
  </table>
</div>
<br>
<br>

    <form class="form-group" method="post" onsubmit="return userInfoChangeSubmitCheck();">

<p>
You can change your User info. (*Email &amp; Password only)
</p>

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
      <button type="submit" class="btn btn-primary">Change</button>
      <button type="button" class="btn btn-link" onclick="location.href='/themutter/'">Back to HOME</button>
    </div>
  </div>

</form>
<br>
<br>

<p>
If you'd like, You can delete your User Info.
<button type="button" class="btn btn-default" onclick="return userInfoQuitConfirm();">Quit The Mutter</button>
</p>
<br>
<br>

<jsp:include page="/WEB-INF/include/footer.jsp"/>
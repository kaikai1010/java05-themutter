<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/include/header.jsp" />

<p>
<input type='text' id='textbox1' value='Hello, jQuery!'>
<input type='button' id='button1' value='OK'>
</p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready( function() {

jQuery('#button1').click(function(){
alert(jQuery('#textbox1').val());
});

});

</script>

<jsp:include page="/WEB-INF/include/footer.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:requestEncoding value="UTF-8"/>

Parameter : ${param.name}

<form action="exam09.jsp" method="post">
	이름 : <input type="text" name="name">
	<input type="submit" value="전송">
</form>
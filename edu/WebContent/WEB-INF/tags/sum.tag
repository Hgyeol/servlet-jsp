<%@ tag body-content="empty" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ attribute name="num1" required="true" %>
<%@ attribute name="num2" required="true" %>
<!-- ${num1} + ${num2} = ${num1 + num2} -->
<%@ variable name-given="result" variable-class="java.lang.Long" scope="AT_END"%>

<c:set var="result" value="${num1+num2}"/>
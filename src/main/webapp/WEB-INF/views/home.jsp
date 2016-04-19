<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title><spring:message code="label.title" /></title>
</head>
<body>
    <form method="post" action="login">
        <table>
            <tr>
                <td><label> <strong><spring:message
                                code="label.firstName" /></strong>
                </label></td>
                <td><input name="firstName" /></td>
            </tr>
            <tr>
                <td><label> <strong><spring:message
                                code="label.lastName" /></strong>
                </label></td>
                <td><input name="lastName" /></td>
            </tr>
            <tr>
                <spring:message code="label.submit" var="labelSubmit"></spring:message>
                <td colspan="2"><input type="submit" value="${labelSubmit}" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
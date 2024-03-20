<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

	<h1> User Info </h1>

	<table>
	<c:forEach items = "${list}" var="row" varStatus="status" >
                <tr>
                    <td> ${status.count} </td>
                    <td>${row.id}</td>
                    <td>${row.pwd}</td>
                </tr>

	</c:forEach>
	</table>

</html>
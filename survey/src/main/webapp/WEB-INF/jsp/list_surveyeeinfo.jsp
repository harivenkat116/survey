<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>
		<font color="blue"> Surveyee Information : </font><br />
	</h2>

	<table bordercolor="blue" border="1">
		<tr>
			<th>Surveyee Id</th>
			<th>Name</th>
			<th>Company Id</th>
			<th>Desk Number</th>
			<th>phoneNumber</th>
		</tr>

		<c:forEach items="${surveyeeInfos}" var="current">
			<tr>
				<td>${current.surveyeeId}</td>
				<td>${current.surveyeeName}</td>
				<td>${current.companyId}</td>
				<td>${current.deskNumber}</td>
				<td>${current.phoneNumber}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
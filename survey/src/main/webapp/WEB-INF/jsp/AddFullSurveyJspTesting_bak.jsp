<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
<link rel="stylesheet" href="/Survey2015/styles/survey.css"/>

</head>
<body>

	<h1><b style="color:blue">Survey Chimp:</b></h1>
	<h2 style="color:blue"><b>How was the technician?</b></h2>
	
	<div style="width:600px; margin-right:auto; margin-left:auto; background-color: #CCFFCC; border:7px solid blue;">
	<sf:form action="/Survey2015/addfullsurveyformJspTesting" method="post" modelAttribute="fullSurveyRecord">
	
		Surveyee name : <sf:input path="surveyeeName" type="text" value="Please enter full name"/> <br/>
		Company Id : <sf:input path="companyId"/><br/>
		Desk number : <sf:input path="deskNumber"/><br/>
		Phone number : <sf:input path="phoneNumber"/><br/>
		Technical category : <sf:input path="techCategory"/><br/>
		Solved? (Y/N) : <sf:input path="solvedOrNot" value="Y"/><br/>
		Degree of solution : <sf:input path="solutionDegree" value="5"/><br/>
		Willing to help(1-5) : <sf:input path="willToHelpRating" value="5"/><br/>
		Courtsey(1-5) : <sf:input path="courtesyRating" value="5"/><br/>
		
		<input type="submit" value="Save"/>
	</sf:form>
	</div>

</body>
</html>
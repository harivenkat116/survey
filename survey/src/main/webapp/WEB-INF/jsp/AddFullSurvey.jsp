<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sf:form action="/Survey2015/addfullsurveyform" method="post" modelAttribute="fullSurveyRecord">
	
		Surveyee name : <sf:input path="surveyeeName" type="text" value="Please enter full name"/> <br/>
		Company Id : <sf:input path="companyId"/><br/>
		Desk number : <sf:input path="deskNumber"/><br/>
		Phone number : <sf:input path="phoneNumber"/><br/>
		Technical category : <sf:input path="techCategory"/><br/>
		Solved? (Y/N) : <sf:input path="solvedOrNot"/><br/>
		Degree of solution : <sf:input path="solutionDegree"/><br/>
		Willing to help(1-5) : <sf:input path="willToHelpRating"/><br/>
		Courtsey(1-5) : <sf:input path="courtesyRating"/><br/>
		
		<input type="submit" value="Add Full Survey">
	</sf:form>

</body>
</html>
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

<div class="container">

  <h1><b style="color:blue">Survey Chimp:</b></h1>
  <h2><b style="color:blue">How was the technician?</b></h2>


  <sf:form action="/Survey2015/addfullsurveyformJspTesting" class="form-horizontal" role="form" method="post" modelAttribute="fullSurveyRecord">

    <div class="form-group">
      <br></br>
      <label class="control-label col-sm-2" for="surveyeeName">Surveyee name:</label>
      <div class="col-sm-8">
        <sf:input path="surveyeeName" id="surveyeeName" type="text" class="form-control" placeholder="Enter surveyee name"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="companyId">Company Id:</label>
      <div class="col-sm-1">
        <sf:input path="companyId" id="companyId" type="text" class="form-control" placeholder="Enter company Id"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="deskNumber">Desk number:</label>
      <div class="col-sm-5">
        <sf:input path="deskNumber" id="deskNumber" type="text" class="form-control" placeholder="Enter desk number"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="phoneNumber">Phone number:</label>
      <div class="col-sm-5">
        <sf:input path="phoneNumber" id="phoneNumber" type="text" class="form-control" placeholder="Enter phone number"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="techCategory">Technical category:</label>
      <div class="col-sm-8">
        <sf:input path="techCategory" id="techCategory" type="text" class="form-control" placeholder="Enter technical category"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="solvedOrNot">Solved? (Y/N):</label>
      <div class="col-sm-3">
        <sf:input path="solvedOrNot" id="solvedOrNot" type="text" class="form-control" placeholder="Enter solved or not"/>
      </div>

      <label class="control-label col-sm-2" for="solutionDegree">Degree of solution:</label>
      <div class="col-sm-3">
        <sf:input path="solutionDegree" id="solutionDegree" type="text" class="form-control" placeholder="Enter degree of solution"/>
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="willToHelpRating">Willing to help(1-5):</label>
      <div class="col-sm-3">
        <sf:input path="willToHelpRating" id="willToHelpRating" type="text" class="form-control" placeholder="Enter help rating"/>
      </div>

      <label class="control-label col-sm-2" for="courtesyRating">Courtsey(1-5):</label>
      <div class="col-sm-3">
        <sf:input path="courtesyRating" id="courtesyRating" type="text" class="form-control" placeholder="Enter courtsey rating"/>
      </div>
    </div>
    
    <div class="form-group" id="submit">
      <button type="submit">Add Customer</button>
    </div>

  </sf:form>

</div>



<!-- <script type="text/javascript">

	var numberOfTimesClicked = 0;
	alert("Hi it's just begining ...");
	
	function changeBackgroundColor() {
		alert("Hi it's just begining ...");
/* 		numberOfTimesClicked++;
		console.log("Number of times clicked = " + numberOfTimesClicked);
		
		var bodyElement = document.getElementById("myBody");
		bodyElement.setAttribute("style", "background-color: blue");

		if(numberOfTimesClicked % 2 == 0) {
			bodyElement.setAttribute("style", "background-color: blue");
			greeting.innerHTML = "You clicked me even number of times";
		} else {
			bodyElement.setAttribute("style", "background-color: green");
			greeting.innerHTML = "You clicked me odd number of times"; */
		}
		
		document.getElementById("greeting").setAttribute("style", "color: red");
		document.getElementById("clickMeButton").innerHTML = "Shop More";
	}
	
	alert("Hi it's not completed...");
</script> -->





	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>
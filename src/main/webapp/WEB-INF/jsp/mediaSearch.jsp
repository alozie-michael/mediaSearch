<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Media Search</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style>
/* 
*validation css 
*/
.error {
	color: #FF0000;
	font-weight: bold;
}
</style>

  </head>

  <body>

    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
              <h3 class="masthead-brand">media search</h3>
              <nav>
                <ul class="nav masthead-nav">
                  <li><a href="?language=en">english</a></li>
                  <li><a href="?language=es">spanish</a></li>
                </ul>
              </nav>
            </div>
          </div>
          
          <br/><br/>

          <div class="inner cover">
            <h1 class="cover-heading"><spring:message code="welcome.search.message" /></h1>
            
            <br/>

	            <form:form commandName="media" class="form-horizontal">

					<div class="form-group form-group-lg">
						<spring:message code="search.form.field" text="search" var="search"/>
						<form:input path="name" cssClass="form-control" placeholder="${search}" />
						<form:errors path="name" cssClass="error" />				
					</div>
					
					<div class="form-group">
					
						<spring:message code="media.type.track" text="track" var="track"/>
						<label class="radio-inline"><form:radiobutton path="type" value="track" checked="checked"/>${track}</label>
						
						<spring:message code="media.type.album" text="album" var="album"/>
						<label class="radio-inline"><form:radiobutton path="type" value="album"/>${album}</label>
						
					</div>
					
					<div>
						<spring:message code="media.search" text="Media search..." var="media_search"/>
						<input class="btn btn-success" type="submit" value="${media_search}">
					</div>

				</form:form>
            
          </div>

          <div class="mastfoot">
            <div class="inner">
              <p> &copy; 2017, media search</p>
            </div>
          </div>

        </div>

      </div>

    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>

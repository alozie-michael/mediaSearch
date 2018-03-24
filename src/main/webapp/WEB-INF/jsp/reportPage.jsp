<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Media Search Report</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!--     Datatable css -->
<link href="css/jquery.dataTables.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/cover.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

</head>

<body>

	<div class="site-wrapper">

		<div class="site-wrapper-inner">

			<div class="cover-container">

				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">media search</h3>
					</div>
				</div>


				<br /> <br />

				<div class="inner cover">
					<h1 class="cover-heading">search result for: ${searchItem}</h1>
				</div>
				
					<table id="reportTable" class="display">
						<thead>
							<tr>
								<th>album cover</th>
								<th>artist name</th>
								<th>album name</th>
							</tr>
						</thead>

						<c:forEach items="${mediaResults}" var="mediaResults">

							<tbody>
								<tr>
									<td><img alt="album image" src="${mediaResults.images}"></td>
									<td>${mediaResults.albumName}</td>
									<td>${mediaResults.artistName}</td>
								</tr>
							</tbody>

						</c:forEach>
					</table>

					<br /> <br />

					<div>
						<br /> <a class="btn btn-success" href="searchMedia.html">search
							again</a>
					</div>

				</div>

				<div class="mastfoot">
					<div class="inner">
						<p>&copy; 2017, media search</p>
					</div>
				</div>

		</div>

	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<!-- 	Datatable jquery -->
	<script
		src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>

	<!--     Datatable initialization -->
	<script type="text/javascript">
		$(document).ready(function() {
			$('#reportTable').DataTable();
		});
	</script>
	<script src="js/bootstrap.min.js"></script>

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!-- 	<script src="js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>
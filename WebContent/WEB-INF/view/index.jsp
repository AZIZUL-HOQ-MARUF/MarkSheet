<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index of Computer Technology</title>



<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/static/img/college_8JC_icon.ico" />
<!-- Bootstrap -->
<link href="<c:url value="/static/css/bootstrap.min.css " />"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<c:url value="/static/css/index_styling.css" />">
<link href='https://fonts.googleapis.com/css?family=Arvo'
	rel='stylesheet' type='text/css'>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"
	rel="stylesheet">


<!-- Animate css -->

<link rel="stylesheet" href="<c:url value="/static/css/animate.css" />">

<style type="text/css">
</style>


<!-- links -->
<c:url var="about" value="/about"></c:url>
<c:url var="add" value="/add"></c:url>
<c:url var="list" value="/list"></c:url>
<c:url var="home" value="/"></c:url>
<c:url var="login" value="/admin/login"></c:url>
</head>
<body
	background="${pageContext.request.contextPath}/static/img/Website-Design-Background.png">
	<!--Create Nav bar-->
	<nav role="navigation" class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<!--  <a class="navbar-brand" href="#"><img src="images/weblogo.png" 
				class="logo"></a>
				-->
			<button type="button" class="navbar-toggle"
				data-target="#navbarCollapse" data-toggle="collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse" id="navbarCollapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${home }"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="${list}">Student List</a></li>
				<li><a href="${add }">ADD</a></li>
				<!-- <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu" style="background: rgba(0, 0, 0, 0.5);">
						<li id="ss"><a href="#">Page 1-1</a></li>
						<li id="ss"><a href="#">Page 1-2</a></li>
						<li id="ss"><a href="#">Page 1-3</a></li>
					</ul></li> -->
				<li><a href="${about }" target="_blank"><span
						class="glyphicon glyphicon-envelope"></span> About Us</a></li>
			</ul>
			<%-- <ul class="nav navbar-nav navbar-right">
				<li><a href="${login}" class="lgn"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul> --%>
		</div>
	</div>
	</nav>

	<!--Create header-->
	<div class="jumbotron">
		<div class="container">
			<h3 class="txt animated rollIn">
				Welcome to <strong>Feni Polytechnic Institute !</strong>
			</h3>
		</div>
	</div>

	<!--Create icons with text-->
	<div class="icons">
		<div class="container">
			<div class="row">
				<!-- <div class="col-md-4">
					<img src="images/money.png" class="bodyimage">
					<h2>Price it</h2>
					<p>Get in touch for an immediate no obligation quote!</p>
				</div> -->
				<!-- <div class="col-md-4">
					<img src="images/plan.png" class="bodyimage">
					<h2>Plan it</h2>
					<p>We will agree on a deadline and commit to it.</p>
				</div> -->
				<!-- <div class="col-md-4">
					<img src="images/finish.png" class="bodyimage">
					<h2>Make it</h2>
					<p>We will deliver your website on time with the best quality.</p>
				</div> -->
				<div class="col-md-4">
					<!-- 
					<img src="images/finish.png" class="bodyimage">
					<h2>Make it</h2>
					<p>We will deliver your website on time with the best quality.</p> -->
					<!-- <br> <br> <br> <br> -->
				</div>
			</div>
		</div>
	</div>
	<!--Create contact button-->
	<div class="contact">
		<div class="container">
			<a href="${list}" class="btn animated lightSpeedIn">Get in</a>
		</div>
	</div>


	<!--Create Footer-->
	<div class="footer" style="margin-top: 340px;">
		<div class="container">
			<p class="p animated slideInRight">
				&copy; Developed by <strong>Azizul</strong> Hoque.
			</p>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="<c:url value="/static/js/bootstrap.min.js" />" /></script>

</body>
</html>
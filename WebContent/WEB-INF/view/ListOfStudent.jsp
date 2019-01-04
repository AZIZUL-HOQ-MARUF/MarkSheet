<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Students</title>



<script type="text/javascript" src="/static/js/jquery.min.js"></script>
<!-- 
<script type="text/javascript" src="/static/cssjsold/jquery.dataTables.min.js"></script> -->

<script src="<c:url value="/static/js/bootstrap.min.js" />" /></script>

<script src="<c:url value="/static/cssjsold/jquery-1.7.1.min.js" />" /></script>


<style type="text/css">
.table {
	padding-left: 20px;
	padding-right: 20px;
}

.btnn {
	background-color: rgb(49, 176, 213);
	border: none;
	color: #fff;
	font-size: 34px;
	border-bottom-right-radius: 8px;
	border-top-right-radius: 8px;
}

.btnn:hover {
	background-color: rgb(40, 96, 144);
	color: #fff;
	border: none;
}
</style>


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
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css" />
<link rel="stylesheet" href="<c:url value="/static/css/animate.css" />">

<!-- links -->
<c:url var="add" value="/add"></c:url>
<c:url var="about" value="/about"></c:url>
<c:url var="list" value="/list"></c:url>
<c:url var="home" value="/"></c:url>
<c:url var="show" value="/show"></c:url>
<c:url var="report" value="/report/studentReport"></c:url>


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
				<li><a href="${home }"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li class="active"><a href="${list}" class="stu ">Student
						List</a></li>
				<li><a href="${add }">ADD</a></li>
				<!-- <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu" style="background: rgba(0, 0, 0, 0.5);">
						<li id="ss"><a href="#">Page 1-1</a></li>
						<li id="ss"><a href="#">Page 1-2</a></li>
						<li id="ss"><a href="#">Page 1-3</a></li>
					</ul></li> -->
				<li><a href="${about}" target="_blank"><span
						class="glyphicon glyphicon-envelope"></span> About Us</a></li>

			</ul>
			<!-- <ul class="nav navbar-right">

				<li></li>
			</ul> -->
			<div class="col-sm-3 col-md-3 pull-right">
				<form:form class="navbar-form" role="search" action="${show }"
					modelAttribute="College" method="GET">
					<div class="input-group" style="margin-top: 10px;">
						<form:input path="name" class="form-control"
							placeholder="Student Name / Roll" id="srch-term" />
						<div class="input-group-btn">
							<button class="btnn btnn-info" type="submit">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</div>
					</div>
				</form:form>
			</div>

		</div>
	</div>
	</nav>


	<!--Create header-->
	<%-- 	<div class="jumbotron">
		<!-- <div class="container">
			<h3>
				Welcome to <strong>Computer Technology</strong> Website !
			</h3>
		</div> -->

		<form:form action="${report}" modelAttribute="College" method="GET">
			<form:input path="reportId" class="form-control" id="report"
				placeholder="ID" />
			<input type="submit" class="btnn btnn-info" name="submit"
				value="View Report"
				style="color: white; margin-top: 3px; height: 35px; font-size: 24px; border-bottom-left-radius: 8px; border-top-left-radius: 8px;">
		</form:form>
	</div> --%>


	<!-- Main body -->
	<!-- <section class="content">
	<div class="box box-primary">
		<div class="box-header"></div>

		<div class="box-body no-padding"> -->
	<div class="table">
		<%-- <table class="table table-hover">
			<thead style="background-color: #1BBDD6">
				<tr>
					<th class="hed">ID</th>
					<th class="hed">NAME</th>
					<th class="hed">Department</th>
					<th class="hed">Session</th>
					<th class="hed">Ins.Roll</th>
					<th class="hed">Board Roll</th>
					<th class="hed">Father Name</th>
					<th class="hed">Mother Name</th>
					<th class="hed">Height</th>
					<th class="hed">Weight</th>
					<th class="hed">Blood Group</th>
					<th class="hed">Spcl. Mark</th>
					<th class="hed">Address</th>
					<th class="hed">Phone</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listOfStu}" var="stu">
					<tr>
						<td><c:out value="${stu.id }"></c:out></td>
						
								<td><c:out value="${ stu.specialMark}"></c:out></td>
						<td><c:out value="${stu.name }"></c:out></td>
						
									<td><a href="<c:url value='/emp/show/${emp.ID}' />"
										class="btn btn-outline-success" role="button">Show</a></td>
									<td><a href="<c:url value='/emp/edit/${emp.ID}' />"
										class="btn btn-outline-warning" role="button">Edit</a></td>
									<td><a href="<c:url value='/emp/delete/${emp.ID}' />"
										class="btn btn-outline-danger" role="button">Delete</a></td>


						<td><c:out value="${stu.dept }"></c:out></td>
						<td><c:out value="${stu.session }"></c:out></td>
						<td><c:out value="${stu.insRoll }"></c:out></td>
						<td><c:out value="${stu.boardRoll }"></c:out></td>
						<td><c:out value="${stu.fatherName }"></c:out></td>
						<td><c:out value="${stu.motherName }"></c:out></td>
						<td><c:out value="${stu.height }"></c:out></td>
						<td><c:out value="${stu.weight }"></c:out></td>
						<td><c:out value="${stu.bloodGroup }"></c:out></td>
						<td><c:out value="${stu.specialMark }"></c:out></td>
						<td><c:out value="${stu.address }"></c:out></td>
						<td><c:out value="${stu.phone }"></c:out></td>
					</tr>


				</c:forEach>
			</tbody>



		</table> --%>
		<div class="tbl" style="overflow: scroll;">

			<spring:url value="/list" var="listOfStudent" />
			<display:table name="list" requestURI="${listOfStudent }"
				id="student" pagesize="10">

				<display:column title="View" sortable="true">
					<a
						href="<c:out value="${pageContext.request.contextPath}/report/studentReport/${student.id}"/>"
						target="_blank"><i class="glyphicon glyphicon-eye-open">${student.id}</i>
					</a>


				</display:column>
				<display:column title="Edit" sortable="true">
					<a
						href="<c:out value="${pageContext.request.contextPath}/edit/${student.id}"/>">${student.id}
					</a>

				</display:column>
				<display:column title="Delete" sortable="true">
					<a
						href="<c:out value="${pageContext.request.contextPath}/delete/${student.id}"/>">${student.id}
					</a>

				</display:column>
				<display:column property="examName" title="Exam Name"
					sortable="true"></display:column>
				<display:column property="examDate" title="Exam Date"
					sortable="true"></display:column>
				<display:column property="id" title="ID" sortable="true"></display:column>
				<%-- <display:column property="serialNo" title="S.I" sortable="true"></display:column> --%>
				<display:column property="name" title="Name" sortable="true"></display:column>
				<display:column property="fatherName" title="FatherName"
					sortable="true"></display:column>
				<display:column property="motherName" title="MotherName"
					sortable="true"></display:column>
				<display:column property="roll" title="ROll" sortable="true"></display:column>
				<display:column property="reg" title="REG." sortable="true"></display:column>
				<display:column property="session" title="Session" sortable="true"></display:column>
				<!-- GPA -->
				<display:column property="grade" title="GPA" sortable="true"></display:column>
				<!--  -->
				<display:column property="subject_I" title="subject_I"
					sortable="true"></display:column>
				<display:column property="subject_I_GL" title="subject_I_GL"
					sortable="true"></display:column>
				<display:column property="subject_I_GP" title="subject_I_GP"
					sortable="true"></display:column>

				<display:column property="subject_II" title="subject_II"
					sortable="true"></display:column>
				<display:column property="subject_II_GL" title="subject_II_GL"
					sortable="true"></display:column>
				<display:column property="subject_II_GP" title="subject_II_GP"
					sortable="true"></display:column>

				<display:column property="subject_III" title="subject_III"
					sortable="true"></display:column>
				<display:column property="subject_III_GL" title="subject_III_GL"
					sortable="true"></display:column>
				<display:column property="subject_III_GP" title="subject_III_GP"
					sortable="true"></display:column>

				<display:column property="subject_IV" title="subject_IV"
					sortable="true"></display:column>
				<display:column property="subject_IV_GL" title="subject_IV_GL"
					sortable="true"></display:column>
				<display:column property="subject_IV_GP" title="subject_IV_GP"
					sortable="true"></display:column>

				<display:column property="subject_V" title="subject_V"
					sortable="true"></display:column>
				<display:column property="subject_V_GL" title="subject_V_GL"
					sortable="true"></display:column>
				<display:column property="subject_V_GP" title="subject_V_GP"
					sortable="true"></display:column>


				<display:column property="subject_VI" title="subject_VI"
					sortable="true"></display:column>
				<display:column property="subject_VI_GL" title="subject_VI_GL"
					sortable="true"></display:column>
				<display:column property="subject_VI_GP" title="subject_VI_GP"
					sortable="true"></display:column>

				<display:column property="subject_VII" title="subject_VII"
					sortable="true"></display:column>
				<display:column property="subject_VII_GL" title="subject_VII_GL"
					sortable="true"></display:column>
				<display:column property="subject_VII_GP" title="subject_VII_GP"
					sortable="true"></display:column>

				<display:column property="subject_VIII" title="subject_VIII"
					sortable="true"></display:column>
				<display:column property="subject_VIII_GL" title="subject_VIII_GL"
					sortable="true"></display:column>
				<display:column property="subject_VIII_GP" title="subject_VIII_GP"
					sortable="true"></display:column>

				<display:column property="subject_IX" title="subject_IX"
					sortable="true"></display:column>
				<display:column property="subject_IX_GL" title="subject_IX_GL"
					sortable="true"></display:column>
				<display:column property="subject_IX_GP" title="subject_IX_GP"
					sortable="true"></display:column>

				<display:column property="subject_X" title="subject_X"
					sortable="true"></display:column>
				<display:column property="subject_X_GL" title="subject_X_GL"
					sortable="true"></display:column>
				<display:column property="subject_X_GP" title="subject_X_GP"
					sortable="true"></display:column>

				<!-- Obtain marks -->
				<display:column property="subject_I_OB"
					title="subject_I Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_II_OB"
					title="subject_II Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_III_OB"
					title="subject_III Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_IV_OB"
					title="subject_IV Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_V_OB"
					title="subject_V Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_VI_OB"
					title="subject_VI Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_VII_OB"
					title="subject_VII Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_VIII_OB"
					title="subject_VIII Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_IX_OB"
					title="subject_IX Obtain_Marks" sortable="true"></display:column>
				<display:column property="subject_X_OB"
					title="subject_X Obtain_Marks" sortable="true"></display:column>

			</display:table>
		</div>


	</div>

	<!-- </div>
	</div>

	</section> -->
	<!--  -->


	<!--Create icons with text-->
	<!-- <div class="icons">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<img src="images/money.png" class="bodyimage">
					<h2>Price it</h2>
					<p>Get in touch for an immediate no obligation quote!</p>
				</div>
				<div class="col-md-4">
					<img src="images/plan.png" class="bodyimage">
					<h2>Plan it</h2>
					<p>We will agree on a deadline and commit to it.</p>
				</div>
				<div class="col-md-4">
					<img src="images/finish.png" class="bodyimage">
					<h2>Make it</h2>
					<p>We will deliver your website on time with the best quality.</p>
				</div>
				<div class="col-md-4">
					
					<img src="images/finish.png" class="bodyimage">
					<h2>Make it</h2>
					<p>We will deliver your website on time with the best quality.</p>
					
				</div>
			</div>
		</div>
	</div> -->

	<!--Create contact button-->
	<%-- <div class="contact">
		<div class="container">
			<a href="${list}" class="btn">Get in</a>
		</div>
	</div> --%>
	<!--Create Footer-->
	<div class="footer" style="margin-bottom: 30px;">
		<div class="container">
			<p class="p animated slideInRight">
				&copy; Developed by <strong>Azizul</strong> Hoque.
			</p>
		</div>
	</div>



</body>
</html>



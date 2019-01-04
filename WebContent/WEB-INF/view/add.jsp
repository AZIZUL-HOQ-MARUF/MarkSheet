

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!-- Spript files-->



<script src="<c:url value="/static/js/jquery.dataTables.min.js" />" /></script>
<script src="<c:url value="/static/js/jquery.min.js" />" /></script>
<script src="<c:url value="/static/js/dataTables.bootstrap.min.js" />" /></script>

<script src="<c:url value="/static/js/bootstrap.min.js" />" /></script>

<script src="<c:url value="/static/js/jQuery-2.1.4.min.js" />" /></script>


<title>Add Information</title>


<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/static/img/college_8JC_icon.ico" />



<!-- css files -->
<link href="<c:url value="/static/css/dataTables.bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/static/css/bootstrap.min.css" />"
	rel="stylesheet">

<link href="<c:url value="/static/css/font-awesome.min.css" />"
	rel="stylesheet">

<!-- Animate css -->

<link rel="stylesheet" href="<c:url value="/static/css/animate.css" />">


<link rel="stylesheet"
	href="<c:url value="/static/css/index_styling.css" />">
<link href='https://fonts.googleapis.com/css?family=Arvo'
	rel='stylesheet' type='text/css'>

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"
	rel="stylesheet">





<c:url var="add" value="/add"></c:url>
<c:url var="save" value="/save"></c:url>
<c:url var="edit" value="/add"></c:url>
<c:url var="about" value="/about"></c:url>
<c:url var="index" value="/"></c:url>
<c:url var="list" value="/list"></c:url>
<!-- header content -->
<body
	background="${pageContext.request.contextPath}/static/img/Website-Design-Background.png">
	<div>
		<div class="content-wrapper">

			<!-- Main content -->
			<section class="content">
				<!-- nav bar -->
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
								<li><a href="${index }"><span
										class="glyphicon glyphicon-home"></span> Home</a></li>
								<li><a href="${list}">Student List</a></li>
								<li class="active"><a href="${add }">ADD</a></li>
								<!-- <li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
									<ul class="dropdown-menu "
										style="background: rgba(0, 0, 0, 0.5);">
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
				<!-- ends nav -->
				<div class="box box-primary">
					<div class="box-header"></div>

					<div class="box-body "
						style="padding-left: 40px; padding-right: 40px;">

						<form:form action="${save}" modelAttribute="College" method="post"
							enctype="multipart/form-data">

							<%-- Serial :<form:input path="serialNo" cssClass="col-xs-2" />
								<form:input path="serialNo" cssClass="col-xs-2" />
								 Exam Name :
								<form:input path="examName" cssClass="col-xs-4" />
								<br> Exam Starts On :
								<form:input path="examDate" cssClass="col-xs-4" />
								<br> --%>

							<div style="margin-bottom: 10px; width: 200px;"
								class="input-group">
								<span class="input-group-addon"><i>S.I. </i></span>
								<form:input path="serialNo" placeholder="66751"
									class="form-control" />

							</div>
							<div class="row">
								<div class="col-sm-2">
									<div style="margin-bottom: 10px; width: 200px;"
										class="input-group">
										<span class="input-group-addon"><i>Semester </i></span>
										<form:select path="semester" class="form-control">
											<form:option value="first"></form:option>
											<form:option value="second"></form:option>
											<form:option value="third"></form:option>
											<form:option value="fourth"></form:option>
											<form:option value="fifth"></form:option>

											<form:option value="sixth"></form:option>
											<form:option value="seventh"></form:option>
											<form:option value="eighth"></form:option>

										</form:select>

									</div>
								</div>

								<div class="col-sm-9">
									<div class="input-group" style="width: 150px;">
										<span style="font-size: 20px; color: white;">Reconciled
											? </span>
										<form:checkbox path="type" value="RECONCILED" />
									</div>
								</div>
							</div>


							<div style="margin-bottom: 10px; width: 380px;"
								class="input-group">
								<span class="input-group-addon"><i>Exam Starts On </i></span>
								<form:input path="examDate" placeholder="June - July"
									class="form-control" />
							</div>
							<div class="row">
								<div class="col-sm-4">
									<div style="margin-bottom: 10px; width: 380px;"
										class="input-group">
										<span class="input-group-addon"><i>Exam Name </i></span>
										<%-- <form:input path="examName"
									placeholder="SIXTH SEMESTER EXAMINATION, 2017"
									class="form-control" /> --%>
										<form:select path="examName" class="form-control">
											<form:option value="FIRST SEMESTER EXAMINATION"></form:option>
											<form:option value="SECOND SEMESTER EXAMINATION"></form:option>
											<form:option value="THIRD SEMESTER EXAMINATION"></form:option>
											<form:option value="FOURTH SEMESTER EXAMINATION"></form:option>
											<form:option value="FIFTH SEMESTER EXAMINATION"></form:option>
											<form:option value="SIXTH SEMESTER EXAMINATION"></form:option>
											<form:option value="SEVENTH SEMESTER EXAMINATION"></form:option>
											<form:option value="EIGHTH SEMESTER EXAMINATION"></form:option>

										</form:select>
									</div>
								</div>
								<div class="col-sm-9.1">
									<div class="input-group" style="width: 150px;">
										<span class="input-group-addon"><i>Year </i></span>
										<form:select path="year" class="form-control">
											<form:option value=" 2000"></form:option>
											<form:option value="2001"></form:option>
											<form:option value="2002"></form:option>
											<form:option value="2003"></form:option>
											<form:option value="2004"></form:option>
											<form:option value="2005"></form:option>
											<form:option value="2006"></form:option>
											<form:option value="2007"></form:option>
											<form:option value="2008"></form:option>
											<form:option value="2009"></form:option>
											<form:option value="2010"></form:option>
											<form:option value="2011"></form:option>
											<form:option value="2012"></form:option>
											<form:option value="2013"></form:option>
											<form:option value="2014"></form:option>
											<form:option value="2015"></form:option>
											<form:option value="2016"></form:option>
											<form:option value="2017"></form:option>
											<form:option value="2018" selected="true"></form:option>
											<form:option value="2019"></form:option>
											<form:option value="2020"></form:option>
											<form:option value="2021"></form:option>
											<form:option value="2022"></form:option>
											<form:option value="2023"></form:option>
											<form:option value="2024"></form:option>
											<form:option value="2025"></form:option>
											<form:option value="2026"></form:option>
											<form:option value="2027"></form:option>
											<form:option value="2028"></form:option>
											<form:option value="2029"></form:option>
											<form:option value="2030"></form:option>

											<form:option value="2031"></form:option>
											<form:option value="2032"></form:option>
											<form:option value="2033"></form:option>
											<form:option value="2034"></form:option>
											<form:option value="2035"></form:option>
											<form:option value="2036"></form:option>

										</form:select>
									</div>
								</div>
							</div>
							<div style="margin-bottom: 10px; width: 380px;"
								class="input-group">
								<span class="input-group-addon"><i>Department </i></span>
								<form:select path="faculty" class="form-control">
									<form:option value="66 - Computer Technology"></form:option>
									<form:option value="64 - Civil Technology"></form:option>
									<form:option value="67 - Electrical Technology"></form:option>
									<form:option value="70 - Mechanical Technology"></form:option>
									<form:option value="71 - Power Technology"></form:option>

									<form:option
										value="61 - Architecture and Interior Design Technology"></form:option>

								</form:select>
							</div>
					</div>



					<div class="table" style="padding-left: 15px; padding-right: 15px;">
						<table class="table table-hover" style="border-radius: 15px;">
							<thead></thead>

							<tbody>



								<tr>
									<td>Name</td>
									<td><form:input path="name" /></td>
									<td><form:errors path="name" cssClass="error" /></td>
								</tr>

								<tr>
									<td class="col-sm-2">Father's Name</td>
									<td class="col-sm-5"><form:input path="fatherName"
											width="60px" /></td>
									<td class="col-sm-5"><form:errors path="fatherName"
											cssClass="error" /></td>
								</tr>

								<tr>
									<td>Mother's Name</td>
									<td><form:input path="motherName" /></td>
									<td><form:errors path="motherName" cssClass="error" /></td>
								</tr>

								<tr>
									<td>Roll No</td>
									<td><form:input path="roll" /></td>
									<td><form:errors path="roll" cssClass="error" /></td>
								</tr>

								<tr>
									<td>Registration</td>
									<td><form:input path="reg" /></td>
									<td><form:errors path="reg" cssClass="error" /></td>
								</tr>

								<tr>
									<td>Session</td>
									<td><form:input path="session" /></td>
									<td><form:errors path="session" cssClass="error" /></td>
								</tr>
							</tbody>
						</table>

						<!-- <div class="panel panel-primary">
									<div class="panel-heading">Subjects</div>
									
								</div> -->

						<table class="table table-hover" style="border-radius: 15px;">
							<thead>
								<tr class="row">
									<th class="col-sm-3">Subjects</th>
									<th class="col-sm-3">Subject Name</th>
									<th class="col-sm-3">Subject Code</th>
									<th class="col-sm-3">Credit Hour</th>
									<th class="col-sm-3">Full Marks</th>
									<th class="col-sm-3">Marks Obtained</th>

								</tr>

							</thead>

							<tbody>
								<tr class="row">
									<td class="col-sm-3">Subject-I</td>
									<td class="col-sm-3"><form:input path="subject_I" /></td>

									<td class="col-sm-2"><form:input path="subject_I_SC" /></td>

									<td class="col-sm-2"><form:input path="subject_I_CH" /></td>

									<td class="col-sm-2"><form:input path="subject_I_FM" /></td>

									<td class="col-sm-2"><form:input path="subject_I_OB" /></td>
									<%-- 
									<td class="col-sm-2"><form:input path="subject_I_GP" /></td> --%>

								</tr>

								<tr class="row">
									<td class="col-sm-3">Subject-II</td>
									<td class="col-sm-3"><form:input path="subject_II" /></td>

									<td class="col-sm-2"><form:input path="subject_II_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_II_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_II_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_II_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_II_GP" /></td> --%>
								</tr>

								<tr class="row">
									<td class="col-sm-3">Subject-III</td>
									<td class="col-sm-3"><form:input path="subject_III" /></td>

									<td class="col-sm-2"><form:input path="subject_III_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_III_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_III_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_III_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_III_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-IV</td>
									<td class="col-sm-3"><form:input path="subject_IV" /></td>

									<td class="col-sm-2"><form:input path="subject_IV_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_IV_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_IV_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_IV_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_IV_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-V</td>
									<td class="col-sm-3"><form:input path="subject_V" /></td>

									<td class="col-sm-2"><form:input path="subject_V_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_V_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_V_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_V_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_V_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-VI</td>
									<td class="col-sm-3"><form:input path="subject_VI" /></td>

									<td class="col-sm-2"><form:input path="subject_VI_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_VI_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_VI_FM" /></td>

									<td class="col-sm-3"><form:input path="subject_VI_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_VI_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-VII</td>
									<td class="col-sm-3"><form:input path="subject_VII" /></td>

									<td class="col-sm-2"><form:input path="subject_VII_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_VII_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_VII_FM" /></td>

									<td class="col-sm-3"><form:input path="subject_VII_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_VII_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-VIII</td>
									<td class="col-sm-3"><form:input path="subject_VIII" /></td>

									<td class="col-sm-2"><form:input path="subject_VIII_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_VIII_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_VIII_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_VIII_OB" /></td>
									<%-- 
									<!-- <td>Grade Point</td> -->
									<td class="col-sm-3"><form:input path="subject_VIII_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-IX</td>
									<td class="col-sm-3"><form:input path="subject_IX" /></td>

									<td class="col-sm-2"><form:input path="subject_IX_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_IX_CH" /></td>
									<!-- <td class="col-sm-3">Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_IX_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_IX_OB" /></td>
									<!-- <td class="col-sm-3">Grade Point</td> -->
									<%-- 
									<td class="col-sm-3"><form:input path="subject_IX_GP" /></td> --%>
								</tr>
								<tr class="row">
									<td class="col-sm-3">Subject-X</td>
									<td class="col-sm-3"><form:input path="subject_X" /></td>

									<td class="col-sm-2"><form:input path="subject_X_SC" /></td>
									<td class="col-sm-3"><form:input path="subject_X_CH" /></td>
									<!-- <td>Grade Letter</td> -->
									<td class="col-sm-2"><form:input path="subject_X_FM" /></td>
									<td class="col-sm-3"><form:input path="subject_X_OB" /></td>
									<!-- <td>Grade Point</td> -->
									<%-- 
									<td class="col-sm-3"><form:input path="subject_X_GP" /></td> --%>
								</tr>
								<%-- <tr class="row">
									<td class="col-sm-3">Total Grade</td>
									<td class="col-sm-3"><form:input path="grade" /></td>
								</tr> --%>

								<tr class="row">
									<td colspan="5" align="center" class="col-sm-3"><input
										type="submit" value="Submit" /></td>
								</tr>
							</tbody>
						</table>
					</div>
					</form:form>

				</div>
		</div>


		</section>

	</div>
	</div>
	<!--Create Footer-->
	<div class="footer" style="margin-bottom: 30px;">
		<div class="container">
			<p class="p animated slideInRight">
				&copy; Developed by <strong>Azizul</strong> Hoque.
			</p>
		</div>
	</div>
</body>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="generator" content="Mobirise v4.7.6, mobirise.com">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Us</title>
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/static/img/college_8JC_icon.ico" />

<link href="https://fonts.googleapis.com/css?family=Raleway:200,100,400"
	rel="stylesheet" type="text/css" />


<!-- Bootstrap -->
<link href="<c:url value="/static/css/bootstrap.min.css " />"
	rel="stylesheet">

<link href="<c:url value="/static/css/font-awesome.min.css " />"
	rel="stylesheet">
<link href="<c:url value="/static/css/bootstrap-reboot.min.css " />"
	rel="stylesheet">
<link href="<c:url value="/static/css/tether.min.css " />"
	rel="stylesheet">
<link rel="stylesheet"
	href="<c:url value="/static/css/index_styling.css" />">
<link href="<c:url value="/static/css/mbr-additional.css" />"
	rel="stylesheet">
<link href="<c:url value="/static/css/mobirise-icons.css " />"
	rel="stylesheet">
<link href="<c:url value="/static/css/style.css " />" rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href='https://fonts.googleapis.com/css?family=Arvo'
	rel='stylesheet' type='text/css'>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"
	rel="stylesheet">


<!-- Animate css -->

<link rel="stylesheet" href="<c:url value="/static/css/animate.css" />">

<!-- links -->
<c:url var="add" value="/add"></c:url>
<c:url var="list" value="/list"></c:url>
<c:url var="about" value="/about"></c:url>
<c:url var="home" value="/"></c:url>
<c:url var="login" value="/admin/login"></c:url>

<style type="text/css">
html, body {
	font-family: 'Raleway', sans-serif;
	font-size: 18px;
	/* background: #222; */
	color: white;
}

h1, h2 {
	font-weight: 200;
	margin: 0.4em 0;
}

h1 {
	font-size: 3.5em;
}

h2 {
	color: #888;
	font-size: 2em;
}

.social:hover {
	-webkit-transform: scale(1.1);
	-moz-transform: scale(1.1);
	-o-transform: scale(1.1);
}

.social {
	-webkit-transform: scale(0.8);
	/* Browser Variations: */
	-moz-transform: scale(0.8);
	-o-transform: scale(0.8);
	-webkit-transition-duration: 0.5s;
	-moz-transition-duration: 0.5s;
	-o-transition-duration: 0.5s;
}

/*
    Multicoloured Hover Variations
*/
#social-fb:hover {
	color: #3B5998;
}

#social-tw:hover {
	color: #4099FF;
}

#social-gp:hover {
	color: #d34836;
}

#social-em:hover {
	color: #f39c12;
}
</style>
<script type="text/javascript">
	var TxtRotate = function(el, toRotate, period) {
		this.toRotate = toRotate;
		this.el = el;
		this.loopNum = 0;
		this.period = parseInt(period, 10) || 2000;
		this.txt = '';
		this.tick();
		this.isDeleting = false;
	};

	TxtRotate.prototype.tick = function() {
		var i = this.loopNum % this.toRotate.length;
		var fullTxt = this.toRotate[i];

		if (this.isDeleting) {
			this.txt = fullTxt.substring(0, this.txt.length - 1);
		} else {
			this.txt = fullTxt.substring(0, this.txt.length + 1);
		}

		this.el.innerHTML = '<span class="wrap">' + this.txt + '</span>';

		var that = this;
		var delta = 300 - Math.random() * 100;

		if (this.isDeleting) {
			delta /= 2;
		}

		if (!this.isDeleting && this.txt === fullTxt) {
			delta = this.period;
			this.isDeleting = true;
		} else if (this.isDeleting && this.txt === '') {
			this.isDeleting = false;
			this.loopNum++;
			delta = 500;
		}

		setTimeout(function() {
			that.tick();
		}, delta);
	};

	window.onload = function() {
		var elements = document.getElementsByClassName('txt-rotate');
		for (var i = 0; i < elements.length; i++) {
			var toRotate = elements[i].getAttribute('data-rotate');
			var period = elements[i].getAttribute('data-period');
			if (toRotate) {
				new TxtRotate(elements[i], JSON.parse(toRotate), period);
			}
		}
		// INJECT CSS
		var css = document.createElement("style");
		css.type = "text/css";
		css.innerHTML = ".txt-rotate > .wrap { border-right: 0.08em solid #666 }";
		document.body.appendChild(css);
	};
</script>
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
				<li><a href="${list}">Student List</a></li>
				<li><a href="${add }">ADD</a></li>
				<!-- <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu" style="background: rgba(0, 0, 0, 0.5);">
						<li id="ss"><a href="#">Page 1-1</a></li>
						<li id="ss"><a href="#">Page 1-2</a></li>
						<li id="ss"><a href="#">Page 1-3</a></li>
					</ul></li> -->
				<li class="active"><a href="${about }"><span
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
			<h1 class="txt">

				WE <span class="txt-rotate" data-period="2000"
					data-rotate='[ "ARE CREATIVE !", "MAKE WEBSITE !", "CREATE BRAND !"]'></span>
			</h1>
		</div>
	</div>

	<!--Create icons with text-->
	<!-- <div class="icons">
		<div class="container">
			<div class="row"> -->
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
	<!-- <div class="col-md-4"> -->
	<!-- 
					<img src="images/finish.png" class="bodyimage">
					<h2>Make it</h2>
					<p>We will deliver your website on time with the best quality.</p> -->
	<!-- <br> <br> <br> <br> -->
	<!-- </div> -->
	<!-- 	</div>
		</div>
	</div> -->
	<!--Create contact button-->




	<div class="container">
		<div class="media-container-row">

			<div class="card  col-12 col-md-6 col-lg-4">
				<div class="card-img">
					<span class="mbri-desktop mbr-iconfont" style="font-size: 70px;"></span>
				</div>
				<div class="card-box align-center">
					<h4 class="card-title mbr-fonts-style display-7">
						Unlimited Sites <br> <br>
					</h4>
					<p class="mbr-text mbr-fonts-style display-7">We will give you
						the freedom to choose websites as you like you want and we
						&nbsp;will create the websites, just like you want.</p>

				</div>
			</div>

			<div class="card  col-12 col-md-6 col-lg-4">
				<div class="card-img">
					<span class="mbri-touch mbr-iconfont" style="font-size: 70px;"></span>
				</div>
				<div class="card-box align-center">
					<h4 class="card-title mbr-fonts-style display-7">
						Mobile Friendly<br> <br>
					</h4>
					<p class="mbr-text mbr-fonts-style display-7">All our sites are
						mobile-friendly. You don't have to think about a special mobile
						version of your site.We offer many site blocks in several themes.
						they are flexible and responsive.</p>

				</div>
			</div>

			<div class="card  col-12 col-md-6 col-lg-4">
				<div class="card-img">
					<span class="mbr-iconfont mbri-code" style="font-size: 70px;"></span>
				</div>
				<div class="card-box align-center">
					<h4 class="card-title mbr-fonts-style display-7">
						Fast &amp; Comprehensive Development<br>
					</h4>
					<p class="mbr-text mbr-fonts-style display-7">We have creative
						and talented web developer. &#34;We love what we do and we do what
						our clients love &amp; work with great clients all over the world
						to create thoughtful and purposeful websites&#34;.</p>

				</div>
			</div>


		</div>
	</div>


	<!-- About developers -->

	<div class="container align-center" style="margin-top: 50px;">
		<h2 class="pb-3 mbr-fonts-style mbr-section-title display-2"
			style="color: white;">OUR AWESOME TEAM</h2>
		<h3
			class="pb-5 mbr-section-subtitle mbr-fonts-style mbr-light display-5">&nbsp;</h3>
		<div class="row media-row">

			<div class="team-item col-lg-3 col-md-6">
				<div class="item-image">
					<img src="<c:url value="/static/img/maruf.JPG"/>" alt="Azizul Hoq"
						title="" height="200" width="200" style="border-radius: 15px;">
				</div>
				<div class="item-caption py-3">
					<div class="item-name px-2">
						<p class="mbr-fonts-style display-5">Azizul Hoq</p>
					</div>
					<div class="item-role px-2">
						<p>
							Developer <br> <a
								href="https://www.facebook.com/azizul.maruff"
								style="font-size: 15px;" target="_blank"><i id="social-fb"
								class="fa fa-facebook-square fa-3x social"></i></a> <a
								href="mailto:azizulmaruf@gmail.com" style="font-size: 15px;"><i
								id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
						</p>

					</div>
				</div>
			</div>
			<div class="team-item col-lg-3 col-md-6">
				<div class="item-image">
					<img src="<c:url value="/static/img/juwel.jpg"/>" alt="" title=""
						height="200" width="200" style="border-radius: 15px;">
				</div>
				<div class="item-caption py-3">
					<div class="item-name px-2">
						<p class="mbr-fonts-style display-5">Juwel Hossain</p>
					</div>
					<div class="item-role px-2">
						<p>
							Developer <br> <a
								href="https://www.facebook.com/azizul.maruff"
								style="font-size: 15px;" target="_blank"><i id="social-fb"
								class="fa fa-facebook-square fa-3x social"></i></a> <a href="#"
								style="font-size: 15px;"><i id="social-em"
								class="fa fa-envelope-square fa-3x social"></i></a>
						</p>

					</div>

				</div>
			</div>
			<div class="team-item col-lg-3 col-md-6">
				<div class="item-image">
					<img src="<c:url value="/static/img/sabina.PNG"/>"
						alt="Sabina Akter" title="" height="200" width="200"
						style="border-radius: 15px;">
				</div>
				<div class="item-caption py-3">
					<div class="item-name px-2">
						<p class="mbr-fonts-style display-5">Sabina Akter</p>
					</div>
					<div class="item-role px-2">
						<p>
							Developer <br> <a href="https://www.facebook.com/nabisa.sf"
								style="font-size: 15px;" target="_blank"><i id="social-fb"
								class="fa fa-facebook-square fa-3x social"></i></a> <a href="#"
								style="font-size: 15px;"><i id="social-em"
								class="fa fa-envelope-square fa-3x social"></i></a>
						</p>

					</div>

				</div>
			</div>
			<div class="team-item col-lg-3 col-md-6">
				<div class="item-image">
					<img src="<c:url value="/static/img/minan.jpg"/>" alt="" title=""
						height="200" width="200" style="border-radius: 15px;">
				</div>
				<div class="item-caption py-3">
					<div class="item-name px-2">
						<p class="mbr-fonts-style display-5">Mizanur Rahman</p>
					</div>
					<div class="item-role px-2">
						<p>
							Designer <br> <a
								href="https://www.facebook.com/profile.php?id=100006936618589"
								style="font-size: 15px;" target="_blank"><i id="social-fb"
								class="fa fa-facebook-square fa-3x social"></i></a> <a
								href="mailto:mizanrony027@gmail.com" style="font-size: 15px;"><i
								id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
						</p>

					</div>
				</div>
			</div>
			<div class="team-item col-lg-12 col-md-6" style="margin-top: 10px;">
				<div class="item-image">
					<img src="<c:url value="/static/img/saiful.jpg"/>" alt="" title=""
						height="200" width="230" style="border-radius: 15px;">
				</div>
				<div class="item-caption py-3">
					<div class="item-name px-2">
						<p class="mbr-fonts-style display-5">Saiful Islam</p>
					</div>
					<div class="item-role px-2">
						<p>
							Designer <br> <a
								href="https://www.facebook.com/shifulislam.feni.9"
								style="font-size: 15px;" target="_blank"><i id="social-fb"
								class="fa fa-facebook-square fa-3x social"></i></a> <a href="#"
								style="font-size: 15px;"><i id="social-em"
								class="fa fa-envelope-square fa-3x social"></i></a>
						</p>

					</div>
				</div>
			</div>

		</div>
	</div>
	<%-- 

	<section class="engine"> <a
		href="<c:url value="https://mobirise.me/s"/>">bootstrap theme</a></section>
	<script src="<c:url value=" /static/js/jquery.min.js"/>" /></script>
	<script src="<c:url value=" /static/js/popper.min.js"/>" /></script>
	<script src="<c:url value=" /static/js/tether.min.js"/>" /></script>
	<script src="<c:url value=" /static/js/bootstrap.min.js"/>" /></script>
	<script src="<c:url value=" /static/js/smooth-scroll.js"/>" /></script>
	<script src="<c:url value=" /static/js/script.js"/>" /></script>
 --%>

	<!-- <br>
	<br>
	<br>
	<br>
	<br>
	<br> -->
	<!--Create Footer-->
	<div class="footer" style="margin-bottom: 30px;">
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Creative Colorlib Signup Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="/webjars/css/regpage.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Student SignUp Form</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="stuadd" method="get">
					<input class="text" type="text"  placeholder="Enter Your PRN" name="student_prn" required="">
					<label>PRN SHOULD BE (EG:341XX)</label>
					<input class="text email" type="text"  placeholder="Enter Your Name" name="student_name"required="">
					<input class="text" type="email"  placeholder="Enter Your Email" name="student_email"required="">
					<input class="text w3lpass" type="password"  placeholder="Confirm Password" name="student_password" required="">
					
				
					<input type="submit" value="SIGNUP">
				</form>
				
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>© CDAC-DAC-FEB-2020 BATCH NO-40</p>
		</div>
		<!-- //copyright -->
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->

</body>
</html>
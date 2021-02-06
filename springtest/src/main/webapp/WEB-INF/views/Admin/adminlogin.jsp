<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
 <link rel="stylesheet" href="/webjars/css/style.css"/>
     <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
</head>
<body class="text-center">
<img src="/webjars/img/1.jpg" />

<nav class="navbar navbar-inverse">
  			<div class="container">
  			<!-- the followin contains two types of div one for header and second for other links -->
  				<div class="navbar-header">
  					<a href="#" class="navbar-brand">Admin Profile</a>
  				</div>
  				<div>
  				<ul class="nav navbar-nav navbar-right">
  					<li><a href="#">Home</a></li>
  					<li><a href="login">Logout</a>
  				</ul>
  				</div>
  			</div>		
  		</nav>
  		<div class="container">
          </div>
     <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form class="form-signin" action="adminview">
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputEmail">Email address</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              <hr class="my-4">
             </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
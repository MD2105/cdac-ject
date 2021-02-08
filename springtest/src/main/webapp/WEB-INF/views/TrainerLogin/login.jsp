<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Trainer-Login</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/css/footer.css"/>
    <link  rel="stylesheet" href="/webjars/css/signin.css"/>
    <link  rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.css"/>
     <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width:10px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      
    </style> 
  </head>
  <body class="text-center">
   <h4>${requestScope.msgs}</h4>
    <form class="form-signin" action="login" method="post">
  <img class="mb-4" src="/webjars/img/cdac.jpg"  width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">Trainer Login</h1>
  <h5 style="color: red;">${requestScope.msg}</h5>
  <label for="inputEmail" class="sr-only">Email address</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="Username" name="faculty_email" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="faculty_password" required>
  <div class="checkbox mb-3">
  </div>
   <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy;CDAC_FEB</p>
</form>

<footer id="footer">
    <a href="/">Back to Home</a>
   <span style="padding:10px">@CDAC-DAC-FEB-2020 BATCH NO-40</span>
   </footer>
</body>
</html>

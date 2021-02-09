<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<!doctype html>
<html lang="en">
  <head>
  <title>Student-Login</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <link rel="stylesheet" href="/webjars/css/footer.css"/>
    <link  rel="stylesheet" href="/webjars/css/signin.css"/>
    <link  rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.css"/>

    <title>Login</title>
  </head>
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
  <h4>${requestScope.msgs}</h4>
  <body class="text-center">
    <form class="form-signin" action="login" method="post">
  <img class="mb-4" src="/webjars/img/cdac.jpg"  width="72" height="72">
  <h1 class="h3 mb-4 font-weight-normal">Student Login</h1>
  <h5 style="color: red;">${requestScope.msg}</h5>
  <label for="inputEmail" class="sr-only">Email address</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="Username" name="student_email" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="student_password" required>
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
<footer id="footer" >
    <a href="/">Back to Home</a>
   
   </footer>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/webjars/css/style.css"/>
        <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

    <title>Trainer Registration</title>
  </head>
  <body class="text-center">
  <img src="/webjars/img/1.jpg"/>
    <h1>Fill the Detail of Trainer</h1>
    <div class="container mt-5">
<form action="add" method="get">
 <div class="mb-3 text-center">
    <label for="idu" class="form-label">Enter Id</label>
    <input type="number" class="form-control mb-1" id="idu" name="faculty_id">
  </div>
  <div class="mb-3">
    <label for="user" class="form-label">Enter Name</label>
    <input type="text" class="form-control" id="user" name="faculty_name">
  </div>
  <div class="mb-3">
    <label for="sub" class="form-label">Enter Email</label>
    <input type="email" class="form-control" id="sub" name="faculty_email">
  </div>
  <div class="mb-3">
    <label for="Password" class="form-label">Enter Password</label>
    <input type="password" class="form-control" id="Password" name="faculty_password">
  </div>
  
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>
</div>
 
  </body>
</html>
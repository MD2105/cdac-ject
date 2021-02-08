<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" 
          href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link  rel="stylesheet" href="/webjars/css/navbar.css"/>
<meta charset="UTF-8">
<title>Admin</title>
</head>
</head>
<body class="text-center">
<div>
    <ul>
      
      <li><a href="/">Home</a></li>
       <li><a href="#">Admin Page</a></li>
      <li><a href="/studentfile/login">Student Login</a></li>
      <li><a href="/user/login">Trainer Login</a></li>
    </ul>
  </div>
<div id="page-container">
   <div id="content-wrap">
<img src="/webjars/img/1.jpg"/>
<br><br>
<span style="text-align:center;"> <h2>Admin</h2></span>
<div class="center" style="margin-top:40px;">
<h2>${requestScope.msg}</h2>
 <button type="button" ><a href="trainer-reg">Trainer Registration</a></button>
  <br><br>
  <button type="button"><a href="studreg">Student Registration</a></button>
  <button type="button"><a href="course">Course Registration</a></button>
      <br><br>
      
      </div>
    </div>
  </div>
   <footer id="footer">
   <span style="padding:10px">&copy;CDAC-DAC-FEB-2020 BATCH NO-40</span>
   </footer>
</body>
 
</html>



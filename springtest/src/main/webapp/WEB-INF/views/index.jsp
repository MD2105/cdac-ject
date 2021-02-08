<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
 <head>
 <title>Index</title>
        <link rel="stylesheet" href="/webjars/css/style.css"/>
        <link rel="stylesheet" href="/webjars/css/footer.css"/>
        <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    </head>
<body class="text-center">
<div id="page-container">
   <div id="content-wrap">
  <img src="/webjars/img/1.jpg" />
<fieldset style="padding:5px; text-align:center; margin:20px">
       <legend><h1>Choose Your Role</h1></legend>
  <button class="button button1"><a href="user/login">Trainer Login</a></button>
  <br><br>
  <button class="button button2"><a href="studentfile/login">Student Login</a></button>
  <br><br>
<button class="button button3"><a href="admin/adminview">Admin Login</a></button>
</fieldset>
  </div>
</div>
    <footer id="footer">
     <button style="float:left; margin-left:7px;" ><a href="other/Contact">Contact Us</a></button>
     <button ><a href="other/About">About Us</a></button>
      <span style="padding:10px">&copy;CDAC-DAC-FEB-2020 BATCH NO-40</span>
   </footer>
  </body>
</html>
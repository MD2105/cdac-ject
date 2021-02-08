<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course</title>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link  rel="stylesheet" href="/webjars/css/navbar.css"/>
</head>
<body>

<div>
    <ul>
      
      <li><a href="/">Home</a></li>
       <li><a href="/admin/adminview">Admin Page</a></li>
      <li><a href="/studentfile/login">Student Login</a></li>
      <li><a href="/user/login">Trainer Login</a></li>
    </ul>
  </div>
  <img src="/webjars/img/1.jpg" /><br><br>
<div class="container">
		<form action="course-add">
		 <div class="form-group">
    <label for="courseId">Course Name</label>
    <input type="text" class="form-control" id="courseId" name="courseId" required>
  </div>
  <div class="form-group">
    <label for="cname">Faculty Id</label>
    <input type="text" class="form-control" id="cname" name="cname" required>
  </div>
  <div class="form-group">
    <label for="cduration">Course Duration:</label>
    <input type="number" placeholder="how many hours?" class="form-control" id="cduration" name="cduration" required>
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
		</form>
		</div>
</body>
</html>
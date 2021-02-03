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
</head>
<body>
<div class="container">
		<form action="course-add">
		 <div class="form-group">
    <label for="courseId">Course Id:</label>
    <input type="text" class="form-control" id="courseId" name="courseId">
  </div>
  <div class="form-group">
    <label for="cname">Faculty Id</label>
    <input type="text" class="form-control" id="cname" name="cname">
  </div>
  <div class="form-group">
    <label for="cduration">Course Duration:</label>
    <input type="number" placeholder="how many hours?" class="form-control" id="cduration" name="cduration">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
		</form>
		</div>
</body>
</html>
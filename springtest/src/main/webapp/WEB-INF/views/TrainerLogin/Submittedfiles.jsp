<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Assignment</title>
<link rel="stylesheet" 
          href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</head>
<body>

<img src="/webjars/img/1.jpg"/><br><br>
<nav class="navbar navbar-inverse">
  			<div class="container">
  			
  				<div class="navbar-header">
  					<a href="#" class="navbar-brand">Trainer Profile</a>
  				</div>
  				<div>
  				<ul class="nav navbar-nav navbar-right">
  					<li><a href="/user/assingment?faculty_id=${fac.faculty_id}">Assignments</a></li>
  					<li><a href="/user/showfile?faculty_id=${fac.faculty_id}">Show Assignments</a></li>
  					<li><a href="/">Logout</a>
  				</ul>
  				</div>
  			</div>		
  		</nav>
<form id="file" action="showfiles">
                          <label>Choose Subject to display assignment for that subject</label>
                           <select name="course_id" id="file">
                          <c:forEach var="item" items="${c}">
                            <option value="${item.courseId}">${item.courseId}</option>
                            </c:forEach></td>
                        </select>
                        <td><input type="submit" value="submit"></input></td>
</form>
  <div class="container">
	  	<h5>Previously uploaded assignments of yours</h5>
 			<table class="table table-striped table-responsive table-bordered table-hover">
 					<thead>
 							<tr>
 								
 								<th>Student Roll</th>
 								<th>Subject</th>
 								<th>Assignment</th>
 								<th>Submitted Date</th>
 								<th>Grade</th>
 								<th>Submit</th>
  						   </tr>
					</thead>
					<tbody>
							<c:forEach var="item" items="${list}">
							
								<tr>
								    
									<td>${item.student_prn}</td>
									<td>${item.course_id}</td>
									<td><a href="/studentfile/download?id=${item.assignment_id}">${item.doc_name}</a></td>
									<td>${item.uploadtime}</td>
									<form action="grade">
									<td><input type="text" name="grade" required/>
									<td><input type="submit" name="Submit"/>
									<td><input type="hidden" value="${item.student_prn}"name="student_prn"/>
									<td><input type="hidden" value="${item.course_id}" name="course_id"/>
									</form>	
								</tr>
							</c:forEach>
					</tbody> 
 			</table>
 			</div>
</body>
</html>
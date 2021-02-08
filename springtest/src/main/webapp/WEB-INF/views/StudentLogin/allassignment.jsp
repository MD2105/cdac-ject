<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" 
          href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link  rel="stylesheet" href="/webjars/css/navbar.css"/>
<title>All Assignment</title>
</head>
<body>
<img src="/webjars/img/1.jpg"/>
 <div>
    <ul>
      <li><a class="active" href="/studentfile/revisit">Upload</a></li>
      <li><a href="/studentfile/showassi">Show Assignments</a></li>
       <li><a href="/studentfile/showfiles?student_prn=${sessionScope.Nm_prfl.getStudent_prn()}">Submitted Assignments</a></li>
      <li><a href="/studentfile/ingrade">Grades</a></li>
      <li style="float: right;"><a href="/">Logout</a></li>
    </ul>
  </div>
 <div class="container" id="alreadyUploadedAssignmentDetails">
	  	<h5>Previously uploaded assignments of yours</h5>
 			<table class="table table-striped table-responsive table-bordered table-hover">
 					<thead>
 							<tr>
 								<th>Sr.No</th>
 								<th>Course</th>
 								<th>Start Date</th>
 								<th>End Date</th>
 								<th>Assignment</th>
  						   </tr>
					</thead>
					<tbody>
							<c:forEach var="item" items="${list}">
							
								<tr>
									<td>${item.assignment_id}</td>
									<td>${item.course_id}</td>
									<td>${item.assignment_issued_date}</td>
									<td>${item.assignment_end_date}</td>
									<td><a href="/user/download?id=${item.assignment_id}">${item.doc_name}</a></td>
										
								</tr>
							</c:forEach>
					</tbody> 
 			</table>
 	</div>
</body>
</html>
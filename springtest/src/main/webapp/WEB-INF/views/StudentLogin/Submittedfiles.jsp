<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Assignments</title>
<link rel="stylesheet" 
          href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container" id="alreadyUploadedAssignmentDetails">
	  	<h5>Previously uploaded assignments of yours</h5>
 			<table class="table table-striped table-responsive table-bordered table-hover">
 					<thead>
 							<tr>
 								<th>Sr.No</th>
 								<th>Student Roll</th>
 								<th>Subject</th>
 								<th>Assignment</th>
 								<th>Submitted Date</th>
 								
  						   </tr>
					</thead>
					<tbody>
							<c:forEach var="item" items="${list}">
							
								<tr>
								    <td>${item.assignment_id}</td>
									<td>${item.student_prn}</td>
									<td>${item.course_id}</td>
									<td><a href="download?id=${item.assignment_id}">${item.doc_name}</a></td>
									<td>${item.uploadtime}</td>
									
										
								</tr>
							</c:forEach>
					</tbody> 
 			</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Trainer's Profile</title>
    
    <link rel="stylesheet" 
          href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link  rel="stylesheet" href="/webjars/css/profile.css"/>
    
  </head>
  <body>
 	<nav class="navbar navbar-inverse">
  			<div class="container">
  			<!-- the followin contains two types of div one for header and second for other links -->
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
  		
  <div class="text-center" style="margin-top:-18px;">
     <img src="/webjars/img/1.jpg"/>
  </div>
  <div>
  <div class="col-xs-6">
	
  </div>
  <div class="col-xs-6" style="margin-top:10px;">
  		<form action="notification" method="post">
  					<textarea placeholder="Add Notification here max 100 words">
  					</textarea>
  					<input type="submit" value="AddNotification"/> 					
  		</form>
  </div>
  </div>
  
  
	
 	<div class="container">
 	       <form action="upload" enctype="multipart/form-data" method="post" id="assiform">
				<table class="table table-bordered table-responsive">
					<thead>
					<tr>
					    <th>enter your id</th>
						<th>Choose a Subject</th>
						<th>Start Date</th>
						<th>End Date</th>
						<th>File </th>
						<th>Submit</th>
					</tr>
					</thead>
					<tbody>
					        <td><input type="text"  value ="${fac.faculty_id}" name="faculty_id"/></td>
					       <td> <label for="grade"></label>
					        
                          <select name="course_id" id="assiform">
                          <c:forEach var="item" items="${course}">
                            <option value="${item.courseId}">${item.courseId}</option>
                            </c:forEach></td>
                        </select>
                          
				             <td><input type="date" name="assignment_issued_date" required/></td>
								<td><input type="date" name="end_date" required/></td>
								<td><input type="file" name="assign_file" required/></td>  
								<td><input type="submit" value="submit"></input></td>
						       
					</tbody>
				</table> 	
			</form>
				<%--  <input type="submit" value="submit"></input> --%>	
 	</div>

 	
</body>
</html>
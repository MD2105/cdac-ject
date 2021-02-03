<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Obtained Grade</title>
<link  rel="stylesheet" href="/webjars/css/navbar.css"/>
</head>
<body>
<img src="/webjars/img/1.jpg"/>
  <div>
    <ul>
      <li><a class="active" href="#home">Upload</a></li>
      <li><a href="#news">Notification</a></li>
       <li><a href="/studentfile/showfiles?student_prn=${sessionScope.Nm_prfl.getStudent_prn()}">Submitted Assignments</a></li>
      <li><a href="/studentfile/ingrade">Grades</a></li>
      <li style="float: right;"><a href="/studentfile/logout">Logout</a></li>
    </ul>
  </div>
      <form action="obtaingrade" id="grade">
      <input type="hidden" id="grade" value="${sessionScope.Nm_prfl.getStudent_prn()}" name="student_prn"/>
      
         <label>Enter Your Subject Name:</label>
          <select name="course_id" id="grade">
                          <c:forEach var="item" items="${clist}">
                            <option value="${item.courseId}">${item.courseId}</option>
                            </c:forEach></td>
                        </select>
       <input type="submit" name="Submit"/>
      </form>
      <h2>${requestScope.msg}</h2>
</body>
</html>
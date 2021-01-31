<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Obtained Grade</title>
</head>
<body>
      <form action="obtaingrade" id="grade">
      <input type="hidden" id="grade" value="${sessionScope.Nm_prfl.getStudent_prn()}" name="student_prn"/>
      
         <label for="grade">Choose a Subject:</label>
   <select name="course_id" id="grade">
     <option value="Java">Java</option>
  <option value="DotNet">DotNet</option>
  <option value="Data">Data</option>
  <option value="C">C</option>
</select>
       <input type="submit" name="Submit"/>
      </form>
      <h2>${requestScope.msg}</h2>
</body>
</html>
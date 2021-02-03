<%@ page language="java" 
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html >
  <head>
  <title>Student-Profile</title>
    <!-- Required meta tags -->
    <!-- Bootstrap CSS -->
    <link  rel="stylesheet" href="/webjars/css/navbar.css"/>
    <link  rel="stylesheet" href="/webjars/css/profile.css"/>
    <link  rel="stylesheet" href="/webjars/css/footer.css"/>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    <link  rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.css"/>
     <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width:10px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
  </head>
  <body >
  <div class="text-center" >
  <img src="/webjars/img/1.jpg"/>
  </div>
    <div>
      <c:forEach  var="c" items="${list}">
        <div>
           <a href="download?id=${c.assignment_id}">${c.doc_name}</a> <br>
        </div>  
      </c:forEach>
  
     
  <div>
    <ul>
      <li><a class="active" href="#home">Upload</a></li>
      <li><a href="/studentfile/showassi">Show Assignments</a></li>
       <li><a href="/studentfile/showfiles?student_prn=${sessionScope.Nm_prfl.getStudent_prn()}">Submitted Assignments</a></li>
      <li><a href="/studentfile/ingrade">Grades</a></li>
      <li style="float: right;"><a href="/studentfile/logout">Logout</a></li>
    </ul>
  </div>
  
  <div class="profile">
    <h5 style="color:white;">Profile</h5> 
    <img class="mb-4" src="/webjars/img/profile.png"  width="72" height="72">
    <p style="color:pink;">PRN :${sessionScope.Nm_prfl.getStudent_prn()}</p>
    <p style="color:pink;">Name :${sessionScope.Nm_prfl.getStudent_name()}</p>
    <p style="color:pink;">Email :${sessionScope.Nm_prfl.getStudent_email()}</p>
   </div>  
   
  <div style="margin-top: 80px; margin-left:130px"> 
   <form enctype="multipart/form-data" action="upload" method="post" id="docform">
      <label>Enter Your PRN :</label>
       <input type="text"  value="${sessionScope.Nm_prfl.getStudent_prn()}" name="student_prn"/><br><br>
       <label>Enter Your Subject Name:</label>
          <select name="course_id" id="docform">
                          <c:forEach var="item" items="${clist}">
                            <option value="${item.courseId}">${item.courseId}</option>
                            </c:forEach></td>
                        </select>
            <label>File Name Should be Your PRN and Should be in Zip Format</label>
            <input type="file"  name="document"  accept=“application/pdf,.zip,.rar,.7zip” required/><br>
         <input type="submit" value="Submit"/>
   </form>
  <h5 style="color:rgb(138, 255, 138);"><h3>${requestScope.msg}</h3> </h5> 
 </div>
     
 <footer id="footer">
  <span style="padding:10px;float: right;">&copy;CDAC-DAC-FEB-2020 BATCH NO-40</span>
  </footer>
  </body>
</html>
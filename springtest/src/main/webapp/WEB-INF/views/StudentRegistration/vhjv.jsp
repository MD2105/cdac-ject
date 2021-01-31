<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <link rel="stylesheet" href="/webjars/css/style.css"/> 
     <link rel="stylesheet" href="/webjars/css/footer.css"/>
    <link  rel="stylesheet" href="/webjars/css/signin.css"/>
    <link  rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>

    <title>Student Registration</title>
  </head>
  <body>
  <form class="needs-validation" novalidate>
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">First name</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="First name"  name="student_prn"required>
      <div class="valid-tooltip">
        Looks good!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationTooltip02">Last name</label>
      <input type="text" class="form-control" id="validationTooltip02" placeholder="Last name"  name="student_name"required>
      <div class="valid-tooltip">
        Looks good!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationTooltipUsername">Username</label>
        <input type="text" class="form-control" id="validationTooltipUsername" placeholder="Username" aria-describedby="validationTooltipUsernamePrepend" name="student_email"required>
 
      </div>
    </div>
    <div class="col-md-6 mb-3">
      <label for="validationTooltip03">City</label>
      <input type="text" class="form-control" id="validationTooltip03" placeholder="City" name="student_password" required>
      <div class="invalid-tooltip">
        Please provide a valid city.
      </div>
    </div>
 
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>

   <footer id="footer">
   <span style="padding:10px">@CDAC-DAC-FEB-2020 BATCH NO-40</span>
   </footer>
    
  </body>
</html>
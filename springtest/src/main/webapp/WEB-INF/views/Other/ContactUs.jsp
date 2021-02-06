<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>  
<meta charset="UTF-8">
    <title>Contact Us</title>
    <style>
    hr{
    border-style:dotted none none none;
    width: 5%;
    border-color:blue;
    height: 0px;
    border-width: 5px;
     }
    
    .container{
        padding: 0px 10px 10px 10px;
        width: 95%;
        background:whitesmoke;
        margin: 100px auto;
        display: flex;
        justify-content: center;
        margin-bottom: 0px;
        margin-top: 30px;
    }

    .box{
        width: 250px;
        height: 300px;
        float: left;
        margin: 0px 10px;
        background: skyblue;
        transition: 0.5s;
    }

    .box:hover{
        transform: scale(1.4);
        background: rgb(99, 120, 212);
        box-shadow: 2px 2px 2px 2px;
    }
    img{
        padding-top: 0px;
        padding-left: 40px;
        padding-bottom: 0%;
        padding-right: 40px;
    }
    p{
        padding-left: 40px;
    }
    h5{
        padding-left: 20px;
    }
    .msg{
        padding-left: 40px;
        padding-right: 50px;
        margin-right: 10px;
    }
    .btn{
        background: skyblue;
        justify-content: top;
    }
    </style>
</head>
<body>
    <img src="/webjars/img/1.jpg"/>
    <h2>Contact Us</h2><hr>
    <div class="container">
        <div class="box">
            <p>Mayur kalra</p>
            <img src="/webjars/img/mayur.jpg" height="175" width="110">
            <h5>email@:mayurkalra1332@gmail.com</h5>
            
        </div>
        <div class="box">
         
            <p>Mayank Raj</p>
            <img src="/webjars//img/mayank.jpg" height="175" width="110">
            <h5>email@: mayankraj2106@gmail.com</h5>
        </div>
              <div class="box">
            <p>Manish Doble</p>
            <img src="/webjars/img/manish.jpg" height="175" width="110">
            <h5>email@: manishdoble@hotmail.com</h5>
            
        </div>
        
        <div class="box">
            <p>Sourabh S Bidikar</p>
            <img src="/webjars/img/Sourabh.jpg" height="175" width="110">
            <h5>email@: bidikarsourabh@gmail.com</h5>
           
        </div>
        <div class="box">
            <p>Javed Y Soudagar</p>
            <img src="/webjars/img/javed.jpg" height="175" width="110">
            <h5>email@:javedsaudagar17@gmail.com </h5>
            
        </div>
        <div class="box">
            <p>Shivina Gupta</p> 
            <img src="/webjars/img/shivina.jpg" height="175" width="110">
            <h5>email@:shivinagupta9466@gmail.com</h5>
             
        </div>
  
    </div>
    <div><p>Write to us here:</p></div>
    <div class="msg">
        <form action="mailto:onlineassignmentsystemcdac@gmail.com"  method="POST" enctype="text/plain">
        <textarea  class="msg" name="message" rows="5" cols="50"></textarea>
        <button type="submit" class="btn btn-primary">Send</button>
    </form>
    </div>
</body>

</html>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@page import="java.sql.*" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TechBlog</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<link href="css/myStyle.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
  .banner{
    clip-path: polygon(0% 0%, 75% 0%, 100% 50%, 75% 100%, 0% 100%);
  }
  body{
  overflow:hidden;
  }
</style>
</head>
<body>

<%@include file="navbar.jsp" %> 

 <div class="d-flex align-items-center" style="height:91vh">
   <div class="container-fluid p-2 banner primary-background">
   <div class="row  offset-md-3">
   <div class="col-md-8">
    <div class="card">
      <h5 class="card-header text-center primary-background text-white">Please Login</h5>
      <div class="card-body ">
        <form>
         <div class="mb-3">
            <label for="user_email"  class="form-label"> User Name</label>
            <input type="text" name="user_name" class="form-control" id="user" aria-describedby="emailHelp">
          <!--   <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
          </div>
          
          
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" name="user_email" class="form-control" id="email" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" id="password" class="form-label">Password</label>
            <input type="password" name="user_password" class="form-control" id="exampleInputPassword1">
          </div>
          
          <div class="mb-3">
          <label for="GenderCheck" class="form-label">Gender</label>
          <div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="male" value="male" checked>
  <label class="form-check-label" for="male">
    male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="female" value="female">
  <label class="form-check-label" for="female">
    female
  </label>
</div>
 </div>
          <div class="mb-3 ">
          <div class="form-group">
        <textarea class="form-control" id="about"  name="about" rows="3" placeholder="Describe yourself here..." style="resize:none"></textarea>
        
         </div>
         </div>
          
          
          <div class="mb-3 form-check">
            <input type="checkbox"  name="check"   class="form-check-input" id="check">
            <label class="form-check-label" for="exampleCheck1">Agree terms and condition</label>
          </div>
          <button type="submit" id="subbtn" class="btn primary-background text-white">Submit</button>
        </form>
      </div>
      </div>
      </div>
    </div>
</div>

   </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<script   src="js/register.js" type="text/javascript"></script> 
</body>
</html>
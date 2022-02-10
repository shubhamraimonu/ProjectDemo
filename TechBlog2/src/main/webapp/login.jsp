<%@page import="com.tech.blog.entities.*"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!-- <link href="css/myStyle.css" rel="stylesheet"> -->
<link href="css/login.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
  .banner{
    /* clip-path: polygon(0% 0%, 75% 0%, 100% 50%, 75% 100%, 0% 100%); */
   clip-path: polygon(0 0, 100% 0, 99% 80%, 84% 100%, 27% 94%, 0 99%);
  }
</style>
</head>
<body>

<%@include file="navbar.jsp" %> 

 <div class="d-flex align-items-center "  style="height:70vh">
   <div class="container-fluid p-4  banner primary-background">
   <div class="row  offset-md-4">
   <div class="col-sm-6">
    <div class="card">
      <h5 class="card-header text-center primary-background  text-white">Please Login</h5>
      
     
     <%
          Messages message=(Messages)session.getAttribute("msg");
               if(message!=null){
            	
               
          %>
              <div class="alert  <%= message.getCssClass() %> " role="alert">
     <%= message.getContent() %>
     </div>
   
    <%} 
    session.removeAttribute("msg");
    %>
  
     
      <div class="card-body ">
        <form  id="form" action="Loginservlet" >
          <div class="mb-3">
            <label for="email1" class="form-label">Email address</label>
            <input type="email"   name="email" class="form-control"  id="emails"  aria-describedby="emailHelp"  required>
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
          </div>
          <div class="mb-3">
            <label for="password1" class="form-label">Password</label>
            <input type="password"  name="password" class="form-control"  id="passwords" required>
          </div>
          <div class="mb-3 form-check"  >
             <h5   id="invalid"   class="display-10" ></h5>
          </div>
          <div class="conatainer text-center">
         
          <button type="submit" class="btn  btn-outline-primary">Submit</button>
           </div>
        </form>
      </div>
      </div>
      </div>
    </div>
</div>

   </div>
   



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<!-- <script   src="js/login.js" type="text/javascript"></script> --> 
</body>
</html>
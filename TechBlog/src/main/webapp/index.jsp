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
</style>
</head>
<body>

<%@include file="navbar.jsp" %> 

<div class="container-fluid m-0 p-4 my-0" >
  <div class="jumbotron primary-background p-5 text-white banner">
    <div class="container">
      <h3 class="display-3" >Welcome Bloggers</h3>
      <p class="m-1 p-1">This wesite made for knowledge sharing purpose ,kindly post your knoldege to reach to the other student
      This wesite made for knowledge sharing purpose ,kindly post your knoldege to reach to the 
      This wesite made for knowledge sharing purpose ,kindly post your knoldege to reach to the </br>
       This wesite made for knowledge sharing purpose ,kindly post</br>
       Thanks!!!
      </p>
      <button class="btn primary-background btn-outline-light btn-large"> Start your blogging</button>
      <a href="login.jsp"><button class="btn   btn-outline-light"> Login</button></a>
    </div>
  </div>
</div>

<div class="container m-2">
  <div class="row  p-4 text-white">
    <div class="col-sm-3 m-1 ">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div>

  <div class="col-sm-3 m-1">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div>
  <div class="col-sm-3 m-1">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn  btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div>
  <div class="col-sm-3 m-1">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div>
  <div class="col-sm-3 m-1">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div>
  <div class="col-sm-3 m-1 ">
  <div class="card" style="width: 18rem;">
    <div class="card-body primary-background">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-outline-light primary-background">Go somewhere</a>
    </div>
  </div>
</div> 

</div>



</div>


<!-- <div class="container-fluid m-0 p-0" >
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Fluid jumbotron</h1>
    <p class="lead">This is a modified jumbotron that occupies the entire horizontal space of its parent.</p>
  </div>
</div>
</div> -->




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<script   src="js/myJs.js" type="text/javascript"></script> 
</body>
</html>
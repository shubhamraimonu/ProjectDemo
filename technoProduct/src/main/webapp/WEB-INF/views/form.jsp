<%@page import="com.Entity.Product"%>
<%@page import="org.springframework.ui.Model"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>


   <div  class="container m-3   " >
   
  <%
  String rootPath=request.getContextPath();
  
  Product product=(Product)request.getAttribute("product");

  
  %> 
<%
if(product==null){

%>

   <form   action="<%= rootPath %>/handle_form"  method="post">
   
   <%
   }
   else
   {   
%>
<form   action="<%= rootPath %>/update_form/${product.id}"  method="post">
<%}
%>
   <div  class="container text-center">
      <h2>ADD PRODUCT IN CARD</h2>
      </div>
   <div class="row  p-2">
    <div class="col-md-6 offset-3">
    
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Product Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1"   value="${product.getName() }"   name="name">
    
  </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Description</label>
    <input type="text" class="form-control" id="exampleInputEmail1"   value="${product.getDesc() }"    name="desc">

  </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Price</label>
    <input type="text" class="form-control" id="exampleInputEmail1"    value="${product.getPrice() }"    name="price">
  
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</div>

</form>

</div>
   
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  
  </body>
</html>
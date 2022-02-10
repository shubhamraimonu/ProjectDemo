<%@page import="com.tech.blog.entities.Messages"%>
<%@page import="com.tech.blog.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error_page.jsp"%>

<%
System.out.println("Came into jsp folder");
User user = (User) session.getAttribute("currentUser");
if (user == null) {

	Messages messages = new Messages("Please login to access the page ", "error", "alert-danger");
	session.setAttribute("msg", messages);
	response.sendRedirect("login.jsp");
} else {
	System.out.println("Welcome to the Profile page   " + user.getName());

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<link href="css/myStyle.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<!-- // start of nav -->

	<nav class="navbar navbar-expand-lg navbar-dark primary-background ">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">TechBlog</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Learn Code With Shubham</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle active" href="#"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> Categories </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Programing
									Language</a></li>
							<li><a class="dropdown-item" href="#">Project
									Implementation</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Data structure</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link active" href="#">Contact</a>
					</li>
					<!--   <li class="nav-item">
          <a class="nav-link active" href="login.jsp"> <span class="fa fa-user-circle fa-spin"></span> Login</a>
        </li> -->
					<!--    <li class="nav-item">
          <a class="nav-link active" href="register.jsp"><span class="fa fa-user-plus "></span> SignUp</a>
        </li> -->
				</ul>


				<ul class="navbar-nav me-right mb-2 mb-lg-0  ">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#" data-bs-toggle="modal"
						data-bs-target="#exampleModal"> <span
							class="fa fa-user-circle "></span> <%=user.getName().toUpperCase()%>
					</a></li>

					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="LogoutServlet">LOGOUT</a></li>
				</ul>


				<!-- <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form> -->
			</div>
		</div>
	</nav>

	<!-- end of nav -->



	<!-- Button trigger modal -->
	<!-- <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
  Launch demo modal
</button> -->

	<!-- Modal -->


	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header   primary-background">
					<h5 class="modal-title  " id="exampleModalLabel">TechBlog</h5>
					<!--  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button> -->





				</div>
				<div class="modal-body">

					<div class="container text-center ">
                        
						<img src="pics/<%=user.getProfile()%>" style="max-width: 150px;max-height: 150px;">

					</div>

					<div class="container text-center  mt-2 ">
						<h5 class="modal-title" id="exampleModalLabel"><%=user.getName().toUpperCase()%></h5>
					</div>
					<div id="showModal">
						<div class="container text-center mt-3">

							<table class="table">

								<tbody>
									<tr>

										<th scope="row">ID :</th>
										<td><%=user.getId()%></td>

									</tr>
									<tr>

										<th>Email :</th>
										<td><%=user.getEmail()%></td>

									</tr>
									<tr>

										<th>Gender :</th>

										<td><%=user.getGender()%></td>

									</tr>
									<tr>

										<th>Registed on :</th>
										<td><%=user.getDateTime()%></td>

									</tr>

								</tbody>
							</table>

						</div>
					</div>
					<div id="editProfile" class="container text-center"
						style="display: none">

						<form   method="post" action="EditServlet" enctype="multipart/form-data">
							<table class="table">

								<tbody>
									<tr>

										<th scope="row">ID :</th>
										<td><%=user.getId()%></td>

									</tr>
									<tr>

										<th>Name :</th>
										<td><input type="text" name="user_name"
											class="form-control" value="<%=user.getName() %>">
										</td>

									</tr>
									<tr>

										<th>Email :</th>
										<td><input type="email" name="user_email"
											class="form-control" value="<%=user.getEmail()%>">
										</td>

									</tr>
									<tr>

										<th>Gender :</th>

										<td><input type="text"  name="gender" class="form-control"
											value="<%=user.getGender().toUpperCase()%>"></td>

									</tr>
									<tr>

										<th>About :</th>
										<td><textarea name="about"  class="form-control"
												style="resize: none" rows="4"><%=user.getAbout()%></textarea>
										</td>


									</tr>
									<tr>

										<th>Add new pic:</th>
										<td><input   type="file" name="image" class="form-control"></td>

									</tr>
								</tbody>
							</table>
							<button type="submit" class="btn btn-outline-primary">Save
								Changes</button>
						</form>




					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Close</button>
						<button type="button" id="editButton" class="btn btn-primary">Edit</button>
					</div>
				</div>
			</div>

		</div>
	</div>
	






	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
	<script src="js/profile.js" type="text/javascript"></script>

</body>
</html>
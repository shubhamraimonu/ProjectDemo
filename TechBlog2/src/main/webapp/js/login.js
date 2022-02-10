

console.log("log into ogin js filr")
let form=document.getElementById("form");
form.addEventListener("submit",submitFunc);


function submitFunc(e){
	 e.preventDefault();
	
	console.log("submit function");
	
	let email=document.getElementById("emails").value;
let password=document.getElementById("passwords").value;
	
	


    const xhr=new XMLHttpRequest();

 /*   xhr.open("get","RegisterServlet?user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/
        xhr.open("POST","Loginservlet",true);
       /*xhr.setRequestHeader("Content-Type", "application/json");*/
       /*xhr.setRequestHeader("Content-Type", "multipart/form-data");*/
   xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

 

 xhr.onprogress=function(){
   console.log("progress");
   
 }

   xhr.onload=function () {
	setTimeout(() => {
    console.log("coming here");
if(this.status==200)      
  {
      console.log(this.responseText);
    
	console.log("print");

  
  if(this.responseText.includes("Invalid")){
	console.log("Invalid box");
	 form.reset();
	let invalid=document.getElementById("invalid");
	invalid.innerHTML="! invalid email  or Password";
	
	}
	else{
		console.log("came here");
		window.location="profile.jsp";
	}
/*swal(" registeration Successfully .... we are redirecting to login page")
.then((value) => {
   window.location="login1.jsp";
  window.location="login.jsp";
}
);*/
}
else{
console.log("network problem");
}}, 2000);
	


}

    xhr.send("email="+email+"&password="+password);
  
}
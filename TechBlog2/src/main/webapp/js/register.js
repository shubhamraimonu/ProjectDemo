
	console.log("enter into document");
    let form=document.getElementById("form");
    form.addEventListener("submit",func1);
    /* let form=document.getElementById("form");
    form.addEventListener("submit",func1);*/


/*let gender=document.getElementById("gender");
let gender=document.getElementById("gender");*/


let btn=document.getElementById("subbtn");
 /*e.preventDefault();s*/

 function func1(e){
	e.preventDefault();
	let user_name=document.getElementById("user").value;
	let user_email=document.getElementById("email").value;
let user_password=document.getElementById("password").value;
let gender=document.querySelector('input[name="gender"]:checked').value;
console.log(gender);
let about=document.getElementById("about").value;
let check=document.getElementById("check").checked;

console.log(user_name,user_email,user_password,gender,about,check);
	
	console.log("button pressed");
   
     /*let user=document.getElementById("user").value;
    let check=document.getElementById("check").checked;
    console.log(check);*/
    
/*  let formData=new FormData(this);*/
  /*formData.append("user_name","Suhanakhan");*/
/*
for(let str of  formData.values()){
	console.log(str);
}

for(let str of  formData.keys()){
	console.log(str);
}
/**/



    const xhr=new XMLHttpRequest();

 /*   xhr.open("get","RegisterServlet?user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/
        xhr.open("POST","RegisterServlet",true);
       /*xhr.setRequestHeader("Content-Type", "application/json");*/
       /*xhr.setRequestHeader("Content-Type", "multipart/form-data");*/
   xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
/*
 
  let data={

     user_name : user_name,
	 user_email : user_email,
	user_password : user_password;
	about:about,
	gender:gender,
	about:about
};

  let data1={

     user_name: user_name,
	 user_email: user_email,
	user_password:user_password;
	about:about,
	gender:gender,
	about:about
};
	   */

 xhr.onprogress=function(){
   console.log("prigress");
   btn.style.display="none";
   let refresh=document.getElementById("refresh").style.display="block";
 }

   xhr.onload=function () {
	setTimeout(() => {
    console.log("coming here");
if(this.status==200)      
  {
      console.log(this.responseText);
     /* let user=JSON.parse(this.responseText);
	console.log(user);*/
	console.log("print");
	let refresh=document.getElementById("refresh").style.display="none";
	 btn.style.display="block";
form.reset();
  if(this.responseText.includes("Inserted")){
	console.log(this.responseText.includes("Inserted"));
swal(" registeration Successfully .... we are redirecting to login page")
.then((value) => {
   /*window.location="login1.jsp";*/
  window.location="login.jsp";
});

}
else{
	swal(" Please tr again.... ");
	
}}}, 2000);
	


}
/*xhr.send(formData);*/
    xhr.send("user_name="+user_name+"&check="+check+"&user_email="+user_email+"&gender="+gender+"&about="+about+"&user_password="+user_password);
  /*xhr.send();*/
}


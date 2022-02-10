
	console.log("enter into document");
    let btn=document.getElementById("subbtn");
    btn.addEventListener("click",func1);
     let form=document.getElementById("form");

 function func1(e){
	console.log("button pressed");
    e.preventDefault();
     let user=document.getElementById("user").value;
    let check=document.getElementById("check").checked;
    console.log(check);
    
  let formData=new FormData(form);
    console.log(formData);
 
 console.log(form);
    
  
     

    const xhr=new XMLHttpRequest();

 /*   xhr.open("get","RegisterServlet?user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/
        xhr.open("POST","RegisterServlet");
       xhr.setRequestHeader("Content-Type", "multipart/form-data");
   /*xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');*/

 
  let data={
    check:check,
     name:"shubham",
	 email:"sfdffd@gmail.com",
	gender:"male",
	about:"good are good",
	password:"sadfdfvrrg"
};
	   

 xhr.onprogress=function(){
	console.log(btn);
   console.log("prigress");
   btn.style.display="none";
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
	 btn.style.display="block";
  if(this.responseText.includes("Inserted")){
	console.log(this.responseText.includes("Inserted"));

}}}, 2000);
	


}
xhr.send(formData);
    /*xhr.send("user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/
  /*xhr.send();*/
}


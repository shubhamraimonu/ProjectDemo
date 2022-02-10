
	console.log("enter into document");
    let btn=document.getElementById("subbtn");
    btn.addEventListener("click",func1);

 function func1(e){
	console.log("button pressed");
    e.preventDefault();
     let user=document.getElementById("user").value;
    let check=document.getElementById("check").checked;

    const xhr=new XMLHttpRequest();

    /*xhr.open("get","RegisterServlet?user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/
  xhr.open("POST","RegisterServlet");
  xhr.setRequestHeader("Content-Type", "application/json");
/*xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');*/

let data={
	user_name:"shubham",
	check:"on",
	user_email:"sfdffd@gmail.com",
	gender:"male",
	about:"good are good",
	user_password:"sadfdfvrrg"
	
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
 if(this.responseText.includes("inserted")){
	console.log(this.responseText.includes("inserted"));
	 btn.style.display="block";
}
  }


}, 2000);
	


}
xhr.send(JSON.stringify(data));
    /*xhr.send("user_name=shubham&check=on&user_email=sfdffd@gmail.com&gender=male&about=this is me&user_password=deffffg");*/

}


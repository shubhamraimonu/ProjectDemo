
let editButton=document.getElementById("editButton");
editButton.addEventListener("click",editFunction);
	let flag=true;
function editFunction(){
	console.log("came into edit fucntion");
	

	
	if(flag)
{
	let showmodal=document.getElementById("showModal");
	showmodal.style.display="none";	
	   flag=false;
	editButton.innerHTML="Show";
	let editProfile=document.getElementById("editProfile");
	editProfile.style.display="block";

}
else
{
let showmodal=document.getElementById("showModal");
	showmodal.style.display="block";	
	flag=true;
	
	
	let editProfile=document.getElementById("editProfile");
	editProfile.style.display="none";
	editButton.innerHTML="Edit";
	
}

}
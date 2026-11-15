const form=document.querySelector("form");
form.addEventListener("submit",function(event){
	event.preventDefault();
	let name=document.getElementById("name").value.trim();
	let id=document.getElementById("id").value.trim();
	let email=document.getElementById("email").value.trim();
	let phone=document.getElementById("number").value.trim();
	let age=document.getElementById("age").value.trim();
	let course=document.getElementById("co").value
	
	if(name===""){
		alert("Error:Student name must not be Empty!");
		return;
	}
	if(id===""){
		alert("Error:Student ID must be not be empty!");
		return ;
	}
	if(age==="" || isNaN(age) || age<18 || age>60){
		alert("Error:Age must be betwwen 18 and 60.");
		return;
	}
	
	if(phone==="" || isNaN(phone) || phone.length !==10){
		alert("Error:Phone number must be contain only  numbers ans be 10 digits long");
		return;
	}
	if(course=""){
		alert("Error:cousre must be include!");
		return;
	}
	alert("|Success: Student Registation form submittes successfully!");
	
});
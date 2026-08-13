const form = document.getElementById('myForm');
const password = document.getElementById('password');
const confirmPassword = document.getElementById('confirmPassword');
const message = document.getElementById('message');

form.addEventListener('submit', function(event) {
    event.preventDefault();

    if (password.value !== confirmPassword.value) {
		   

        message.textContent = "Error: Passwords do not match!";
        message.className = "error-msg";
    } else {
        alert("Successfully Submitted!");
        
    }
});
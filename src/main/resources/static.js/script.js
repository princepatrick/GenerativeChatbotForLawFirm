document.addEventListener("DOMContentLoaded", function(){
    console.log("Reach addEventListener")
    const loginForm = document.getElementById("login-form");
    const usernameInput = document.getElementById("username");
    const passwordInput = document.getElementById("password");

    loginForm.addEventListener("submit", function(event){
        event.preventDefault();
        const username = usernameInput.value;
        const password = passwordInput.value;
        authenticate( username, password );
    });

    function authenticate( username , password ){
        console.log("Reached authenticate()")
        authenticationSucceeded = true;

        if( authenticationSucceeded ){
            window.location.href = "/case-list";
        }
    }

});
const loginForm = document.getElementById("loginForm");
const registerForm = document.getElementById("registerForm");
const formContainer = document.getElementById("formContainer");
const formTitle = document.getElementById("formTitle");
const toggleFormLink = document.getElementById("toggleFormLink");

let isLoginForm = true;

function toggleForm() {
  isLoginForm = !isLoginForm;
  if (isLoginForm) {
    loginForm.style.display = "grid";
    registerForm.style.display = "none";
    formContainer.classList.remove("expanded");
    formTitle.textContent = "Iniciar Sesión";
    toggleFormLink.textContent = "¿No tienes una cuenta? Regístrate aquí";
  } else {
    loginForm.style.display = "none";
    registerForm.style.display = "grid";
    formContainer.classList.add("expanded");
    formTitle.textContent = "R E G I S T R O";
    toggleFormLink.textContent = "¿Ya tienes una cuenta? Inicia sesión aquí";
  }
}

toggleFormLink.addEventListener("click", toggleForm);

loginForm.addEventListener("submit", function (e) {
  e.preventDefault();
  
  const username = document.getElementById("loginUsername").value;
  const password = document.getElementById("loginPassword").value;

  fetch("http://localhost:8080/auth/login", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ username, password }),
  })
  .then(response => response.json())
  .then(data => {
    if (data.jwt) {

      sessionStorage.setItem("jwt", data.jwt);
      alert("Inicio de sesión exitoso. JWT almacenado.");
    } else {
      alert("Error en inicio de sesión. Revisa tus credenciales.");
    }
  })
  .catch(error => {
    console.error("Error en la solicitud:", error);
    alert("Ocurrió un error en el inicio de sesión.");
  });
});

registerForm.addEventListener("submit", function (e) {
  e.preventDefault();

  document.querySelectorAll(".error").forEach((el) => (el.textContent = ""));

  const username = document.getElementById("username").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const phoneNumber = document.getElementById("phoneNumber").value;

  fetch("http://localhost:8080/auth/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ username, email, password, firstName, lastName, phoneNumber }),
  })
  .then(response => response.json())
  .then(data => {
    if (data.jwt) {

      sessionStorage.setItem("jwt", data.jwt);
      alert("Registro exitoso. JWT almacenado.");
    } else {
      alert("Error en el registro. Revisa los datos ingresados.");
    }
  })
  .catch(error => {
    console.error("Error en la solicitud:", error);
    alert("Ocurrió un error en el registro.");
  });
});

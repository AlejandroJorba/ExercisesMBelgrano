const nombre = document.getElementById("nombre");
const email = document.getElementById("email");
const edad = document.getElementById("edad");
const btn = document.getElementById("btn");
const resultado = document.getElementById("resultado");

btn.addEventListener('click', (e)=>{
    e.preventDefault();
    if (nombre.value.length < 5 || nombre.value.length > 20){
        resultado.textContent = "El nombre ingresado es incorrecto";
        resultado.classList.add("text-red-500");
    }
    else if (email.value.length < 5 || email.value.includes('@') === false || email.value.includes('.') === false || email.value.includes('yet.com') === true){
        resultado.textContent = "La email ingresado es incorrecto";
        resultado.classList.add("text-red-500");
    }
    else if(Number.isInteger(parseInt(edad.value)) === false){
        resultado.textContent = "La edad ingresada es incorrecta";
        resultado.classList.add("text-red-500");
    }
    else {
        resultado.textContent = "El formulario ha sido enviado correctamente";
        resultado.classList.remove("text-red-500");
        resultado.classList.add("text-green-500");
    }
})
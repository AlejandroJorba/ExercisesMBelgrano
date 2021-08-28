var num1;
var num2;
var operacion;
function calculadora() {
    var display = document.getElementById('display');
    var display2 = document.getElementById('display2');
    const uno = document.getElementById('1');
    const dos = document.getElementById('2');
    const tres = document.getElementById('3');
    const cuatro = document.getElementById('4');
    const cinco = document.getElementById('5');
    const seis = document.getElementById('6');
    const siete = document.getElementById('7');
    const ocho = document.getElementById('8');
    const nueve = document.getElementById('9');
    const cero = document.getElementById('0');
    const div = document.getElementById('/');
    const mult = document.getElementById('*');
    const suma = document.getElementById('+');
    const resta = document.getElementById('-');
    const resultado = document.getElementById('=')
    const clear = document.getElementById('clear')


    uno.addEventListener('click', () => {
        display.textContent = display.textContent + "1"
        

        console.log(display)
    })
    dos.addEventListener('click', () => {
        display.textContent = display.textContent + "2";

    })
    tres.addEventListener('click', () => {
        display.textContent = display.textContent + "3";
    })
    cuatro.addEventListener('click', () => {
        display.textContent = display.textContent + "4";
    })
    cinco.addEventListener('click', () => {
        display.textContent = display.textContent + "5";
    })
    seis.addEventListener('click', () => {
        display.textContent = display.textContent + "6";
    })
    siete.addEventListener('click', () => {
        display.textContent = display.textContent + "7";
    })
    ocho.addEventListener('click', () => {
        display.textContent = display.textContent + "8";
    })
    nueve.addEventListener('click', () => {
        display.textContent = display.textContent + "9";
    })
    cero.addEventListener('click', () => {
        display.textContent = display.textContent + "0";
    })
    clear.addEventListener('click', () => {
        reset();
    })
    div.addEventListener('click', () => {
        num1 = display.textContent;
        operacion = '/'
        display2.textContent = num1 + operacion
        clean()
    })
    mult.addEventListener('click', () => {
        num1 = display.textContent;
        operacion = '*'
        display2.textContent = num1 + operacion
        clean()
    })
    resta.addEventListener('click', () => {
        num1 = display.textContent;
        operacion = '-'
        display2.textContent = num1 + operacion
        clean()
    })
    suma.addEventListener('click', () => {
        num1 = display.textContent;
        operacion = '+'
        display2.textContent = num1 + operacion
        clean()
    })
    resultado.addEventListener('click', () => {
        num2 = display.textContent;
        display2.textContent = display2.textContent + num2

        calcular()


    })
}

//Limpio luego de ingresar un número
function clean(){
    display.textContent = '0'
}

//Calculo dependiendo la operación que se haya clickeado
function calcular() {
    let resultado = 0;
    switch (operacion) {
        case '+':
            resultado = parseInt(num1) + parseInt(num2)
            break;
        case '-':
            resultado = parseInt(num1) - parseInt(num2)
            break;
        case '/':
            resultado = parseInt(num1) / parseInt(num2)
            break;
        case '*':
            resultado = parseInt(num1) * parseInt(num2)
            break;

        default:
            break;
    }
    display.textContent = resultado;
}

//Reseteo la calculadora
function reset() {
    num1 = 0;
    num2 = 0;
    operacion = '';
    display.textContent = '0';
    display2.textContent = '0'
}


calculadora()

//cambio el color 
function dark() {
    const input = document.getElementsByClassName('dark')
    const p = document.getElementsByClassName('d');
    for (var i = 0; i<input.length; i++) {
    input[i].classList.toggle('body');
    }
    for (let i = 0; i < p.length; i++) {
        p[i].classList.toggle('p')
    }
}

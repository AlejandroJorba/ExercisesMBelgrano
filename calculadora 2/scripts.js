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

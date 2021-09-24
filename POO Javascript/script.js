/* Obtención de elementos html */
const h1Cancion = document.getElementById('cancion')
const h1Autor = document.getElementById('autor')
const btnPlay = document.getElementById('play')
const btnPause = document.getElementById('pause')
const btnDetener = document.getElementById('detener')
const audio = document.getElementById('audio')
const gif = document.getElementById('gif')

/* Creación de clase, constructor, atributos y métodos */
class Cancion{
    constructor(nombre, autor, id){
        this.nombre = nombre;
        this.autor = autor;
        this.id = id;
    }

    active(x){
        x.classList.add('bg-white');
        return true;
    }
    inactive(x){
        x.classList.remove('bg-white');
        return true;
    }
    reproducir(){
        audio.play();
    }
    pausar(){
        audio.pause()
    }
    detener(){
        const confirmacion = confirm('Estás seguro que desea parar la canción?')
        if(confirmacion) {
            audio.pause()
            audio.currentTime = 0;
            return true
        }

        else {
            return false}
    }

}

/* Instanciación de clase */
const cancion1 = new Cancion('Yonaguni', 'Bad Bunny', 1);

/* Asignación de autor y canción a los h del html */
h1Cancion.textContent = cancion1.nombre
h1Autor.textContent = cancion1.autor

/* Eventos */
btnPlay.addEventListener('click', ()=> {
    cancion1.reproducir()
    if(cancion1.active(btnPause || btnDetener)){
        cancion1.inactive(btnPause)
        cancion1.inactive(btnDetener)
        cancion1.active(btnPlay)
    }
    audio.addEventListener('ended', () => {
        cancion1.inactive(btnPlay)
    })
})

btnPause.addEventListener('click', ()=> {
    cancion1.pausar()
    if(cancion1.active(btnPlay || btnDetener)){
        cancion1.inactive(btnPlay)
        cancion1.inactive(btnDetener)
        cancion1.active(btnPause)
    }
})

btnDetener.addEventListener('click', ()=>{
    if(cancion1.detener() && cancion1.active(btnPause || btnPlay)){
        cancion1.inactive(btnPlay)
        cancion1.inactive(btnPause)
        cancion1.active(btnDetener)
    }
})

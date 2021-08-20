
function descuentoAutos(){
    descuento = document.getElementById("descuento").checked;    
    marca = document.getElementById("marca").value;
   
    volskwagen = document.getElementById("VW").value;
    crysler = document.getElementById("CR").value;
    ford = document.getElementById("FR").value;
    ferrari = document.getElementById("FE").value;
    seat = document.getElementById("SE").value;
   
    tarjeta = document.getElementById("tarjeta").checked;
    efectivo = document.getElementById("efectivo").checked;  
    cheque = document.getElementById("cheque").checked;

    if (marca == volskwagen) {
        marca = volskwagen;
        valor = 40000;
    }
    else if(marca == crysler){
        marca = crysler;
        valor = 50000;
    }
    else if(marca == ford){
        marca = ford;
        valor = 20000;
    }
    else if(marca == ferrari){
        marca = ferrari;
        valor = 100000;
    }
    else if(marca == seat){
        marca = seat;
        valor = 10000;
    }
    console.log(valor);
    console.log(marca);
if (descuento == true){  
    if(tarjeta == true){
        recargo = valor * 0.10;
        valorFinal = valor + recargo;
        alert(`Pagando con tarjeta tenes un recargo de ${recargo}`);

    }
    else if (efectivo == true){
        descuentoCalculo = valor * 0.15;
        valorFinal = valor - descuentoCalculo;
        alert(`Pagando con efectivo tenes un descuento de ${descuentoCalculo}`);

    }
    else if (cheque == true) {
        descuentoMensaje = "No hay descuentos para pagos con cheque";
        valorFinal = valor;
        alert(`No hay descuentos ni recargos pagando con cheque`);
    }
}  
}


function imprimir(){
    descuentoAutos();
    if(tarjeta == true && descuento == true){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio del auto es de:</b> $${valor} <br> <b>El recargo es de:</b> $${recargo} <br> <b>El precio final es de:</b> $${valorFinal} `)
    }
    else if (efectivo == true && descuento == true){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio del auto es de:</b> $${valor} <br> <b>El descuento es de:</b> $${descuentoCalculo} <br> <b>El precio final es:</b> $${valorFinal} `)

    }
    else if (cheque == true && descuento == true) {
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio final es:</b> $${valorFinal} <br> <b>${descuentoMensaje} <b>`)
    }
    else if(tarjeta == true && descuento == false){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio final es:</b> ${valor} <br> <b>No se ha seleccionado la casilla de descuento</b>`);
    }
    else if(efectivo == true && descuento == false){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio final es:</b> ${valor} <br> <b>No se ha seleccionado la casilla de descuento</b>`);
    }
    else if(cheque == true && descuento == false){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio final es:</b> ${valor} <br> <b>No se ha seleccionado la casilla de descuento</b>`);
    }

}
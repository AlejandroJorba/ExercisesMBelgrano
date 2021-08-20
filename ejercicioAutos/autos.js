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

if(descuento == true){
    
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

    if(tarjeta == true){
        recargo = valor * 0.10;
        valorFinal = valor + recargo;
        alert(`Pagando con tarjeta tenes un recargo de ${recargo}`);

    }
    else if (efectivo == true){
        descuento = valor * 0.15;
        valorFinal = valor - descuento;
        alert(`Pagando con efectivo tenes un descuento de ${descuento}`);

    }
    else {
        descuento = "No hay descuentos para pagos con cheque";
        valorFinal = valor;
        alert(`No hay descuentos ni recargos pagando con cheque`);
    }

}
}

function imprimir(){
    if(tarjeta == true){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio del auto es de:</b> $${valor} <br> <b>El recargo es de:</b> $${recargo} <br> <b>El precio final es de:</b> $${valorFinal} `)
    }
    else if (efectivo == true){
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio del auto es de:</b> $${valor} <br> <b>El descuento es de:</b> $${descuento} <br> <b>El precio final es:</b> $${valorFinal} `)

    }
    else {
        document.write(`<b>Seleccionó la marca:</b> ${marca} <br> <b>El precio final es:</b> $${valorFinal} <br> <b>${descuento} <b>`)
    }
}
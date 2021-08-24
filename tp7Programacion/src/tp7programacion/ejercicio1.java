package tp7programacion;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int dia;
        int mes;
        int anio;
        int resultado = 0;
        int[] meses = new int [12];
        meses[0] = 31;
	meses[1] = 59;
	meses[2] = 90;
	meses[3] = 120;
	meses[4] = 151;
	meses[5] = 181;
	meses[6] = 212;
	meses[7] = 243;
	meses[8] = 273;
	meses[9] = 304;
	meses[10] = 334;
	meses[11] = 365;
 
        
        System.out.println("Ingrese el día");
        dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        mes = scan.nextInt();
        System.out.println("Ingrese el año");
        anio = scan.nextInt();  

        
        if (mes == 1 && dia <= 31){
            resultado = dia;
            System.out.println("Estás en el día " + resultado + " del año " + anio);
        }
        else if(mes > 1 && mes <= 12){
            for (int i = 1; i < mes; i++) {
                resultado = meses[i-1] + dia;
             }
            System.out.println("Estás en el día " + resultado + " y en el año " + anio);
        }
        else {
            System.out.println("El mes ingresado es incorrecto");
        }
    }
    
}

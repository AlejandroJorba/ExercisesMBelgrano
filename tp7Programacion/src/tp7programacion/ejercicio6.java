package tp7programacion;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       int num;
       int bandera = 0;
       
       String repetidor;
       while (bandera == 0){
           int contador = 0;
           System.out.println("-----------");
           System.out.println("Ingrese un número para saber si es o no primo");
           num = scan.nextInt();
           
           for (int i = 1; i <= num; i++) {
               if(num % i == 0){
                   contador++;
               }
           }
           if(contador == 2){
               System.out.println(num + " es un número primo");
           }
           else{
           System.out.println(num + " no es un número primo");
           }
           System.out.println("Desea ingresar otro número? si/no");
           repetidor = scan.next();
            if (repetidor.equalsIgnoreCase("si")) {
                bandera = 0;
            } else {
                bandera = 1;
            }
       }
        
    }
    
}

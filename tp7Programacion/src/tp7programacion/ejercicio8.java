package tp7programacion;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num;
        int contador = 1;
        
        System.out.println("Ingrese un número para saber sus divisores primos");
        num = scan.nextInt();
        System.out.println("Divisores primos");
        if (num % 2 == 0){
            System.out.println("2");
        }
        if(num % 2 != 0){
            contador = 0;
        }
        if (num == 3){
            contador = 1;
        }
        for (int i = 3; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                System.out.println(i);
                contador++;
            }           
        }
        System.out.println("El número " + num + " tiene " + contador + " divisores primos en total.");
    }
    
}

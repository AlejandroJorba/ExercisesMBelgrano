package tp7programacion;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nums;
        int mostrados = 1;
        int num1 = 3;
        
        System.out.println("Ingrese la cantidad de números primos que desea saber");
        nums = scan.nextInt();
        System.out.println("1: 2");
        while(mostrados < nums){
            boolean bandera = true;
            for (int i = 3; i < num1; i++) {
                if(num1 % i == 0){
                    bandera = false;
                }
            }
            if (bandera == true){
                mostrados++;
                System.out.println(mostrados + ": " + num1);
            }
            num1 = num1 + 2;
        }
    }
    
}

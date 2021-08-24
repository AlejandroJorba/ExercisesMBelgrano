package tp7programacion;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        String repetidor;
        int bandera = 0;

        while (bandera == 0) {
            System.out.println("Escriba un número para saber su factorización prima");
            num = scan.nextInt();

            System.out.println("Los factores primos de " + num + " son:");
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    num = num / i;
                    System.out.println(i);
                }
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

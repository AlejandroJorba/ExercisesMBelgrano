package tp7programacion;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int bandera = 0;
        int pares = 0;
        int nulos = 0;
        int impares = 0;
        int resultado = 0;

        while (bandera == 0) {
            System.out.println("Ingrese un número");
            num = scan.nextInt();

            if (num < 0) {
                bandera = 1;
            } else if (num > 0 && resultado == num % 2) {
                pares++;
            } else if (num == 0) {
                nulos++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Cantidad de números nulos: " + nulos);
    }

}


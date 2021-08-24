package tp7programacion;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bandera = 0;
        int num;
        int exp;
        int potencia;
        String repetidor;

        while (bandera == 0) {

            System.out.println("Ingrese el número");
            num = scan.nextInt();
            System.out.println("Ingrese el exponente");
            exp = scan.nextInt();
            int resultado = num;
            if (exp == 0 && num == 0) {
                System.out.println("No puede realizarse la operación");
            } else if (exp == 0 && num > 0) {
                potencia = 1;
                System.out.println("La potencia de " + num + " es " + potencia);
            } else if (exp < 0 && num == 0) {
                System.out.println("No puede realizarse la operación");
            } else {
                for (int i = 1; i < exp; i++) {
                    resultado = resultado * num;
                }
                System.out.println("La potencia es " + resultado);
            }
            System.out.println("-------------------");
            System.out.println("Desea volver a realizar la operación? si/no");
            repetidor = scan.next();
            if (repetidor.equalsIgnoreCase("si")) {
                bandera = 0;
            } else {
                bandera = 1;
            }
        }

    }

}

package tp7programacion;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nums;

        int bandera = 0;
        int num;
        String repetidor;

        while (bandera == 0) {
            int resultado = 0;
            System.out.println("Cuántos números desea ingresar?");
            nums = scan.nextInt();
            System.out.println("Ingrese " + nums + " números para comenzar la suma");

            for (int i = 0; i < nums; i++) {
                num = scan.nextInt();
                resultado = resultado + num;
            }

            System.out.println("La suma total entre los números es de " + resultado);
            System.out.println("Desea volver a empezar? si/no");
            repetidor = scan.next();
            if (repetidor.equalsIgnoreCase("si")) {
                bandera = 0;
            } else {
                bandera = 1;
            }

        }

    }

}

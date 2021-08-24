package tp7programacion;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nums;
        long bandera = 1000000000;
        int num;
        int creciente = 0;
        int num_anterior = 0;
        int num_repetido = 0;
        int num_creciente = 0;
        int suma = 0;
        double promedio;
        System.out.println("Cuántos números desea ingresar?");
        nums = scan.nextInt();

        for (int i = 1; i <= nums; i++) {
            System.out.println("Ingrese un número para la posición " + i);
            num = scan.nextInt();
            if (num > creciente) {
                num_creciente++;
            }
            if (num < bandera) {
                bandera = num;
            }
            if (num == num_anterior) {
                num_repetido++;
            }
            creciente = num;
            num_anterior = num;
            suma = suma + num;
        }
        promedio = suma / nums;
        System.out.println("El valor mínimo es: " + bandera);
        System.out.println("Se ingresaron " + num_repetido + " números repetidos seguidos.");
        System.out.println("La cantidad de números ingresados en forma creciente es de: " + num_creciente);
        System.out.println("El promedio es de: " + promedio);
    }

}


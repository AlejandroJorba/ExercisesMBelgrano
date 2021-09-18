package tp9programacion;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ejercicio6 {

    public static int ingresarNum() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores que desea ingresar."));
        return num;
    }

    public static int[] cargarVector(int num) {
        Random rnd = new Random();
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            int numRandom = (int) (rnd.nextDouble() * 30 - 10);
            vector[i] = numRandom;
            System.out.println(vector[i]);
        }
        JOptionPane.showMessageDialog(null, "Los valores que contiene el vector son:");
        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
        return vector;
    }

    public static void valorMinimo(int[] vector) {
        int min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor mínimo es: " + min);

    }

    public static void valorMaximo(int[] vector) {
        int max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor máximo es: " + max);

    }

    public static void promedio(int[] vector) {
        int suma = 0;
        int cant = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
            cant++;
        }
        int promedio = suma / cant;
        JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es " + promedio);
    }

    public static void salir() {
        JOptionPane.showMessageDialog(null, "Hasta luego");
        System.exit(0);
    }

    public static void main(String[] args) {
        int opcion = 0;
        int num = 0;
        int[] vector = new int[num];
        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1.Ingrese la longitud del vector"
                    + "\n2.Cargar vector"
                    + "\n3.Mostrar valor mínimo"
                    + "\n4.Mostrar valor máximo"
                    + "\n5.Mostrar promedio de todos los números"
                    + "\n6.Salir"));
            switch (opcion) {
                case 1:
                    num = ingresarNum();
                    break;
                case 2:
                    if (num > 0) {
                        vector = cargarVector(num);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se han ingresado valores en el vector");
                    }
                    break;
                case 3:
                    if (vector.length > 0) {
                        valorMinimo(vector);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se han ingresado valores en el vector");
                    }
                    break;
                case 4:
                    if (vector.length > 0) {
                        valorMaximo(vector);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se han ingresado valores en el vector");
                    }
                    break;
                case 5:
                    if (vector.length > 0) {
                        promedio(vector);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se han ingresado valores en el vector");
                    }
                    break;
                case 6:
                    salir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }

    }

}

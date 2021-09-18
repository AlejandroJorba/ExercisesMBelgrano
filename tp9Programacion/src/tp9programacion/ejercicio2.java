package tp9programacion;

import javax.swing.JOptionPane;

public class ejercicio2 {
    
    public static int valores(int[] valores) {
        int longitud = 0;
        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor " + (i + 1));
            valores[i] = Integer.parseInt(valor);
            longitud++;
            if(i>1 && valores[i] == valores[i-1] && valores[i] == valores[i-2]){
                longitud = longitud-1;
                break;
            } 
        }
        return longitud;
    }
        

    public static void sumaNegativa(int[] valores,int longitud) {

        int suma = 0;
        for (int i = 0; i < longitud; i++) {
            if (valores[i] < 0) {
                suma = suma + valores[i];
            }
        }
        if (suma < 0) {
            JOptionPane.showMessageDialog(null,"La suma de valores negativos es " + suma);
        }
        if (suma == 0) {
            JOptionPane.showMessageDialog(null,"No se han ingresado valores negativos para poder realizar la suma");
        }
    }

    public static void cantidadPares(int[] valores, int longitud) {
        int cantidad = 0;
        for (int i = 0; i < longitud; i++) {
            if (valores[i] % 2 == 0 && valores[i] != 0) {
                cantidad++;
            }
        }
        if (cantidad > 0) {
            JOptionPane.showMessageDialog(null,"Se han ingresado " + cantidad + " números pares");
        }
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null,"No se han ingresado valores pares ");
        }
    }

    public static void promedioPositivos(int[] valores, int longitud) {
        int suma = 0;
        int cant = 0;
        int promedio;
        for (int i = 0; i < longitud; i++) {
            if (valores[i] > 0) {
                suma = suma + valores[i];
                cant++;
            }
        }
        if (cant == 0){
         JOptionPane.showMessageDialog(null,"No se han ingresado valores para poder sumar");
        } else{
        promedio = suma / cant;
        JOptionPane.showMessageDialog(null,"El promedio de los valores positivos es " + promedio);
        }
    }

    public static void salir() {
        System.exit(0);
    }

    public static void main(String[] args) {
        int[] valores = new int[300];
        int longitud = 0;
        int opcion = 0;
        while(opcion != 5){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Rellenar vector\n2.Suma negativa\n3.Cantidad pares\n4.Promedio positivos\n5.Salir"));
        switch(opcion){
            case 1: longitud = valores(valores);
            break;
            case 2: sumaNegativa(valores,longitud);
            break;
            case 3: cantidadPares(valores,longitud);
            break;
            case 4: promedioPositivos(valores,longitud);
            break;
            case 5: salir();
            break;
            default: JOptionPane.showInputDialog("Opción no válida");;
        }
        }
    }

}

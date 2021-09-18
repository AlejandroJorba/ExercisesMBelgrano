package tp9programacion;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static int valores(int[] valores) {
        int longitud = 0;
        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor " + (i + 1));
            if (valor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresaste nada");
                break;
            } else if (valor.isEmpty() == false) {
                valores[i] = Integer.parseInt(valor);
                longitud++;
            }
        }
        return longitud;
    }

    public static void valoresIngresados(int[] valores, int longitud) {
        int cant = 0;
        if (longitud == 0) {
            JOptionPane.showMessageDialog(null, "No se han ingresado valores");

        } else {

            for (int i = 0; i < longitud; i++) {
                if (valores[i] != 0) {
                    cant++;
                }
            }

            JOptionPane.showMessageDialog(null, "Cantidad de valores " + cant);
        }
    }

    public static void consecutivos(int[] valores, int longitud) {
        int asc = valores[0];
        int desc = valores[0];
        int contadorAsc = 0;
        int contadorDesc = 0;
        if (longitud == 0) {
            JOptionPane.showMessageDialog(null, "No se han ingresado valores");

        } else {
            for (int i = 0; i < longitud; i++) {
                if (valores[i] > asc) {
                    contadorAsc++;
                } else if (valores[i] < desc) {
                    contadorDesc++;
                }
            }

            JOptionPane.showMessageDialog(null, "La cantidad de números ascendentes es: " + contadorAsc);
            JOptionPane.showMessageDialog(null, "La cantidad de números descendentes es: " + contadorDesc);
        }
    }

    public static void coincidencia(int[] valores, int longitud) {
        int cant = 0;
        if (longitud == 0) {
            JOptionPane.showMessageDialog(null, "No se han ingresado valores");

        } else {
            for (int i = 0; i < longitud; i++) {
                if (valores[i] == i) {
                    cant++;
                }
            }
            if (cant > 1) {
                JOptionPane.showMessageDialog(null, "La cantidad de veces que un valor coincide con el vector es de " + cant + " veces");
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad de veces que un valor coincide con el vector es de " + cant + " vez");

            }
        }
    }

    public static void paresReves(int[] valores, int longitud) {
        if (longitud == 0) {
            JOptionPane.showMessageDialog(null, "No se han ingresado valores");

        } else {
            JOptionPane.showMessageDialog(null, "Los valores pares ingresados son");
            for (int i = longitud - 1; i >= 0; i--) {
                if (valores[i] % 2 == 0) {
                    JOptionPane.showMessageDialog(null, valores[i]);
                }
            }
        }
    }

    public static void salir() {
        System.exit(0);
    }

    public static void main(String[] args) {
        int[] valores = new int[30];
        int opcion = 0;
        int longitud = 0;
        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Rellenar vector\n2.Mostrar cantidad de valores ingresados"
                    + "\n3.Cantidad de valores consecutivos\n4.Mostrar cant. veces coincidencia num con vector\n5.Mostrar pares al revés\n6.Salir"));
            switch (opcion) {
                case 1:
                    longitud = valores(valores);
                    break;
                case 2:
                    valoresIngresados(valores, longitud);
                    break;
                case 3:
                    consecutivos(valores, longitud);
                    break;
                case 4:
                    coincidencia(valores, longitud);
                    break;
                case 5:
                    paresReves(valores, longitud);
                    break;
                case 6:
                    salir();
                default:
                    System.out.println("Opción no válida");
                    ;
            }
        }
    }

}

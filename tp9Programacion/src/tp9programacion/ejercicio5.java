package tp9programacion;

import javax.swing.JOptionPane;

public class ejercicio5 {

    public static int binario(int num) {
        String binario = "";
        while (num > 0) {
            binario = (num % 2) + binario;
            num /= 2;
        }
        return Integer.parseInt(binario);
    }
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del cual desea saber su desarrollo binario"));
        int binario = binario(num);
        JOptionPane.showMessageDialog(null, "El número binario de " + num + " es " + binario);
    }

}

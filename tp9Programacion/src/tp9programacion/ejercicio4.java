package tp9programacion;

import javax.swing.JOptionPane;

public class ejercicio4 {
    
    
    public static void cargarVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            double numRandom = Math.random()*100;
            int numRounded = Math.toIntExact(Math.round(numRandom));
            vector[i] = numRounded;
            System.out.println(vector[i]);
        }
        
    }
    
    public static void verificar(int[] vector){
        int numVerificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para verificar si está en el vector"));
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == numVerificar){
                System.out.println("El número ingresado se encuentra en la posición " + (i+1));
            }
        }
    }
    
    public static void main(String[] args) {
        String cantidad = JOptionPane.showInputDialog("¿Cuántos números desea ingresar?");
        int[] vector = new int[Integer.parseInt(cantidad)];
        cargarVector(vector);
        verificar(vector);
    }
    
}

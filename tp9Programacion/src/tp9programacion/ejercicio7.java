package tp9programacion;

public class ejercicio7 {

    public static void cargarVector(int[] vector){
        System.out.println("Vector sin organizar");
        for (int i = 0; i < vector.length; i++) {
            double numRandom = Math.random()*150-50;
            int randomizado =  (int) Math.round(numRandom);
            vector[i] = randomizado;
            System.out.println(vector[i]);
        }
    }
    
    public static void ordenarVector(int[] vector){
        for (int i = 0; i < (vector.length-1); i++) {
            for (int j = 0; j < (vector.length-1); j++) {
                if(vector[j]>vector[j+1]){
                int aux = vector[j];
                vector[j] = vector[j+1];
                vector[j+1] = aux;
                }
            }
        }
    }
    
    public static void mostrarVector(int[] vector){
        System.out.println("Vector organizado");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        cargarVector(vector);
        ordenarVector(vector);
        mostrarVector(vector);
    }
    
}

package tp9programacion;

public class ejercicio1 {
    
    public static void vector(){
        int[] vector = new int[30];
        int contador = 0;
        int suma = 0;
        for (int i = 0; contador < vector.length; i++) {
            if (i % 2 == 0) {
                {
                    vector[contador] = i;
                    suma = suma + vector[contador];
                    System.out.println((contador+1) + ". Número: " + vector[contador]);
                    contador++;
                    
                }
            }
        }
        System.out.println("La suma total del vector es de " + suma);
    }

    public static void main(String[] args) {

        vector();
    }
}

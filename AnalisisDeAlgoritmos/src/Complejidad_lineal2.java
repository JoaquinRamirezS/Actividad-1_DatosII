public class Complejidad_lineal2 {
    
    public static void main(String[] args) {

        //int large = 10;
        //int large = 100;
        int large = 1000;
        //int large = 10000; // for the array with 10000 elements    
        //int large = 100000; // for the array with 100000 elements
        //int large = 1000000; // for the array with 1000000 elements

        int[] array = WorstCaseArray.generateWostCaseArray(large);
        int target = 65; // 1 is going to be in the last position of the array (wost case)

        long startTime = System.nanoTime(); // Start time
        int count = contarRepeticiones(array, target);
        long endTime = System.nanoTime(); // Stop time

        long duration = (endTime - startTime); // Calculate the duration in nanoseconds
        System.out.println("\nTiempo de ejecución (en nanosegundos): " + duration);
        System.out.println("\nConcurrencia: " + count);
    }

    public static int contarRepeticiones(int[] A, int target) {  // Algoritmo de busqueda de repeticiones secuenciales. Complejidad n
        int i, count; 
        count = 0; 
        for (i = 0; i < A.length; i++) {
            if (A[i] == target){ 
            count += 1; }
            }
        return count; 
        }
        

}

public class Complejidad_lineal {

    public static void main(String[] args) {

        //int large = 10;
        //int large = 100;
        int large = 1000;
        //int large = 10000; // for the array with 10000 elements    
        //int large = 100000; // for the array with 100000 elements
        //int large = 1000000; // for the array with 1000000 elements

        int[] array = WorstCaseArray.generateWostCaseArray(large);
        int target = 1; // 1 is going to be in the last position of the array (wost case)

        long startTime = System.nanoTime(); // Start time
        busquedaSecuencial(array, target);
        long endTime = System.nanoTime(); // Stop time

        long duration = (endTime - startTime); // Calculate the duration in nanoseconds
        System.out.println("\nTiempo de ejecución (en nanosegundos): " + duration);
    }

    public static void busquedaSecuencial(int[] A, int target) {  // Algoritmo de busqueda secuencial. Complejidad n
        int i; 
        for (i = 0; i < A.length; i++) {
            if (A[i] == target){
                return; 
            }
            }
        }
    }


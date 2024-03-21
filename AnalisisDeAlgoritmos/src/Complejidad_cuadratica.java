// Parte del algoritmo tomado de: https://puntocomnoesunlenguaje.blogspot.com/2012/07/metodo-de-ordenacion-burbuja.html

public class Complejidad_cuadratica {

        public static void main(String[] args) {

            int large = 10;
            //int large = 100;
            //int large = 1000;
            //int large = 10000; // for the array with 10000 elements    
            //int large = 100000; // for the array with 100000 elements
            //int large = 1000000; // for the array with 1000000 elements

            int[] array = WorstCaseArray.generateWostCaseArray(large);

            long startTime = System.nanoTime(); // Start time
            burbuja(array);
            long endTime = System.nanoTime(); // Stop time

            long duration = (endTime - startTime); // Calculate the duration in nanoseconds
            System.out.println("\nTiempo de ejecución (en nanosegundos): " + duration);
        }
    
        public static void burbuja(int[] A) {  // Algoritmo de ordenamiento BubbleSort. Complejidad n^2
            int i, j, aux;
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {                                                              
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        }
    }
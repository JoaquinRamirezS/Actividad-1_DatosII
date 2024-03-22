//Tomado De:https://www.geeksforgeeks.org/find-a-permutation-that-causes-worst-case-of-merge-sort/

public class Complejidad_loglineal {

    public static void main(String[] args) {

        //int large = 10;
        //int large = 100;
        //int large = 1000; 
        //int large = 10000;
        int large = 100000;

        // Crear el peor caso de Merge Sort
        //Elementos del arreglo en forma descendente
        int[] array = new int[large];
        for (int i = 0; i < large; i++) {
            array[i] = large - i;
        }

        long startTime = System.nanoTime(); // Start time
        generateWorstCase(array, 0, array.length - 1); // Generate the worst case 
        long endTime = System.nanoTime();  // Finish time

        long duration = (endTime - startTime); // Calculate the duration in nanoseconds

        // Imprimir el tiempo de ejecución en segundos
        System.out.println("\nTiempo de ejecución (en nanosegundos): " + duration);
    }

    // Function to join left and right subarray
    static void join(int arr[], int left[], int right[],
                     int l, int m, int r) {
        int i;
        for (i = 0; i <= m - l; i++)
            arr[i] = left[i];

        for (int j = 0; j < r - m; j++)
            arr[i + j] = right[j];
    }

    // Function to store alternate elements in left
    // and right subarray
    static void split(int arr[], int left[], int right[],
                      int l, int m, int r) {
        for (int i = 0; i <= m - l; i++)
            left[i] = arr[i * 2];

        for (int i = 0; i < r - m; i++)
            right[i] = arr[i * 2 + 1];
    }

    // Function to generate Worst Case of Merge Sort (complexity O(nlogn)
    static void generateWorstCase(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            // create two auxiliary arrays
            int[] left = new int[m - l + 1];
            int[] right = new int[r - m];
            // Store alternate array elements in left
            // and right subarray
            split(arr, left, right, l, m, r);
            // Recurse first and second halves
            generateWorstCase(left, l, m);
            generateWorstCase(right, m + 1, r);
            // join left and right subarray
            join(arr, left, right, l, m, r);
        }
    }
}

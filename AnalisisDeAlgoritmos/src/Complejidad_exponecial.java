//Tomado de:https://shohanur.hashnode.dev/permutations-of-an-array-in-java

public class Complejidad_exponecial {
    public static void main(String[] args) {
        
        //int large = 9;
        //int large = 10;
        //int large = 11;
        //int large = 12;
        int large = 13;

        int[] array = WorstCase.generateWorstCase(large);

        long startTime = System.nanoTime(); // Start time
        ArrayPermutations.generatePermutations(array, 0, array.length - 1);
        long endTime = System.nanoTime(); // Finish time
        long duration = (endTime - startTime); // Calculate the duration in nanoseconds

        System.out.println("\nTiempo de ejecución (en nanosgundos): " + duration);
    }
}

class ArrayPermutations {
    public static void generatePermutations(int[] arr, int left, int right) {
        if (left == right) {
            //printArray(arr);
        } else {
            for (int i = left; i <= right; i++) {
                // swap
                swap(arr, left, i);
                generatePermutations(arr, left + 1, right);
                // backtrack
                swap(arr, left, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class WorstCase {
    public static int[] generateWorstCase(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i; // Llenar el arreglo en orden descendente
        }
        return array;
    }
}

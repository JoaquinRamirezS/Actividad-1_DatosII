public class WorstCaseArray {

    public static int[] generateWostCaseArray(int large) {  //Make the array with the established number of elements.
        int[] array = new int[large];

        for (int i = 0; i < large; i++) {
            array[i] = large - i;  // 
        }

        return array;
    }

    public static void printArray(int[] array) { //Prints it (to verify)
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        int[] array = generateWostCaseArray(10000);
        System.out.println("Arreglo desordenado creado:");
        printArray(array);
    }
}


public class Complejidad_log {
//Worstcasebinarytree
    public static void main(String[] args) {
                        
                //int large = 10;
                //int large = 100;
                //int large = 1000; 
                int large = 10000;
               // int large = 100000;                

                int[] array = WorstCaseArray.generateWorstCaseArray(large);
                long startTime = System.nanoTime(); // Start time

                int key = array[array.length - 1] + 1; 
                int index = binarySearch(array, key, 0, array.length - 1);
                
                long endTime = System.nanoTime();  //Finish time
                long duration = (endTime - startTime); // Calculate the duration in nanoseconds

                if (index == -1) {
                System.out.println("\nTiempo de ejecución (nanosegundos): " + duration);}
    }
        //Visto en clase de Algoritmos y Estructuras de Datos I
        public static int binarySearch(int pArray[], int pKey, int pIndexMin, int pIndexMax) {
                while (pIndexMax >= pIndexMin) {
                    int middle = (int)((pIndexMax + pIndexMin) / 2);
                    if (pArray[middle] < pKey)
                        pIndexMin = middle + 1;
                    else if (pArray[middle] > pKey)
                        pIndexMax = middle - 1;
                    else
                        return middle;
                }
                return -1;
            }
            
        class WorstCaseArray {
                public static int[] generateWorstCaseArray(int size) {
                    int[] worstCaseArray = new int[size];
                    for (int i = 0; i < size; i++) {
                        worstCaseArray[i] = i + 1; // Llenar el arreglo con valores ordenados
                    }
                    return worstCaseArray;
                }
            }
        }

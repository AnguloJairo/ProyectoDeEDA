import java.util.Arrays;

public class QuickSort extends AlgoritmoDeOrdenamientoCasoPromedio {

    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        System.out.println("Inicio del ordenamiento por Quick Sort:");
        quickSort(arreglo, 0, arreglo.length - 1);
        System.out.println("Ordenamiento por Quick Sort finalizado.");
        return arreglo;
    }

    private void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            // Partición del arreglo y obtención del índice del pivote
            int pivotIndex = partition(arreglo, inicio, fin);
            System.out.println("Estado del arreglo después de la partición con pivote en " + pivotIndex + ": " + Arrays.toString(arreglo));

            // Ordenar recursivamente las dos mitades
            quickSort(arreglo, inicio, pivotIndex - 1);
            quickSort(arreglo, pivotIndex + 1, fin);
        }
    }

    private int partition(int[] arreglo, int inicio, int fin) {
        int pivot = arreglo[fin]; // Elegimos el último elemento como pivote
        System.out.println("Usando " + pivot + " como pivote.");

        int i = inicio - 1; // Índice del menor elemento
        for (int j = inicio; j < fin; j++) {
            System.out.println("Comparando: " + arreglo[j] + " con el pivote " + pivot);
            if (arreglo[j] <= pivot) {
                i++;
                // Intercambio
                System.out.println("Intercambiando: " + arreglo[i] + " con " + arreglo[j]);
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Intercambiar el pivote con el elemento siguiente al índice i
        System.out.println("Colocando el pivote en su posición correcta intercambiando " + arreglo[i + 1] + " con " + pivot);
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1; // Retorna el índice del pivote
    }

    public static void main(String[] args) {
        // Ejemplo de uso del algoritmo Quick Sort
        int[] arreglo = {10, 7, 8, 9, 1, 5};
        QuickSort quickSort = new QuickSort();
        int[] resultado = quickSort.ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(resultado));
    }
}

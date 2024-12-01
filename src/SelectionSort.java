import java.util.Arrays;

public class SelectionSort extends AlgoritmoCuadrático {
    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        int n = arreglo.length;
        System.out.println("Inicio del ordenamiento por selección:");
        imprimirArreglo(arreglo);

        for (int i = 0; i < n - 1; i++) {
            // Suponemos que el menor está en la posición i
            int minIdx = i;
            System.out.println("\nPaso " + (i + 1) + ": Buscando el menor desde la posición " + i);

            for (int j = i + 1; j < n; j++) {
                System.out.println("  Comparando: " + arreglo[j] + " con " + arreglo[minIdx]);
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                    System.out.println("  Nuevo menor encontrado en la posición " + minIdx + ": " + arreglo[minIdx]);
                }
            }

            // Si el menor no está en su posición correcta, se realiza el intercambio
            if (minIdx != i) {
                System.out.println("Intercambiando: " + arreglo[i] + " con " + arreglo[minIdx]);
                int temp = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = temp;
            } else {
                System.out.println("No se requiere intercambio, el menor ya está en su posición correcta.");
            }

            // Imprimir el estado actual del arreglo después de cada paso
            System.out.println("Estado actual del arreglo: " + Arrays.toString(arreglo));
        }

        System.out.println("\nOrdenamiento por selección finalizado.");
        imprimirArreglo(arreglo);

        return arreglo;
    }

    // Método auxiliar para imprimir el arreglo
    private void imprimirArreglo(int[] arreglo) {
        System.out.print("Arreglo: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

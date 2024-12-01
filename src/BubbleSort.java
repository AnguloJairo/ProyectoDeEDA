import java.util.Arrays;

public class BubbleSort extends AlgoritmoCuadrático {
    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        int n = arreglo.length;

        System.out.println("Inicio del ordenamiento por burbuja:");

        // Iteración externa para recorrer el arreglo
        for (int i = 0; i < n - 1; ++i) {
            boolean swapped = false; // Verificar si hubo intercambios en esta pasada

            // Comparar pares de elementos adyacentes
            for (int j = 0; j < n - i - 1; ++j) {
                System.out.println("Comparando: " + arreglo[j] + " y " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar si están en el orden incorrecto
                    System.out.println("Intercambiando: " + arreglo[j] + " con " + arreglo[j + 1]);
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    swapped = true;
                }
                // Imprimir el estado actual del arreglo
                System.out.println("Estado actual del arreglo: " + Arrays.toString(arreglo));
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) {
                System.out.println("No se realizaron intercambios en esta pasada. El arreglo está ordenado.");
                break;
            }
        }

        System.out.println("Ordenamiento por burbuja finalizado.");
        imprimirArreglo(arreglo);

        return arreglo;
    }

    // Método auxiliar para imprimir el arreglo final
    private void imprimirArreglo(int[] arreglo) {
        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

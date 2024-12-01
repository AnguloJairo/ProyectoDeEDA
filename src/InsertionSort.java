import java.util.Arrays;

public class InsertionSort extends AlgoritmoCuadrático {
    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        int n = arreglo.length;

        System.out.println("Inicio del ordenamiento por inserción:");
        for (int i = 1; i < n; ++i) {
            int key = arreglo[i];
            System.out.println("\nInsertando " + key + " en la posición correcta.");
            int j = i - 1;

            // Desplazar elementos mayores que el valor actual (key) hacia la derecha
            while (j >= 0 && arreglo[j] > key) {
                System.out.println("  Moviendo: " + arreglo[j] + " a la derecha.");
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            // Colocar el valor actual (key) en su posición correcta
            arreglo[j + 1] = key;
            System.out.println("Insertado " + key + " en la posición " + (j + 1));
            System.out.println("Estado actual del arreglo: " + Arrays.toString(arreglo));
        }

        System.out.println("\nOrdenamiento por inserción finalizado.");
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

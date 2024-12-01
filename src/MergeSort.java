import java.util.Arrays;

public class MergeSort extends AlgoritmoDeOrdenamientoCasoPromedio {

    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        System.out.println("Inicio del ordenamiento por Merge Sort:");
        mergeSort(arreglo, 0, arreglo.length - 1);
        System.out.println("Ordenamiento por Merge Sort finalizado.");
        return arreglo;
    }

    private void mergeSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;

            System.out.println("Dividiendo el arreglo desde " + inicio + " hasta " + fin + " en dos partes:");
            System.out.println("Izquierda: " + Arrays.toString(Arrays.copyOfRange(arreglo, inicio, mitad + 1)));
            System.out.println("Derecha: " + Arrays.toString(Arrays.copyOfRange(arreglo, mitad + 1, fin + 1)));

            // Dividir y conquistar
            mergeSort(arreglo, inicio, mitad);
            mergeSort(arreglo, mitad + 1, fin);

            // Mezclar las mitades ordenadas
            merge(arreglo, inicio, mitad, fin);
        }
    }

    private void merge(int[] arreglo, int inicio, int mitad, int fin) {
        // Tamaño de los subarreglos
        int n1 = mitad - inicio + 1;
        int n2 = fin - mitad;

        // Crear arreglos temporales
        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

        // Copiar los datos a los subarreglos
        System.arraycopy(arreglo, inicio, izquierda, 0, n1);
        System.arraycopy(arreglo, mitad + 1, derecha, 0, n2);

        System.out.println("Mezclando las dos partes:");
        System.out.println("Izquierda: " + Arrays.toString(izquierda));
        System.out.println("Derecha: " + Arrays.toString(derecha));

        // Indices iniciales para las subpartes y el arreglo principal
        int i = 0, j = 0, k = inicio;

        // Mezclar mientras haya elementos en ambos subarreglos
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k] = izquierda[i];
                System.out.println("Colocando " + izquierda[i] + " desde la izquierda en la posición " + k);
                i++;
            } else {
                arreglo[k] = derecha[j];
                System.out.println("Colocando " + derecha[j] + " desde la derecha en la posición " + k);
                j++;
            }
            k++;
        }

        // Copiar elementos restantes de izquierda, si hay alguno
        while (i < n1) {
            arreglo[k] = izquierda[i];
            System.out.println("Colocando " + izquierda[i] + " restante desde la izquierda en la posición " + k);
            i++;
            k++;
        }

        // Copiar elementos restantes de derecha, si hay alguno
        while (j < n2) {
            arreglo[k] = derecha[j];
            System.out.println("Colocando " + derecha[j] + " restante desde la derecha en la posición " + k);
            j++;
            k++;
        }

        System.out.println("Estado actual del arreglo después de mezclar: " + Arrays.toString(Arrays.copyOfRange(arreglo, inicio, fin + 1)));
    }
}


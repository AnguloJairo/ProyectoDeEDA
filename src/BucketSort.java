import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort extends AlgoritmoCuadrático {

    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Paso 1: Encontrar el valor máximo para determinar el rango
        int maxValor = encontrarMaximo(arreglo);
        int bucketCount = arreglo.length;

        System.out.println("\nPaso 1: El valor máximo encontrado es " + maxValor);
        System.out.println("Número de buckets utilizados: " + bucketCount);

        // Paso 2: Crear buckets
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Paso 3: Distribuir elementos en los buckets
        for (int num : arreglo) {
            int bucketIndex = (num * bucketCount) / (maxValor + 1);
            buckets.get(bucketIndex).add(num);
            System.out.println("Se añade el número " + num + " al bucket " + bucketIndex);
        }

        System.out.println("\nPaso 2: Buckets después de distribuir los elementos:");
        imprimirBuckets(buckets);

        // Paso 4: Ordenar cada bucket y juntar los elementos
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets.get(i)); // Ordenar bucket individual
            System.out.println("\nBucket " + i + " después de ordenar: " + buckets.get(i));

            for (int num : buckets.get(i)) {
                arreglo[index++] = num; // Colocar los elementos ordenados en el arreglo original
            }

            System.out.println("Arreglo combinado hasta ahora:");
            imprimirArreglo(arreglo);
        }

        System.out.println("\nArreglo final ordenado:");
        imprimirArreglo(arreglo);

        return arreglo;
    }

    // Método para imprimir el contenido de un arreglo
    private void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para imprimir los buckets
    private void imprimirBuckets(List<List<Integer>> buckets) {
        for (int i = 0; i < buckets.size(); i++) {
            System.out.println("Bucket " + i + ": " + buckets.get(i));
        }
    }

    // Método para encontrar el valor máximo en un arreglo
    private int encontrarMaximo(int[] arreglo) {
        int max = arreglo[0];
        for (int num : arreglo) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}

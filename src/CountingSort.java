import java.util.Arrays;

public class CountingSort extends AlgoritmoCuadrático {
    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        System.out.println("Inicio del ordenamiento por Counting Sort:");

        // Encontrar el valor máximo y mínimo en el arreglo
        int max = Arrays.stream(arreglo).max().getAsInt();
        int min = Arrays.stream(arreglo).min().getAsInt();
        System.out.println("Valor mínimo encontrado: " + min);
        System.out.println("Valor máximo encontrado: " + max);

        // Tamaño del rango de valores
        int range = max - min + 1;

        // Crear el arreglo de conteo
        int[] count = new int[range];
        System.out.println("Arreglo de conteo inicializado: " + Arrays.toString(count));

        // Contar las ocurrencias de cada valor
        for (int num : arreglo) {
            count[num - min]++;
        }
        System.out.println("Arreglo de conteo después de contar las ocurrencias: " + Arrays.toString(count));

        // Acumular los conteos
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        System.out.println("Arreglo de conteo acumulativo: " + Arrays.toString(count));

        // Crear el arreglo de salida
        int[] output = new int[arreglo.length];

        // Construir el arreglo ordenado
        for (int i = arreglo.length - 1; i >= 0; i--) {
            int value = arreglo[i];
            int position = count[value - min] - 1;
            output[position] = value;
            count[value - min]--;
            System.out.println("Insertando " + value + " en la posición " + position);
            System.out.println("Arreglo de salida actual: " + Arrays.toString(output));
        }

        System.out.println("Ordenamiento por Counting Sort finalizado.");
        return output;
    }
}

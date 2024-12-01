import java.util.Arrays;

public class RadixSort extends AlgoritmoCuadrático {

    @Override
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            return new int[0];
        }

        System.out.println("Inicio del ordenamiento por Radix Sort:");

        // Encontrar el valor máximo para saber cuántos dígitos tiene
        int valorMáximo = Arrays.stream(arreglo).max().getAsInt();
        System.out.println("El valor máximo en el arreglo es: " + valorMáximo);

        // Ordenar usando Counting Sort para cada posición del dígito
        for (int exp = 1; valorMáximo / exp > 0; exp *= 10) {
            System.out.println("Ordenando según el dígito en la posición: " + exp);
            arreglo = countingSortPorDígitos(arreglo, exp);
            System.out.println("Estado del arreglo después de ordenar por posición " + exp + ": " + Arrays.toString(arreglo));
        }

        System.out.println("Ordenamiento por Radix Sort finalizado.");
        return arreglo;
    }

    private int[] countingSortPorDígitos(int[] arreglo, int exp) {
        int n = arreglo.length;
        int[] output = new int[n]; // Arreglo de salida
        int[] count = new int[10]; // Hay 10 posibles dígitos (0-9)

        // Contar las ocurrencias de los dígitos según la posición actual
        for (int i = 0; i < n; i++) {
            int digit = (arreglo[i] / exp) % 10;
            count[digit]++;
        }
        System.out.println("Arreglo de conteo inicial para la posición " + exp + ": " + Arrays.toString(count));

        // Convertir el conteo en acumulativo
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        System.out.println("Arreglo de conteo acumulativo para la posición " + exp + ": " + Arrays.toString(count));

        // Construir el arreglo de salida
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arreglo[i] / exp) % 10;
            output[count[digit] - 1] = arreglo[i];
            count[digit]--;
            System.out.println("Colocando " + arreglo[i] + " en la posición " + (count[digit]));
        }

        return output;
    }

}


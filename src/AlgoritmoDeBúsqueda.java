import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public abstract class AlgoritmoDeBúsqueda {
    private int tamaño;

    public void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición [" + (i + 1) + "] :" + arreglo[i]);
        }
    }

    public int[] generarArreglo() {
        int tamaño = 10;
        // Crear un conjunto para evitar números repetidos
        HashSet<Integer> numerosUnicos = new HashSet<>();
        Random random = new Random();
        // Generar números únicos
        while (numerosUnicos.size() < tamaño) {
            int numero = random.nextInt(100); // Generar número entre 0 y 99
            numerosUnicos.add(numero); // Añadir al conjunto (evita duplicados automáticamente)
        }
        // Convertir el conjunto a un arreglo
        int[] arregloNumeros = new int[tamaño];
        int index = 0;
        for (int numero : numerosUnicos) {
            arregloNumeros[index++] = numero; // Llenar el arreglo con los números
        }
        return arregloNumeros; // Retornar el arreglo
    }

    public int[] ingresarArreglo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Ingrese el tamaño del arreglo : ");
        tamaño = sc.nextInt();
        int[] arreglo = new int[tamaño];
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Posición [" + (i + 1) + "] :");
            arreglo[i] = sc.nextInt();
        }
        return arreglo;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return new int[0]; // Si el arreglo está vacío o es nulo
        }
        quickSort(arreglo, 0, arreglo.length - 1);
        return arreglo;
    }

    private void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivotIndex = partition(arreglo, inicio, fin);
            quickSort(arreglo, inicio, pivotIndex - 1); // Ordenar subarreglo izquierdo
            quickSort(arreglo, pivotIndex + 1, fin); // Ordenar subarreglo derecho
        }
    }

    private int partition(int[] arreglo, int inicio, int fin) {
        int pivot = arreglo[fin]; // Elegir el último elemento como pivote
        int i = inicio - 1; // Índice del menor elemento
        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivot) {
                i++;
                // Intercambiar arreglo[i] con arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        // Colocar el pivote en su posición correcta
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;
        return i + 1; // Retornar índice del pivote
    }

    public abstract void buscarElemento(int elemento, int[] arregloOrdenado);
}

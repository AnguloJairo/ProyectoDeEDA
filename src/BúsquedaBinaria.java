public class BúsquedaBinaria extends AlgoritmoDeBúsqueda {
    @Override
    public void buscarElemento(int elemento, int[] arregloOrdenado) {
        if (arregloOrdenado == null || arregloOrdenado.length == 0) {
            System.out.println("El arreglo está vacío o es nulo.");
            throw new IllegalArgumentException("Arreglo vacío o nulo.");
        }

        System.out.println("Iniciando búsqueda binaria...");
        System.out.println("Arreglo ordenado:");
        mostrarArreglo(arregloOrdenado);

        int inicio = 0;
        int fin = arregloOrdenado.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; // Evitar overflow
            System.out.println("Índice medio: " + medio + " (Valor: " + arregloOrdenado[medio] + ")");

            if (arregloOrdenado[medio] == elemento) {
                System.out.println("¡Elemento encontrado en la posición [" + (medio + 1) + "]!");
                return; // Elemento encontrado
            }

            if (arregloOrdenado[medio] < elemento) {
                System.out.println("Buscando en el lado derecho del índice " + medio);
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                System.out.println("Buscando en el lado izquierdo del índice " + medio);
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
        throw new RuntimeException("Elemento no encontrado: " + elemento);
    }
}

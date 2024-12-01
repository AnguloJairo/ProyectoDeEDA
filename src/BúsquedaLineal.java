public class BúsquedaLineal extends AlgoritmoDeBúsqueda {

    @Override
    public void buscarElemento(int elemento, int[] arregloOrdenado) {

        System.out.println("Iniciando búsqueda lineal...");
        System.out.println("Arreglo actual:");
        mostrarArreglo(arregloOrdenado);

        boolean encontrado = false;
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println("Comparando elemento en posición [" + (i + 1) + "] con el valor " + elemento);
            if (arregloOrdenado[i] == elemento) {
                System.out.println("¡Elemento encontrado en la posición [" + (i + 1) + "]!");
                encontrado = true;
                break; // Detener la búsqueda cuando se encuentra el elemento
            }
        }

        if (!encontrado) {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
            // Lanzar una excepción personalizada
            throw new RuntimeException("Elemento no encontrado: " + elemento);
        }
    }
}

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public abstract class AlgoritmoCuadrático {

    private int tamaño;

    public void mostrarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.println("Posición ["+(i+1)+"] :"+arreglo[i]);
        }
    }
    public int[] generarArreglo(){
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
    public int[] ingresarArreglo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Ingrese el tamaño del arreglo : ");
        tamaño = sc.nextInt();
        int [] arreglo = new int[tamaño];
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i=0; i<tamaño; i++){
            System.out.print("Posicion ["+(i+1)+"] :");
            arreglo[i] = sc.nextInt();
        }
        return arreglo;
    }

    public abstract int[] ordenarArreglo(int[] arreglo);
}

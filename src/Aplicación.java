import java.util.Arrays;
import java.util.Scanner;

public class Aplicación {
    public static final String ANSI_RESET = "\u001B[0m";  // Restablece el color
    public static final String ANSI_RED = "\u001B[31m";   // Rojo
    public static final String ANSI_GREEN = "\u001B[32m"; // Verde
    public static final String ANSI_YELLOW = "\u001B[33m";// Amarillo
    public static final String ANSI_BLUE = "\u001B[34m";  // Azul
    public static final String ANSI_PURPLE = "\u001B[35m";// Morado
    public static final String ANSI_CYAN = "\u001B[36m";  // Cyan
    public static void main(String[] args) {
        mostrarMenúDeAlgoritmos();


    }

    private static void mostrarMenúDeAlgoritmos() {
        Scanner sc = new Scanner(System.in);
        int opción;
        System.out.println("\t✭✭✭✭ Menú de Algoritmos ✭✭✭✭");
        System.out.println("---------------------------------------------------------");
        System.out.println("1.- Algoritmos Cuadráticos de Ordenamiento de Peor Caso");
        System.out.println("2.- Algoritmos de Ordenamiento de Caso Promedio o Peor Caso");
        System.out.println("3.- Búsqueda Lineal y Busqueda Binaria");
        System.out.println("4.- Hashing y Resolución de Colisiones");
        System.out.println("5.- Arrays Unidimensionales y Bidimensionales de Tamaño Fijo y Redimensionable");
        System.out.println("---------------------------------------------------------");
        System.out.print("Seleccione una opción : ");
        opción = sc.nextInt();
        System.out.println("---------------------------------------------------------");
        mostrarMenúSecundario(opción);
    }

    private static void mostrarMenúSecundario(int opción) {
        Scanner sc = new Scanner(System.in);
        int opciónsecundaria;
        switch (opción){
            case 1:
                System.out.println("\t✭✭✭✭ Algoritmos Cuadráticos de Ordenamiento de Peor Caso ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("1.1 Bubble Sort");
                System.out.println("1.2 Insertion Sort");
                System.out.println("1.3 Selection Sort");
                System.out.println("1.4 Bucket Sort");
                System.out.println("1.5 Counting Sort");
                System.out.println("1.6 Radix Sort");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione un opción : ");
                opciónsecundaria = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                mostrarMenúParaAlgoritmosCuadraticos(opciónsecundaria);
                break;
                case 2:
                    System.out.println("\t✭✭✭✭ Algoritmos de Ordenamiento Caso Promedio o Peor Caso ✭✭✭✭");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("2.1 Merge Sort");
                    System.out.println("2.2 Quick Sort");
                    System.out.println("---------------------------------------------------------");
                    System.out.print("Seleccione una opción : ");
                    opciónsecundaria = sc.nextInt();
                    System.out.println("---------------------------------------------------------");
                    mostrarMenúDeAlgoritmosCasoPromedio(opciónsecundaria);
                    break;
                    case 3:
                        System.out.println("\t✭✭✭✭ Búsqueda Lineal y Busqueda Binaria ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        System.out.println("3.1 Búsqueda Lineal");
                        System.out.println("3.2 Búsqueda Binaria");
                        System.out.println("---------------------------------------------------------");
                        System.out.print("Selecione una opción :");
                        opciónsecundaria = sc.nextInt();
                        System.out.println("---------------------------------------------------------");
                        mostrarMenúDeBúsquedaLinealYBinaria(opciónsecundaria);
                        break;
                        case 4:
                            System.out.println("\t✭✭✭✭ Hashing y Resolución de Colisiones ✭✭✭✭");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("4.1 Linear Probing");
                            System.out.println("4.2 Quadratic Probing");
                            System.out.println("---------------------------------------------------------");
                            System.out.print("Seleccione una opción : ");
                            opciónsecundaria = sc.nextInt();
                            System.out.println("---------------------------------------------------------");
                            mostrarMenúDeHashingYResoluciónDeColisiones(opciónsecundaria);
                            break;
                            case 5:
                                System.out.println("\t✭✭✭✭ Redimensionamiento de Arrays ✭✭✭✭");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("5.1 Redimensionar Array Unidimensional");
                                System.out.println("5.2 Redimensionar Array Bidimensional");
                                System.out.println("---------------------------------------------------------");
                                System.out.print("Seleccione una opción : ");
                                System.out.println("---------------------------------------------------------");
                                opciónsecundaria = sc.nextInt();
                                mostrarMenúDeRedimensionamientoDeArrays(opciónsecundaria);
                                break;
                                default:

        }

    }

    private static void mostrarMenúDeRedimensionamientoDeArrays(int opciónsecundaria) {
    }

    private static void mostrarMenúDeHashingYResoluciónDeColisiones(int opciónsecundaria) {
        Scanner sc = new Scanner(System.in);
    
        // Mostrar mensaje inicial
        System.out.println("Ubicar números, además la aplicación generará de forma automática un array vacío de tamaño 11.");
        int[] arrayUsuario = new int[11]; // Crear array vacío de tamaño 11
    
        // Solicitar al usuario que ingrese los números
        System.out.println("Por favor, ingrese 11 números enteros únicos entre 0 y 99:");
        for (int i = 0; i < arrayUsuario.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                try {
                    int num = Integer.parseInt(sc.nextLine()); // Leer entrada como cadena y convertir a entero
                    if (num >= 0 && num <= 99 && !contiene(arrayUsuario, num)) {
                        arrayUsuario[i] = num;
                        break; // Salir del bucle si el número es válido
                    } else {
                        System.out.println("Número inválido o repetido. Intente nuevamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                }
            }
        }
    
        System.out.println("Array ingresado: " + Arrays.toString(arrayUsuario));
    
        // Lógica de Linear Probing o Quadratic Probing
        switch (opciónsecundaria) {
            case 1: // Linear Probing
                LinearProbing linearProbing = new LinearProbing(11);
                for (int num : arrayUsuario) {
                    linearProbing.insert(num);
                }
                System.out.println("\nResultado con Linear Probing:");
                linearProbing.display();
                break;
    
            case 2: // Quadratic Probing
                QuadraticProbing quadraticProbing = new QuadraticProbing(11);
                for (int num : arrayUsuario) {
                    quadraticProbing.insert(num);
                }
                System.out.println("\nResultado con Quadratic Probing:");
                quadraticProbing.display();
                break;
    
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    // Método para verificar si un número ya está en el array
    private static boolean contiene(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
    


    private static void mostrarMenúDeBúsquedaLinealYBinaria(int opciónsecundaria) {
        Scanner sc = new Scanner(System.in);
        int opción;
        int [] arreglo;
        int [] arregloOrdenado;
        int elemento;
        switch (opciónsecundaria) {
            case 1:
                BúsquedaLineal algoritmoBúsquedaLineal = new BúsquedaLineal();
                System.out.println("\t✭✭✭✭ Ha seleccionado Busqueda Lineal ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : " + "\n1.- Generar un Arreglo Automatico" + "\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción) {
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBúsquedaLineal.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado=algoritmoBúsquedaLineal.ordenarArreglo(arreglo);
                        algoritmoBúsquedaLineal.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        System.out.print("✭ Ingrese el elemento a buscar : ");
                        elemento=sc.nextInt();
                        algoritmoBúsquedaLineal.buscarElemento(elemento,arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED + "\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭" + ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBúsquedaLineal.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBúsquedaLineal.mostrarArreglo(arreglo);
                        arregloOrdenado = algoritmoBúsquedaLineal.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED + "\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭" + ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBúsquedaLineal.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        System.out.print("✭ Ingrese el elemento a buscar : ");
                        elemento=sc.nextInt();
                        algoritmoBúsquedaLineal.buscarElemento(elemento,arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
            case 2:
                BúsquedaBinaria algoritmoBúsquedaBinaria = new BúsquedaBinaria();
                System.out.println("\t✭✭✭✭ Ha seleccionado Busqueda Binaria ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : " + "\n1.- Generar un Arreglo Automatico" + "\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción) {
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBúsquedaBinaria.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado=algoritmoBúsquedaBinaria.ordenarArreglo(arreglo);
                        algoritmoBúsquedaBinaria.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        System.out.print("✭ Ingrese el elemento a buscar : ");
                        elemento=sc.nextInt();
                        algoritmoBúsquedaBinaria.buscarElemento(elemento,arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED + "\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭" + ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBúsquedaBinaria.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBúsquedaBinaria.mostrarArreglo(arreglo);
                        arregloOrdenado = algoritmoBúsquedaBinaria.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED + "\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭" + ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBúsquedaBinaria.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        System.out.print("✭ Ingrese el elemento a buscar : ");
                        elemento=sc.nextInt();
                        algoritmoBúsquedaBinaria.buscarElemento(elemento,arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
        }
    }

    private static void mostrarMenúDeAlgoritmosCasoPromedio(int opciónsecundaria) {
        Scanner sc = new Scanner(System.in);
        int opción;
        int [] arreglo;
        int [] arregloOrdenado;
        switch (opciónsecundaria){
            case 1:
                MergeSort algoritmoMergeSort =  new MergeSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Merge Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoMergeSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoMergeSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoMergeSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoMergeSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoMergeSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoMergeSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoMergeSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoMergeSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
            case 2:
                QuickSort algoritmoQuickSort =  new QuickSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Quick Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoQuickSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoQuickSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoQuickSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoQuickSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoQuickSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoQuickSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoQuickSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoQuickSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
        }
    }

    private static void mostrarMenúParaAlgoritmosCuadraticos(int opciónsecundaria) {
        Scanner sc = new Scanner(System.in);
        int opción;
        int [] arreglo;
        int [] arregloOrdenado;
        switch (opciónsecundaria){
            case 1:
                BubbleSort algoritmoBubbleSort =  new BubbleSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Bubble Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBubbleSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBubbleSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoBubbleSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBubbleSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBubbleSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBubbleSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoBubbleSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBubbleSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
                case 2:
                    InsertionSort algoritmoInertionSort =  new InsertionSort();
                    System.out.println("\t✭✭✭✭ Ha seleccionado Insertion Sort ✭✭✭✭");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                    System.out.println("---------------------------------------------------------");
                    System.out.print("Seleccione una opción : ");
                    opción = sc.nextInt();
                    System.out.println("---------------------------------------------------------");
                    switch (opción){
                        case 1:
                            System.out.println("---------------------------------------------------------");
                            arreglo = algoritmoInertionSort.generarArreglo();
                            System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                            System.out.println("---------------------------------------------------------");
                            algoritmoInertionSort.mostrarArreglo(arreglo);
                            System.out.println("---------------------------------------------------------");
                            System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                            System.out.println("---------------------------------------------------------");
                            arregloOrdenado = algoritmoInertionSort.ordenarArreglo(arreglo);
                            System.out.println("---------------------------------------------------------");
                            System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                            System.out.println("---------------------------------------------------------");
                            algoritmoInertionSort.mostrarArreglo(arregloOrdenado);
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------------------------------");
                            System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                            System.out.println("---------------------------------------------------------");
                            arreglo = algoritmoInertionSort.ingresarArreglo();
                            System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                            System.out.println("---------------------------------------------------------");
                            algoritmoInertionSort.mostrarArreglo(arreglo);
                            System.out.println("---------------------------------------------------------");
                            System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                            System.out.println("---------------------------------------------------------");
                            arregloOrdenado = algoritmoInertionSort.ordenarArreglo(arreglo);
                            System.out.println("---------------------------------------------------------");
                            System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                            System.out.println("---------------------------------------------------------");
                            algoritmoInertionSort.mostrarArreglo(arregloOrdenado);
                            System.out.println("---------------------------------------------------------");
                            break;
                    }
                    break;
            case 3 :
                SelectionSort algoritmoSelectionSort =  new SelectionSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Selection Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoSelectionSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoSelectionSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoSelectionSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoSelectionSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoSelectionSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoSelectionSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoSelectionSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoSelectionSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
            case 4 :
                BucketSort algoritmoBucketSort =  new BucketSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Bucket Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBucketSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBucketSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoBucketSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBucketSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoBucketSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoBucketSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoBucketSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoBucketSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
            case 5:
                CountingSort algoritmoCountingSort =  new CountingSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Counting Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoCountingSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoCountingSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoCountingSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoCountingSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoCountingSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoCountingSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoCountingSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoCountingSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
            case 6 :
                RadixSort algoritmoRadixSort =  new RadixSort();
                System.out.println("\t✭✭✭✭ Ha seleccionado Counting Sort ✭✭✭✭");
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea : "+"\n1.- Generar un Arreglo Automatico"+"\n2.- Ingresar Arreglo ");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seleccione una opción : ");
                opción = sc.nextInt();
                System.out.println("---------------------------------------------------------");
                switch (opción){
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoRadixSort.generarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoRadixSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoRadixSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoRadixSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Ingreso de Arreglo ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        arreglo = algoritmoRadixSort.ingresarArreglo();
                        System.out.println("\t✭✭✭✭ Arreglo Creado ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        algoritmoRadixSort.mostrarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println("\t✭✭✭✭ Algoritmo de Ordenamiento ✭✭✭✭");
                        System.out.println("---------------------------------------------------------");
                        arregloOrdenado = algoritmoRadixSort.ordenarArreglo(arreglo);
                        System.out.println("---------------------------------------------------------");
                        System.out.println(ANSI_RED+"\t✭✭✭✭ Arreglo Ordenado ✭✭✭✭"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------");
                        algoritmoRadixSort.mostrarArreglo(arregloOrdenado);
                        System.out.println("---------------------------------------------------------");
                        break;
                }
                break;
        }
    }
}
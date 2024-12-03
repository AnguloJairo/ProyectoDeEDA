import java.util.Arrays;

public class QuadraticProbing {
    private int[] hashTable;
    private int size;

    public QuadraticProbing(int size) {
        this.size = size;
        hashTable = new int[size];
        Arrays.fill(hashTable, -1); // Inicializa con -1 indicando celdas vacías
    }

    public void insert(int key) {
        int hash = key % size; // Cálculo del índice inicial
        int i = 0; // Contador de colisiones
        while (hashTable[(hash + i * i) % size] != -1) { // Resolución cuadrática
            i++;
            if (i == size) { // Evitar bucles infinitos
                System.out.println("Error: Tabla llena, no se pudo insertar " + key);
                return;
            }
        }
        hashTable[(hash + i * i) % size] = key; // Insertar valor
    }

    public void display() {
        System.out.println("Tabla Hash: " + Arrays.toString(hashTable));
    }
}

import java.util.Arrays;

public class LinearProbing {
    private int[] hashTable;
    private int size;

    public LinearProbing(int size) {
        this.size = size;
        hashTable = new int[size];
        Arrays.fill(hashTable, -1); // -1 indica celda vacía
    }

    public void insert(int key) {
        int hash = key % size;
        while (hashTable[hash] != -1) {
            hash = (hash + 1) % size; // Resolución lineal
        }
        hashTable[hash] = key;
    }

    public void display() {
        System.out.println(Arrays.toString(hashTable));
    }
}

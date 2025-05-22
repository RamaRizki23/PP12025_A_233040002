package Pertemuan9.Latihan3;

public class StrukturStack {

    private int[] array;
    private int capacity;
    private int top;

    // Mengecek apakah stack kosong
public boolean isEmpty() {
    return top() == -1;
}

// Mengecek apakah stack penuh
public boolean isFull() {
    return top == capacity - 1;
}

// Mengembalikan ukuran stack
public int size() {
    return top + 1;
}

// Mengembalikan elemen paling atas
public int top() {
    if (!isEmpty()) {
        return array[top];
    }
    return -1;
}

}
